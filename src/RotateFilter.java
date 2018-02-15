import java.util.*;

public class RotateFilter 
{
    private Queue<String> data;
    private Queue<String> mutatedData;
    private String hold;
    private String [] holdArr;
    private Pipe pipe;
    private int size;
    
    public RotateFilter(Pipe pipe)
    {
        mutatedData = new LinkedList();
        this.data = pipe.push();
        size = data.size();
        this.pipe = pipe;
        buildData();
    }
    
    public void buildData()
    {
        for(int i = 0; i < size; i++)
        {
            mutatedData.add(data.peek());
            holdArr = data.remove().split(" ");
            
            for(int j = 0; j < holdArr.length - 1; j++)
            {
                hold = rotate(holdArr);
                mutatedData.add(hold);
            }
        }
        
        push(pipe);
        
    }
    
    public String rotate(String [] holdArr)
    {
        int i;
        
        String holder = holdArr[0];
        
        for(i = 0; i < holdArr.length - 1; i++)
        {
            holdArr[i] = holdArr[i + 1];
        }
        
        holdArr[i] = holder;
        
        holder = String.join(" ", holdArr);
        
        return holder;
       
    }
    
    public void push(Pipe pipe)
    {
        pipe.pull(mutatedData);
    }
}
