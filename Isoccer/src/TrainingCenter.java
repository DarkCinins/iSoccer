public class TrainingCenter extends Resources
{
    private long bedrooms;

    public TrainingCenter(boolean availability, long bedrooms)
    {
        super(availability);
        this.bedrooms = bedrooms;
    }
    public boolean getAvailability()
    {
        return super.getAvailability();
    }
    public long getBedrooms()
    {
        return this.bedrooms;
    }
}
