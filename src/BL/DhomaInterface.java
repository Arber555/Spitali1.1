package BL;

import EJB.Dhoma;
import java.util.List;

public interface DhomaInterface extends SpitaliInterface{
    List<Dhoma> findAll();
}
