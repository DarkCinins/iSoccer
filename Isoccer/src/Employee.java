public abstract class Employee
{
    private long cpf;
    private long phone;
    private float salary;
    private String name;
    private String email;

    public Employee(String name, String email, long cpf, long phone, float salary)
    {
        this.cpf = cpf;
        this.phone = phone;
        this.salary = salary;
        this.name = name;
        this.email = email;
    }
    public long getCpf()
    {
        return this.cpf;
    }

    public long getPhone()
    {
        return this.phone;
    }

    public float getSalary()
    {
        return this.salary;
    }

    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
}
