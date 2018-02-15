/**
 * This class passes data between different filters.
 * 
 * @author drewjohnson
 * @since 2-14-18
 */
import java.util.*;
      
public class Pipe 
{
    private Queue<String> data;
    
    public Pipe()
    {
        this.data = new LinkedList();
    }
    
    public void pull(Queue<String> data)
    {
        this.data = new LinkedList(data);
    }
    
    public Queue<String> push()
    {
        return this.data;
    }
}
