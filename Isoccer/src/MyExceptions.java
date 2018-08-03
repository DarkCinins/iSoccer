public class MyExceptions
{
    public void errorTwo(int option)
    {
        if(option > 2 || option < 1) System.out.printf("Opção Inválida.%n%n");
    }
    public void errorFive(int option)
    {
        if(option > 5 || option < 1) System.out.printf("Opção Inválida.%n%n");
    }
    public void errorNine(int option)
    {
        if(option > 9 || option < 1) System.out.printf("Opção Inválida.%n%n");
    }
}
