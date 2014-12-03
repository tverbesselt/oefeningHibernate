/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO.Services;

import BO.Interfaces.IModuleService;
import BO.Module;
import DAL.DaFactory;

import DAL.Interfaces.IDaModule;

/**
 *
 * @author 11640
 */
public class ModuleService implements IModuleService {

    @Override
    public boolean ModuleVolzet(int Id) {
       IDaModule da = DaFactory.CreateDaModule();
       int aantalinschrijvingen = (da.GetIngeschrevenStudenten(Id)).size();
       Module m = da.ophalen(Id);
       int max = m.getLokaal().getAantalPersonen();
       return max <=aantalinschrijvingen;
      
    }

    @Override
    public void StudentInschrijven(int studID, int modID) {
         IDaModule da = DaFactory.CreateDaModule();
         da.StudentInschrijven(studID, modID);
    }

    @Override
    public void StudentInschrijvenInWachtrij(int studID, int modID) {
        IDaModule da = DaFactory.CreateDaModule();
        da.StudentToevoegenAanWachtrij(studID, modID);
    }
    
}
