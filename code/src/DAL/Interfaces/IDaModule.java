/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Interfaces;

import BO.Module;
import BO.Student;
import java.util.List;

/**
 *
 * @author 11640
 */
public interface IDaModule {
     void opslaan(Module s);
    void verwijderen (int ID );
    List<Module> allesOphalen();
    Module ophalen(int Id);
    List<Student> GetIngeschrevenStudenten(int moduleId);
    List<Student> GetWachtrijStudenten(int moduleID);
    void StudentInschrijven(int studentId, int moduleID);
    void StudentUitschrijven(int studentID, int moduleID);
    void StudentToevoegenAanWachtrij(int studentID, int ModuleID);
}
