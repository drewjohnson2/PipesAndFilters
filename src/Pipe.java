import java.util.*;
        
/**
 *
 * @author drewjohnson
 */
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
