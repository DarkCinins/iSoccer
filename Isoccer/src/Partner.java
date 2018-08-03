public class Partner
{
    private String name;
    private String email;
    private long cpf;
    private long phone;
    private String address;
    private float contribution;
    private boolean compliance;

    public Partner(String name, String email, long cpf, long phone, String address, float contribution, boolean compliance)
    {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.contribution = contribution;
        this.compliance = compliance;
    }

    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public long getCpf()
    {
        return this.cpf;
    }
    public long getPhone()
    {
        return this.phone;
    }
    public String getAddress()
    {
        return this.address;
    }
    public float getContribution()
    {
        return this.contribution;
    }
    public boolean getCompliance()
    {
        return compliance;
    }
}
