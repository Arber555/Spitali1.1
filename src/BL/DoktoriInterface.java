package BL;

import EJB.Doktori;
import java.util.List;

public interface DoktoriInterface extends SpitaliInterface{

    List<Doktori> findAll();
}
