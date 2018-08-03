public class Technical extends Employee
{
    public Technical(String name, String email, long cpf, long phone, float salary)
    {
        super(name, email, cpf, phone, salary);
    }

    @Override
    public String getName()
    {
        return super.getName();
    }
    @Override
    public String getEmail()
    {
        return super.getEmail();
    }
    @Override
    public long getCpf()
    {
        return super.getCpf();
    }
    @Override
    public long getPhone()
    {
        return super.getPhone();
    }
    @Override
    public float getSalary()
    {
        return super.getSalary();
    }
}
