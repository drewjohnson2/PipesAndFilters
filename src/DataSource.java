import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class DataSource 
{
    BufferedReader in;
    Queue<String> dataInput;
    String hold;
    
    public DataSource(Pipe pipe)
    {
        
        try
        {
            in = new BufferedReader(new FileReader("/Users/drewjohnson/desktop/hey.txt"));
            dataInput = new LinkedList();
        
            while((hold = in.readLine()) != null)
            {
                dataInput.add(hold);
            }
            
            push(pipe);
        } 
        catch(FileNotFoundException ex1)
        {
            System.out.println(ex1);
            System.exit(1);
        }
        catch(IOException ex2)
        {
            System.out.println(ex2);
            System.exit(1);
        }
    }
    
    public void push(Pipe pipe)
    {
        pipe.pull(dataInput);
    }
}
