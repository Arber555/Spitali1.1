

package BL;

import EJB.Barnat;
import java.util.List;

public class BarnatRepository extends EntityManagerClass implements BarnatInterface{

    @Override
    public boolean insert(Object o) throws SpitaliException {
         if(o instanceof Barnat)
        {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }
        else{
            throw new SpitaliException("Barna nuk eshte i incjalizuar!!!");
        }
    }

    @Override
    public boolean update(Object o) throws SpitaliException {
         if(o instanceof Barnat)
       {
           em.getTransaction().begin();
           em.merge(o);
           em.getTransaction().commit();
           return true;
       }
       else
       {
           throw new SpitaliException("Objekti nuk eshte i llojit Barna!!!");
       }
    }

    @Override
    public boolean remove(Object o) throws SpitaliException {
        if(o instanceof Barnat)
        {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
             throw new SpitaliException("Objekti nuk eshte i llojit Barna!!!");
        }
    }
    
    @Override
    public List<Barnat> findAll() {
        return em.createNamedQuery("Barnat.findAll").getResultList();
    }
}
