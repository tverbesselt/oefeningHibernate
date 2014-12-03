/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Interfaces;

import BO.Lokaal;
import java.util.List;

/**
 *
 * @author 11640
 */
public interface IDaLokaal {
    void opslaan(Lokaal  l);
    void verwijderen (int ID );
    List<Lokaal> allesOphalen();
    Lokaal ophalen(int Id);
    int AantalCursistenInLokaalOphalen(int lokaalID);
}
