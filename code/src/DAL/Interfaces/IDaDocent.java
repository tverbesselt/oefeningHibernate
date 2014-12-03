/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Interfaces;

import BO.Docent;
import java.util.List;

/**
 *
 * @author 11640
 */
public interface IDaDocent {
    void opslaan(Docent s);
    void verwijderen (int ID );
    List<Docent> allesOphalen();
    Docent ophalen(int Id);
}
