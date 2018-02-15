/**
 * This class outputs the mutated data for the user to see.
 * 
 * @author Drew Johnson
 * @since 2-14-18
 */
import java.util.*;

public class DataSink 
{
    Queue<String> data;
    int size;
    
    public DataSink(Pipe pipe)
    {
        this.data = pipe.push();
        size = data.size();
        write();
    }
    
    public void write()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(data.remove());
        }
    }
}
