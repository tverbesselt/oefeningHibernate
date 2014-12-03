/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import BO.Services.StudentService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11640
 */
public class StudentServiceTest {
    
    public StudentServiceTest() {
    }

    @Test
    public void testStudentVerwittigen() {
        System.out.println("StudentVerwittigen");
        int ID = 0;
        String bericht = "";
        String Titel = "";
        StudentService instance = new StudentService();
        try{
        instance.StudentVerwittigen(ID, bericht, Titel);
        }
        catch(Exception ex)
        {
            fail(ex.getMessage());
        }
      }
    
}
