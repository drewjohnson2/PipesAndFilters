/**
 * This program implements pipes and filters.
 * 
 * 
 * @author drew johnson/david babb
 * @since 2-14-18
 * 
 */
public class Main 
{
    public static void main(String [] args)
    {
        Pipe pipe = new Pipe();
        DataSource source = new DataSource(pipe);
        RotateFilter filter1 = new RotateFilter(pipe);
        DataSink sink = new DataSink(pipe);
    }
}
