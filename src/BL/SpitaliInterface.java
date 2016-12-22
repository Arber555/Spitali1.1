package BL;

import java.util.List;

public interface SpitaliInterface {  
    boolean insert(Object o)throws SpitaliException;
    boolean update(Object o)throws SpitaliException;
    boolean remove(Object o)throws SpitaliException;
}
