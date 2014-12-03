/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MockObjects;

import BO.Lokaal;
import BO.Module;
import BO.Student;
import DAL.Interfaces.IDaModule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 11640
 */
public class DAModuleMock implements IDaModule {

    @Override
    public void opslaan(Module s) {
        
    }

    @Override
    public void verwijderen(int ID) {
       
    }

    @Override
    public List<Module> allesOphalen() {
       List<Module> lijstModules = new ArrayList<>();
       Module m = new Module(1,"Wiskunde",new Lokaal());
       lijstModules.add(m);
       return lijstModules;
    }

    @Override
    public Module ophalen(int Id) {
        Module m = new Module(1,"Wiskunde",new Lokaal());
        return m;
    }

    @Override
    public List<Student> GetIngeschrevenStudenten(int moduleId) {
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
       
    }

    @Override
    public void StudentToevoegenAanWachtrij(int studentID, int ModuleID) {
       
    }
    
}
