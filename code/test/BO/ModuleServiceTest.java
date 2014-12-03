/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import BO.Services.ModuleService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class ModuleServiceTest {

    public ModuleServiceTest() {
    }

    @Test
    public void testModuleVolzet() {
        System.out.println("ModuleVolzet");
        int Id = 1;
        ModuleService instance = new ModuleService();
        boolean expResult = false;
        boolean result = instance.ModuleVolzet(Id);
        assertEquals(expResult, result);

    }

    @Test
    public void testStudentInschrijven() {
        System.out.println("StudentInschrijven");
        int studID = 1;
        int modID = 2;
        ModuleService instance = new ModuleService();
        try {

            instance.StudentInschrijven(studID, modID);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    public void testStudentInschrijvenInWachtrij() {
        System.out.println("StudentInschrijvenInWachtrij");
        int studID = 0;
        int modID = 0;
        ModuleService instance = new ModuleService();
        instance.StudentInschrijvenInWachtrij(studID, modID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
