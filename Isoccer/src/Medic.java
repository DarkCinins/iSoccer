public class Medic extends Employee
{
    private long crm;

    public Medic(String name, String email, long cpf, long phone, float salary, long crm)
    {
        super(name, email, cpf, phone, salary);
        this.crm = crm;
    }

    public long getCrm()
    {
        return crm;
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
