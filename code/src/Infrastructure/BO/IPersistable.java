/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Infrastructure.BO;

import java.util.List;

/**
 *
 * @author 11640
 * @param <T>
 */
public interface IPersistable <T> {
     void save();
     void delete ();
     List<T> GetAll();
     T Get (int ID);
}
