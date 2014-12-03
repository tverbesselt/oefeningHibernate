/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import Infrastructure.BO.IPersistable;
import DAL.DaFactory;

import DAL.Interfaces.IDaModule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 11640
 */
public class Module implements IPersistable<Module>{
    
    private List<Student> IngeschrevenStudenten;
    private int ID;
    private String naam;
    private Lokaal lokaal;
    private List<Student> Wachtrij;
    private IDaModule daModule;

    public Module(int ID, String naam, Lokaal lokaal, IDaModule daModule) {
        this.ID = ID;
        this.naam = naam;
        this.lokaal = lokaal;
        this.daModule = daModule;
    }
            
    
    
    public Module(int ID, String naam, Lokaal lokaal) {
        this.ID = ID;
        this.naam = naam;
        this.lokaal = lokaal;
        this.daModule = DaFactory.CreateDaModule();
        Wachtrij = daModule.GetWachtrijStudenten(ID);
        IngeschrevenStudenten = daModule.GetIngeschrevenStudenten(ID);
    }
    
    public Module()
    {
        Wachtrij = new ArrayList<>();
        IngeschrevenStudenten = new ArrayList<>();
    }

    /**
     * @return the IngeschrevenStudenten
     */
    public List<Student> getIngeschrevenStudenten() {
        return IngeschrevenStudenten;
    }

    /**
     * @param IngeschrevenStudenten the IngeschrevenStudenten to set
     */
    public void setIngeschrevenStudenten(List<Student> IngeschrevenStudenten) {
        this.IngeschrevenStudenten = IngeschrevenStudenten;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
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
     * @return the lokaal
     */
    public Lokaal getLokaal() {
        return lokaal;
    }

    /**
     * @param lokaal the lokaal to set
     */
    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }

    /**
     * @return the Wachtrij
     */
    public List<Student> getWachtrij() {
        return Wachtrij;
    }

    /**
     * @param Wachtrij the Wachtrij to set
     */
    public void setWachtrij(List<Student> Wachtrij) {
        this.Wachtrij = Wachtrij;
    }

    /**
     * @return the daModule
     */
    public IDaModule getDaModule() {
        return daModule;
    }

    @Override
    public void save() {
        daModule.opslaan(this);
    }

    @Override
    public void delete() {
       daModule.verwijderen(ID);
    }

    @Override
    public List<Module> GetAll() {
       return daModule.allesOphalen();
    }

    @Override
    public Module Get(int ID) {
       return daModule.ophalen(ID);
    }
    
    
}
