import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus
{
    private String[] login = new String[2];

    private static int tryingCatchInt()
    {
        int option;
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                option = input.nextInt();
                return option;
            }
            catch(InputMismatchException e)
            {
                System.out.printf("Digite apenas números.%n%n");
                input.nextLine();
            }
        }
    }

    public long tryingCatchLong()
    {
        long option;
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                option = input.nextLong();
                return option;
            }
            catch(InputMismatchException e)
            {
                System.out.printf("Digite apenas números inteiros.%n%n");
                input.nextLine();
            }
        }
    }

    private static float tryingCatchFloat()
    {
        float option;
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                option = input.nextFloat();
                return option;
            }
            catch(InputMismatchException e)
            {
                System.out.printf("Digite apenas números.%n%n");
                input.nextLine();
            }
        }
    }

    public int loginMenu()
    {
        this.login[0] = "adm";
        this.login[1] = "123";
        System.out.println("Bem Vindo ao iSoccer!");
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
        return tryingCatchInt();
    }

    public boolean login()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu usuário:");
        String user = input.nextLine();
        System.out.println("Digite sua senha:");
        String password = input.nextLine();
        if(this.login[0].equals(user) && this.login[1].equals(password)) return true;
        System.out.printf("Usuário e/ou senha incorretos.%n%n");
        return false;
    }

    public int mainMenu()
    {
        System.out.println("1 - Adicionar Funcionários");
        System.out.println("2 - Relatório de Funcionários");
        System.out.println("3 - Adicionar Sócios");
        System.out.println("4 - Relatório de Sócios");
        System.out.println("5 - Editar Contribuição Mínima por Tipo de Sócio");
        System.out.println("6 - Adicionar Recursos");
        System.out.println("7 - Relatório de Recursos");
        System.out.println("8 - Relatório Geral");
        System.out.println("9 - Sair");
        return tryingCatchInt();
    }

    public int addEmployeeMenu()
    {
        System.out.println("Selecione um tipo de funcionário para adicionar:");
        System.out.println("1 - Presidente");
        System.out.println("2 - Médico");
        System.out.println("3 - Técnico");
        System.out.println("4 - Preparador Físico");
        System.out.println("5 - Motorista");
        System.out.println("6 - Cozinheiro");
        System.out.println("7 - Advogado");
        System.out.println("8 - Jogador");
        System.out.println("9 - Voltar");
        return tryingCatchInt();
    }

    public void showPattern(ArrayList<Employee> employees, int i, String string)
    {
        System.out.println("Nome: " + employees.get(i).getName());
        System.out.println("Função: " + string);
        System.out.println("Email: " + employees.get(i).getEmail());
        System.out.println("CPF: " + employees.get(i).getCpf());
        System.out.println("Telefone: " + employees.get(i).getPhone());
        System.out.println("Salário: " + employees.get(i).getSalary());
    }

    public President addPresident()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Presidente");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        return new President(name, email, cpf, phone, salary);
    }

    public void showPresident(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof President)
            {
                showPattern(employees,i,"Presidente");
                System.out.println();
            }
        }
    }

    public Medic addMedic()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Médico");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        System.out.println("Digite o CRM:");
        long crm = tryingCatchLong();
        return new Medic(name, email, cpf, phone, salary, crm);
    }

    public void showMedic(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Medic)
            {
                showPattern(employees,i,"Médico");
                System.out.printf("CRM: " + ((Medic) employees.get(i)).getCrm() + "%n%n");
            }
        }
    }

    public Technical addTechnical()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Técnico");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        return new Technical(name, email, cpf, phone, salary);
    }

    public void showTechnical(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Technical)
            {
                showPattern(employees,i,"Técnico");
                System.out.println();
            }
        }
    }

    public PersonalTrainer addPersonalTrainer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Preparador Físico");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        return new PersonalTrainer(name, email, cpf, phone, salary);
    }

    public void showPersonalTrainer(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof PersonalTrainer)
            {
                showPattern(employees,i,"Preparador Físico");
                System.out.println();
            }
        }
    }

    public Driver addDriver()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Motorista");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        System.out.println("Digite o Número de Habilitação:");
        long enrollmentNumber = tryingCatchLong();
        return new Driver(name, email, cpf, phone, salary, enrollmentNumber);
    }

    public void showDriver(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Driver)
            {
                showPattern(employees,i,"Motorista");
                System.out.printf("Habilitação: " + ((Driver) employees.get(i)).getEnrollmentNumber() + "%n%n");
            }
        }
    }

    public Cooker addCooker()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Cozinheiro");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        return new Cooker(name, email, cpf, phone, salary);
    }

    public void showCooker(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Cooker)
            {
                showPattern(employees,i,"Cozinheiro");
                System.out.println();
            }
        }
    }

    public Lawyer addLawyer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Advogado");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        return new Lawyer(name, email, cpf, phone, salary);
    }

    public void showLawyer(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Cooker)
            {
                showPattern(employees,i,"Advogado");
                System.out.println();
            }
        }
    }

    private int positionMenu()
    {
        while(true)
        {
            System.out.println("Posição do jogador:");
            System.out.println("1 - Volante");
            System.out.println("2 - Zagueiro");
            System.out.println("3 - Meia");
            System.out.println("4 - Goleiro");
            System.out.println("5 - Atacante");
            System.out.println("6 - Lateral Esquerdo");
            System.out.println("7 - Lateral Direito");
            int option = tryingCatchInt();
            if(option > 7 || option < 1) System.out.printf("Opção Inválida.%n%n");
            else return option;
        }
    }

    private boolean injuredMenu()
    {
        while(true)
        {
            System.out.println("O jogador está apto para jogar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int option = tryingCatchInt();
            if(option > 2 || option < 1) System.out.printf("Opção Inválida.%n%n");
            else
            {
                if(option == 1) return false;
                else return true;
            }
        }
    }

    public Player addPlayer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o Jogador");
        System.out.println("Digite o Nome:");
        String name = input.nextLine();
        System.out.println("Digite o Email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o Telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o Salário:");
        float salary = tryingCatchFloat();
        return new Player(name, email, cpf, phone, salary, positionMenu(), injuredMenu());
    }

    public void showPlayer(ArrayList<Employee> employees)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Player)
            {
                showPattern(employees,i,"Jogador");
                System.out.println("Posição: " + ((Player) employees.get(i)).getPosition());
                if(((Player) employees.get(i)).isInjured())
                {
                    System.out.printf("Inapto para jogar: Jogador no departamento médico.%n%n");
                }
                else System.out.printf("Apto para jogar.%n%n");
            }
        }
    }

    public void showPlayerInjured(ArrayList<Employee> employees, boolean check)
    {
        int i;
        for(i = 0; i < employees.size(); i++)
        {
            if(employees.get(i) instanceof Player && ((Player) employees.get(i)).isInjured() == check)
            {
                showPattern(employees,i,"Jogador");
                System.out.println("Posição: " + ((Player) employees.get(i)).getPosition());
                if(((Player) employees.get(i)).isInjured())
                {
                    System.out.printf("Inapto para jogar: Jogador no departamento médico.%n%n");
                }
                else System.out.printf("Apto para jogar.%n%n");
            }
        }
    }

    public int reportMenu()
    {
        System.out.println("1 - Time");
        System.out.println("2 - Serviços Gerais");
        System.out.println("3 - Jogadores Aptos");
        System.out.println("4 - Jogadores Inaptos");
        System.out.println("5 - Voltar");
        return tryingCatchInt();
    }

    private boolean complianceMenu()
    {
        while(true)
        {
            System.out.println("Ele está adimplente?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int option = tryingCatchInt();
            if(option > 2 || option < 1) System.out.println("Opção Inválida");
            if(option == 1) return true;
            else return false;
        }
    }

    public Partner addPartner()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sobre o novo Sócio");
        System.out.println("Digite o nome:");
        String name = input.nextLine();
        System.out.println("Digite o email:");
        String email = input.nextLine();
        System.out.println("Digite o CPF:");
        long cpf = tryingCatchLong();
        System.out.println("Digite o telefone:");
        long phone = tryingCatchLong();
        System.out.println("Digite o endereço:");
        String address = input.nextLine();
        System.out.println("Digite o valor de contribuição:");
        float conttribution = tryingCatchFloat();
        return new Partner(name, email, cpf, phone, address, conttribution, complianceMenu());
    }

    public void showPartners(ArrayList<Partner> partners, long junior, long elite)
    {
        int i;
        System.out.println("Quantidade de sócios: " + partners.size());
        for(i = 0; i < partners.size(); i++)
        {
            System.out.println("Nome: " + partners.get(i).getName());
            System.out.print("Status: ");
            if(partners.get(i).getCompliance()) System.out.println("Adimplente");
            else System.out.println("Inadimplente");
            System.out.println("Email: " + partners.get(i).getEmail());
            System.out.println("CPF: " + partners.get(i).getCpf());
            System.out.println("Telefone: " + partners.get(i).getPhone());
            System.out.println("Endereço: " + partners.get(i).getAddress());
            System.out.print("Categoria: ");
            if(partners.get(i).getContribution() <= junior) System.out.println("Júnior");
            if(partners.get(i).getContribution() > junior && partners.get(i).getContribution() < elite)
            {
                System.out.println("Sênior");
            }
            if(partners.get(i).getContribution() >= elite) System.out.println("Elite");
            System.out.printf("Contribuição: " + partners.get(i).getContribution() + "%n%n");
        }
    }

    public int resourcesMenu()
    {
        do
        {
            System.out.println("1 - Adicionar Ônibus");
            System.out.println("2 - Adicionar Estádio");
            System.out.println("3 - Adicionar Centro de Treinamento");
            System.out.println("4 - Voltar");
            int option = tryingCatchInt();
            if(option > 4 || option < 1) System.out.println("Opção Inválida.");
            else return option;
        }while(true);
    }

    public Bus addBus()
    {
        while(true)
        {
            System.out.println("O ônibus a ser adicionado está disponível?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int option = tryingCatchInt();
            if(option > 2 || option < 1) System.out.println("Opção Inválida.");
            else
            {
                if(option == 1) return new Bus(true);
                else return new Bus(false);
            }
        }
    }

    public void showBus(ArrayList<Resources> resources)
    {
        int i, available = 0, unavailable = 0;
        for(i = 0; i < resources.size(); i++)
        {
            if(resources.get(i) instanceof Bus)
            {
                if(resources.get(i).getAvailability()) available++;
                else unavailable++;
            }
        }
        System.out.println(available + " ônibus disponíveis.");
        System.out.printf(unavailable + " ônibus indisponíveis.%n%n");
    }

    public Stadium addStadium()
    {
        System.out.println("Sobre o estádio");
        System.out.println("Digite a quantidade de lugares disponíveis:");
        long places = tryingCatchLong();
        System.out.println("Digite a quantidade de banheiros disponíveis:");
        long bathrooms = tryingCatchLong();
        System.out.println("Digite a quantidade de lanchonetes disponíveis:");
        long snackBars = tryingCatchLong();
        while(true)
        {
            System.out.println("O estádio a ser adicionado está disponível?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int option = tryingCatchInt();
            if(option > 2 || option < 1) System.out.println("Opção Inválida.");
            else
            {
                if(option == 1) return new Stadium(true, places, bathrooms, snackBars);
                else return new Stadium(false, places, bathrooms, snackBars);
            }
        }
    }

    public void showStadium(ArrayList<Resources> resources)
    {
        int i;
        for(i = 0; i < resources.size(); i++)
        {
            if(resources.get(i) instanceof Stadium)
            {
                if(resources.get(i).getAvailability())
                {
                    System.out.print("Estádio disponível com " + ((Stadium) resources.get(i)).getPlaces() + " lugares, ");
                    System.out.print(((Stadium) resources.get(i)).getBathrooms() + " banheiros e ");
                    System.out.println(((Stadium) resources.get(i)).getSnackBars() + " restaurantes.");
                }
                else
                {
                    System.out.print("Estádio indisponível com " + ((Stadium) resources.get(i)).getPlaces() + " lugares, ");
                    System.out.print(((Stadium) resources.get(i)).getBathrooms() + " banheiros e ");
                    System.out.println(((Stadium) resources.get(i)).getSnackBars() + " restaurantes.");
                }
            }
        }
    }

    public TrainingCenter addTrainingCenter()
    {
        System.out.println("Quantos dormitórios existem nesse centro de treinamento?");
        long bedrooms = tryingCatchLong();
        while(true)
        {
            System.out.println("O centro de treinamento a ser adicionado está disponível?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int option = tryingCatchInt();
            if(option > 2 || option < 1) System.out.println("Opção Inválida.");
            else
            {
                if(option == 1) return new TrainingCenter(true, bedrooms);
                else return new TrainingCenter(false, bedrooms);
            }
        }
    }

    public void showTrainingCenter(ArrayList<Resources> resources)
    {
        int i;
        for(i = 0; i < resources.size(); i++)
        {
            if(resources.get(i) instanceof TrainingCenter)
            {
                if(resources.get(i).getAvailability())
                {
                    System.out.print("Centro de Treinamento disponível com ");
                    System.out.println(((TrainingCenter) resources.get(i)).getBedrooms() + " dormitórios.");
                }
                else
                {
                    System.out.print("Centro de Treinamento indisponível com ");
                    System.out.println(((TrainingCenter) resources.get(i)).getBedrooms() + " dormitórios.");
                }
            }
        }
    }

}
