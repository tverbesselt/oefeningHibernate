/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BO.Docent;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class DaDocentTest {
    
    public DaDocentTest() {
    }

    @Test
    public void testOpslaan() {
        System.out.println("opslaan");
        Docent s = null;
        DaDocent instance = new DaDocent();
        instance.opslaan(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVerwijderen() {
        System.out.println("verwijderen");
        int ID = 0;
        DaDocent instance = new DaDocent();
        instance.verwijderen(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAllesOphalen() {
        System.out.println("allesOphalen");
        DaDocent instance = new DaDocent();
        List<Docent> expResult = null;
        List<Docent> result = instance.allesOphalen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testOphalen() {
        System.out.println("ophalen");
        int Id = 0;
        DaDocent instance = new DaDocent();
        Docent expResult = null;
        Docent result = instance.ophalen(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
