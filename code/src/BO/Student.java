/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import Infrastructure.BO.IPersistable;
import DAL.DaFactory;

import DAL.Interfaces.IDaStudent;
import java.util.List;

/**
 *
 * @author 11640
 */
public class Student implements IPersistable<Student> {
    private String naam;
    private int ID;
    private String Email;
    private IDaStudent da;

    public Student() {
        this.da = DaFactory.CreateDaStudent();
    }

    @Override
    public String toString() {
        return "Student{" + "naam=" + naam + ", Email=" + Email + '}';
    }
    
    
    
    public Student(String naam, int ID) {
        this.naam = naam;
        this.ID = ID;
        this.da = DaFactory.CreateDaStudent();
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

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
    public List<Student> GetAll() {
        return da.allesOphalen();
    }

    @Override
    public Student Get(int ID) {
        return da.ophalen(ID);
    }
    
}
