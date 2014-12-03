/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BO.Student;
import DAL.Interfaces.IDaStudent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 11640
 */
 class DaStudent implements IDaStudent{

    @Override
    public void opslaan(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verwijderen(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> allesOphalen() {
       List<Student> studenten = new ArrayList<>();
       Student s = new Student("Tom", 1);
       studenten.add(s);
       return studenten;
    }

    @Override
    public Student ophalen(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
