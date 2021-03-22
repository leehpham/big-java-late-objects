public class StopWatch
{
    private long startTime;
    private long endTime;

    public StopWatch()
    {
        startTime = 0;
        endTime = 0;
    }

    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    public long stop()
    {
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}