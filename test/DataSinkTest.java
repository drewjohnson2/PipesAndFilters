/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drewjohnson
 */
public class DataSinkTest {
    
    @Test
    public void testWrite() throws IOException 
    {
        Pipe pipe = new Pipe();
        DataSource source = new DataSource(pipe);
        RotateFilter filter1 = new RotateFilter(pipe);
        DataSink sink = new DataSink(pipe);
      
    }
    
}
