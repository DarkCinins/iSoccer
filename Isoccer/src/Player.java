public class Player extends Employee
{
    private Position position;
    private boolean injured;
    public Player(String name, String email, long cpf, long phone, float salary, int playerType, boolean injured)
    {
        super(name, email, cpf, phone, salary);
        this.injured = injured;
        switch(playerType)
        {
            case 1:
                this.position = Position.Volante;
                break;
            case 2:
                this.position = Position.Zagueiro;
                break;
            case 3:
                this.position = Position.Meia;
                break;
            case 4:
                this.position = Position.Goleiro;
                break;
            case 5:
                this.position = Position.Atacante;
                break;
            case 6:
                this.position = Position.LateralEsquerdo;
                break;
            case 7:
                this.position = Position.LateralDireito;
                break;
        }
    }
    public Position getPosition()
    {
        return this.position;
    }
    public boolean isInjured()
    {
        return this.injured;
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
