/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drewjohnson
 */
public class RotateFilterTest 
{

    @Test
    public void testRotate() throws IOException 
    {
        Pipe pipe = new Pipe();
        DataSource source = new DataSource(pipe);
        RotateFilter filter = new RotateFilter(pipe);
        
        filter.buildData();
    
    }
    
}
