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
public class DataSourceTest {

    @Test
    public void testSomeMethod() throws IOException
    {
        Pipe pipe = new Pipe();
        DataSource dataSource = new DataSource(pipe);
        int i = 0;
        for(String s : dataSource.dataInput)
        {
            System.out.println(s + " " + i++);
        }
    }
    
}
