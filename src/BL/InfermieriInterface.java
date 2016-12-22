package BL;

import EJB.Motra;
import java.util.List;

public interface InfermieriInterface extends SpitaliInterface{
    List<Motra> findAll();
}
