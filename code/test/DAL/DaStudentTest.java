/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BO.Student;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class DaStudentTest {
    
    public DaStudentTest() {
    }

    @Test
    public void testOpslaan() {
        System.out.println("opslaan");
        Student s = null;
        DaStudent instance = new DaStudent();
        instance.opslaan(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVerwijderen() {
        System.out.println("verwijderen");
        int ID = 0;
        DaStudent instance = new DaStudent();
        instance.verwijderen(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAllesOphalen() {
        System.out.println("allesOphalen");
        DaStudent instance = new DaStudent();
        List<Student> expResult = null;
        List<Student> result = instance.allesOphalen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testOphalen() {
        System.out.println("ophalen");
        int Id = 0;
        DaStudent instance = new DaStudent();
        Student expResult = null;
        Student result = instance.ophalen(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
