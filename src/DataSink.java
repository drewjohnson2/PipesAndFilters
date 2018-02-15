import java.util.*;

public class DataSink 
{
    Queue<String> data;
    
    public DataSink(Pipe pipe)
    {
        this.data = pipe.push();
        write();
    }
    
    public void write()
    {
        for(String s : data)
        {
            System.out.println(s);
        }
    }
}
