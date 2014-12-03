/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BO.Lokaal;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class DaLokaalTest {
    
    public DaLokaalTest() {
    }

    @Test
    public void testOpslaan() {
        System.out.println("opslaan");
        Lokaal l = null;
        DaLokaal instance = new DaLokaal();
        instance.opslaan(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVerwijderen() {
        System.out.println("verwijderen");
        int ID = 0;
        DaLokaal instance = new DaLokaal();
        instance.verwijderen(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAllesOphalen() {
        System.out.println("allesOphalen");
        DaLokaal instance = new DaLokaal();
        List<Lokaal> result = instance.allesOphalen();
        assertFalse(result.isEmpty());
    }

    @Test
    public void testOphalen() {
        System.out.println("ophalen");
        int Id = 0;
        DaLokaal instance = new DaLokaal();
        Lokaal expResult = null;
        Lokaal result = instance.ophalen(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAantalCursistenInLokaalOphalen() {
        System.out.println("AantalCursistenInLokaalOphalen");
        int lokaalID = 0;
        DaLokaal instance = new DaLokaal();
        int expResult = 0;
        int result = instance.AantalCursistenInLokaalOphalen(lokaalID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
