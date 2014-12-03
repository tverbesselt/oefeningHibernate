/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BO.Module;
import BO.Student;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class DaModuleTest {
    
    public DaModuleTest() {
    }

    @Test
    public void testOpslaan() {
        System.out.println("opslaan");
        Module s = null;
        DaModule instance = new DaModule();
        instance.opslaan(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVerwijderen() {
        System.out.println("verwijderen");
        int ID = 0;
        DaModule instance = new DaModule();
        instance.verwijderen(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAllesOphalen() {
        System.out.println("allesOphalen");
        DaModule instance = new DaModule();
        List<Module> expResult = null;
        List<Module> result = instance.allesOphalen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testOphalen() {
        System.out.println("ophalen");
        int Id = 0;
        DaModule instance = new DaModule();
        Module expResult = null;
        Module result = instance.ophalen(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetIngeschrevenStudenten() {
        System.out.println("GetIngeschrevenStudenten");
        int Id = 0;
        DaModule instance = new DaModule();
        List<Student> expResult = null;
        List<Student> result = instance.GetIngeschrevenStudenten(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWachtrijStudenten() {
        System.out.println("GetWachtrijStudenten");
        int moduleID = 0;
        DaModule instance = new DaModule();
        List<Student> expResult = null;
        List<Student> result = instance.GetWachtrijStudenten(moduleID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testStudentInschrijven() {
        System.out.println("StudentInschrijven");
        int studentId = 0;
        int moduleID = 0;
        DaModule instance = new DaModule();
        instance.StudentInschrijven(studentId, moduleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testStudentUitschrijven() {
        System.out.println("StudentUitschrijven");
        int studentID = 0;
        int moduleID = 0;
        DaModule instance = new DaModule();
        instance.StudentUitschrijven(studentID, moduleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testStudentToevoegenAanWachtrij() {
        System.out.println("StudentToevoegenAanWachtrij");
        int studentID = 0;
        int ModuleID = 0;
        DaModule instance = new DaModule();
        instance.StudentToevoegenAanWachtrij(studentID, ModuleID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
