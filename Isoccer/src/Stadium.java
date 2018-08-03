public class Stadium extends Resources
{
    private long places;
    private long bathrooms;
    private long snackBars;

    public Stadium(boolean availability, long places, long bathrooms, long snackBars)
    {
        super(availability);
        this.places = places;
        this.bathrooms = bathrooms;
        this.snackBars = snackBars;
    }
    public boolean getAvailability()
    {
        return super.getAvailability();
    }
    public long getBathrooms()
    {
        return bathrooms;
    }
    public long getPlaces()
    {
        return places;
    }
    public long getSnackBars()
    {
        return snackBars;
    }
}
