public class Driver extends Employee
{
    private long enrollmentNumber;
    public Driver(String name, String email, long cpf, long phone, float salary, long enrollmentNumber)
    {
        super(name, email, cpf, phone, salary);
        this.enrollmentNumber = enrollmentNumber;
    }
    public long getEnrollmentNumber()
    {
        return this.enrollmentNumber;
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
