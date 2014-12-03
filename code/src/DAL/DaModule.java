/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BO.Module;
import BO.Student;
import DAL.Interfaces.IDaModule;
import java.util.List;

/**
 *
 * @author 11640
 */
 class DaModule implements IDaModule{

     String selectAllSQL = "SELECT * FROM tbl_cursussen";
    String selectByIDSQL = "SELECT * FROM tbl_cursussen WHERE ID=?";
    String deleteByIDSQL = "DELETE FROM tbl_cursussen WHERE ID=?";
    String insertSQL = "INSERT INTO tbl_cursussen (cursusId,LokaalID,docentnaam) VALUES (?,?,?)";
    String updateSQL = "UPDATE tbl_cursussen SET cursusId=?, LokaalID=?,docentnaam=? WHERE ID=?";
    String ingeschrevenCursistenSQL = "SELECT tbl_studenten.Id, tbl_studenten.email, tbl_studenten.naam FROM tbl_studenten INNER JOIN tbl_inschrijvingen ON tbl_studenten.ID=tbl_inschrijvingen.cursistID WHERE tbl_inschrijvingen.moduleID=?"; 
    String inschrijvenStudentSQL = "INSERT INTO tbl_inschrijvingen (cursistID,moduleID, wachtrij) VALUES (?,?,0)";
    String uitschrijvenStudentSQL = "DELETE FROM tbl_inschrijvingen WHERE cursistID=? AND moduleID=?";
    String inWachtrijzettenSQL = "INSERT INTO tbl_inschrijvingen (cursistID,moduleID, wachtrij) VALUES (?,?,1)";

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void opslaan(Module s) {
       
    }

    @Override
    public void verwijderen(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Module> allesOphalen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Module ophalen(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> GetIngeschrevenStudenten(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> GetWachtrijStudenten(int moduleID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void StudentInschrijven(int studentId, int moduleID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void StudentUitschrijven(int studentID, int moduleID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void StudentToevoegenAanWachtrij(int studentID, int ModuleID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
