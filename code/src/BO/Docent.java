/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import Infrastructure.BO.IPersistable;
import DAL.DaFactory;

import DAL.Interfaces.IDaDocent;
import java.util.List;

/**
 *
 * @author 11640
 */
public class Docent implements IPersistable<Docent>{

    private IDaDocent da;
    
    private String naam;
   private int ID;
    
    
    

    public Docent() {
        this.da = DaFactory.CreateDaDocent();
    }

    
    
    @Override
    public void save() {
       da.opslaan(this);
    }

    @Override
    public void delete() {
        da.verwijderen(this.getID());
    }

    @Override
    public List<Docent> GetAll() {
        return da.allesOphalen();
    }

    @Override
    public Docent Get(int ID) {
        return da.ophalen(ID);
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }
    
}
