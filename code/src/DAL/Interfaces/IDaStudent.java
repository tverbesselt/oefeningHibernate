/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Interfaces;

import BO.Student;
import java.util.List;

/**
 *
 * @author 11640
 */
public interface IDaStudent {
    void opslaan(Student s);
    void verwijderen (int ID );
    List<Student> allesOphalen();
    Student ophalen(int Id);
}
