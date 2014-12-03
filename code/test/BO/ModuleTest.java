/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import DAL.Interfaces.IDaModule;
import MockObjects.DAModuleMock;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class ModuleTest {
    
    public ModuleTest() {
    }

    @Test
    public void testGetIngeschrevenStudenten() {
        System.out.println("getIngeschrevenStudenten");
        Module instance = new Module(0, "frans", new Lokaal(), new DAModuleMock());
        List<Student> expResult = null;
        List<Student> result = instance.getIngeschrevenStudenten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetIngeschrevenStudenten() {
        System.out.println("setIngeschrevenStudenten");
        List<Student> IngeschrevenStudenten = null;
        Module instance = new Module();
        instance.setIngeschrevenStudenten(IngeschrevenStudenten);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        Module instance = new Module();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNaam() {
        System.out.println("getNaam");
        Module instance = new Module();
        String expResult = "";
        String result = instance.getNaam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNaam() {
        System.out.println("setNaam");
        String naam = "";
        Module instance = new Module();
        instance.setNaam(naam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLokaal() {
        System.out.println("getLokaal");
        Module instance = new Module();
        Lokaal expResult = null;
        Lokaal result = instance.getLokaal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLokaal() {
        System.out.println("setLokaal");
        Lokaal lokaal = null;
        Module instance = new Module();
        instance.setLokaal(lokaal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWachtrij() {
        System.out.println("getWachtrij");
        Module instance = new Module();
        List<Student> expResult = null;
        List<Student> result = instance.getWachtrij();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetWachtrij() {
        System.out.println("setWachtrij");
        List<Student> Wachtrij = null;
        Module instance = new Module();
        instance.setWachtrij(Wachtrij);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDaModule() {
        System.out.println("getDaModule");
        Module instance = new Module();
        IDaModule expResult = null;
        IDaModule result = instance.getDaModule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save");
        Module instance = new Module();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Module instance = new Module();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAll() {
        System.out.println("GetAll");
        Module instance = new Module();
        List<Module> expResult = null;
        List<Module> result = instance.GetAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGet() {
        System.out.println("Get");
        int ID = 0;
        Module instance = new Module();
        Module expResult = null;
        Module result = instance.Get(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
