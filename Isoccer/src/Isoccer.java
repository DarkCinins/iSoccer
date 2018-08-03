import java.util.ArrayList;

public class Isoccer
{
    public static void main(String[] args)
    {
        int option;
        long junior = 1000, elite = 2000;
        Menus menu = new Menus();
        MyExceptions exceptions = new MyExceptions();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Partner> partners = new ArrayList<>();
        ArrayList<Resources> resources = new ArrayList<>();
        do
        {
            option = menu.loginMenu();
            exceptions.errorTwo(option);
            if(option == 1)
            {
                if(menu.login())
                {
                    do
                    {
                        option = menu.mainMenu();
                        exceptions.errorNine(option);
                        switch(option)
                        {
                            case 1:
                                do
                                {
                                    option = menu.addEmployeeMenu();
                                    exceptions.errorNine(option);
                                    switch(option)
                                    {
                                        case 1:
                                            employees.add(menu.addPresident());
                                            break;
                                        case 2:
                                            employees.add(menu.addMedic());
                                            break;
                                        case 3:
                                            employees.add(menu.addTechnical());
                                            break;
                                        case 4:
                                            employees.add(menu.addPersonalTrainer());
                                            break;
                                        case 5:
                                            employees.add(menu.addDriver());
                                            break;
                                        case 6:
                                            employees.add(menu.addCooker());
                                            break;
                                        case 7:
                                            employees.add(menu.addLawyer());
                                            break;
                                        case 8:
                                            employees.add(menu.addPlayer());
                                            break;
                                    }
                                }while(option != 9);
                                option = 8;
                                break;
                            case 2:
                                if(employees.size() == 0) System.out.printf("Não há funcionários.%n%n");
                                else
                                {
                                    do
                                    {
                                        option = menu.reportMenu();
                                        exceptions.errorFive(option);
                                        switch(option)
                                        {
                                            case 1:
                                                menu.showTechnical(employees);
                                                menu.showPlayer(employees);
                                                break;
                                            case 2:
                                                menu.showPresident(employees);
                                                menu.showMedic(employees);
                                                menu.showPersonalTrainer(employees);
                                                menu.showDriver(employees);
                                                menu.showCooker(employees);
                                                menu.showLawyer(employees);
                                                break;
                                            case 3:
                                                menu.showPlayerInjured(employees,false);
                                                break;
                                            case 4:
                                                menu.showPlayerInjured(employees,true);
                                                break;
                                        }
                                    }while(option != 5);
                                }
                                break;
                            case 3:
                                partners.add(menu.addPartner());
                                break;
                            case 4:
                                menu.showPartners(partners, junior, elite);
                                break;
                            case 5:
                                System.out.println("Digite o valor mínimo da contribuição Sênior:");
                                junior = menu.tryingCatchLong();
                                System.out.println("Digite o valor mínimo da contribuição Elite:");
                                while(option != 6)
                                {
                                    long trying = menu.tryingCatchLong();
                                    if(trying > junior)
                                    {
                                        option = 6;
                                        elite = trying;
                                    }
                                    else System.out.println("O valor para Elite deve ser maior do que o Sênior.");
                                }
                                break;
                            case 6:
                                option = menu.resourcesMenu();
                                switch(option)
                                {
                                    case 1:
                                        resources.add(menu.addBus());
                                        break;
                                    case 2:
                                        resources.add(menu.addStadium());
                                        break;
                                    case 3:
                                        resources.add(menu.addTrainingCenter());
                                        break;
                                }
                                break;
                            case 7:
                                menu.showBus(resources);
                                menu.showStadium(resources);
                                menu.showTrainingCenter(resources);
                                break;
                            case 8:
                                menu.showPresident(employees);
                                menu.showMedic(employees);
                                menu.showPersonalTrainer(employees);
                                menu.showDriver(employees);
                                menu.showCooker(employees);
                                menu.showLawyer(employees);
                                menu.showTechnical(employees);
                                menu.showPlayer(employees);
                                menu.showPartners(partners, junior, elite);
                                menu.showBus(resources);
                                menu.showStadium(resources);
                                menu.showTrainingCenter(resources);
                                break;
                        }
                    }while(option != 9);
                }
            }
        }while(option != 2);
    }
}
