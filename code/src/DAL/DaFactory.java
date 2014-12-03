/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import DAL.Interfaces.IDaDocent;
import DAL.Interfaces.IDaLokaal;
import DAL.Interfaces.IDaModule;
import DAL.Interfaces.IDaStudent;

/**
 *
 * @author 11640
 */
public class DaFactory {
    private static DaDocent daDocent;
    private static DaStudent daStudent;
    private static DaModule daModule;
    private static DaLokaal daLokaal;
    
    public static IDaDocent CreateDaDocent(){
        if (daDocent == null) daDocent = new DaDocent();
        return daDocent;
    }
    
    public static IDaStudent CreateDaStudent(){
        if (daStudent == null) daStudent = new DaStudent();
        return daStudent;
    }
    public static IDaModule CreateDaModule(){
        if (daModule == null) daModule = new DaModule();
        return daModule;
    }
    public static IDaLokaal CreateDaLokaal(){
        if (daLokaal == null) daLokaal = new DaLokaal();
        return daLokaal;
    }
    
}
