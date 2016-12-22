package BL;

import EJB.Rescepsionisti;
import java.util.List;

public interface RescepsionistiInterface extends SpitaliInterface{
    List<Rescepsionisti> findAll();
}
