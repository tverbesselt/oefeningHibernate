/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import Infrastructure.BO.IPersistable;
import DAL.DaFactory;

import DAL.Interfaces.IDaLokaal;
import java.util.List;

/**
 *
 * @author 11640
 */
public class Lokaal implements IPersistable<Lokaal>{
    private int ID;
    private int aantalPersonen;
    private String naam;
            
    private IDaLokaal da;

    public Lokaal() {
        this.da = DaFactory.CreateDaLokaal();
    }

    
    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the aantalPersonen
     */
    public int getAantalPersonen() {
        return aantalPersonen;
    }

    /**
     * @param aantalPersonen the aantalPersonen to set
     */
    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    @Override
    public void save() {
        da.opslaan(this);
    }

    @Override
    public void delete() {
        da.verwijderen(ID);
    }

    @Override
    public List<Lokaal> GetAll() {
        return da.allesOphalen();
    }

    @Override
    public Lokaal Get(int ID) {
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
    
    
}
