/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO.Interfaces;

/**
 *
 * @author 11640
 */
public interface IModuleService {
    
    boolean ModuleVolzet(int Id);
    void StudentInschrijven(int studID, int modID );
    void StudentInschrijvenInWachtrij(int studID, int modID);
    
    
}
