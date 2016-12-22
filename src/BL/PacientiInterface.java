/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.List;
import EJB.Pacienti;

/**
 *
 * @author Edmond
 */
public interface PacientiInterface extends SpitaliInterface{
    
       List<Pacienti> findAll();    
}
