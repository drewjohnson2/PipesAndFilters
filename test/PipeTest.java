/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drewjohnson
 */
public class PipeTest {

    @Test
    public void testPull() 
    {
        Pipe pipe = new Pipe();
        Queue<String> q1 = new LinkedList();
        Queue<String> q2;
        
        q1.add("Hello");
        
        pipe.pull(q1);
        
        q2 = new LinkedList(pipe.push());
        
        assertEquals(q1.remove(), q2.remove());
        
    }
    
}
