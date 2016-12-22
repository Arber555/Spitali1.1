

package BL;

import EJB.Farmacisti;
import java.util.List;

public class FarmacistiRepository extends EntityManagerClass implements FarmacistiInterface{

    @Override
    public boolean insert(Object o) throws SpitaliException {
        if(o instanceof Farmacisti)
        {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
            throw new SpitaliException("Farmacisti nuk eshte i incjalizuar!!!");
        }
    }

    @Override
    public boolean update(Object o) throws SpitaliException {
        if(o instanceof Farmacisti)
        {
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
            throw new SpitaliException("Objekti nuk eshte i llojit Farmacist!!!");
        }
    }

    @Override
    public boolean remove(Object o) throws SpitaliException {
        if(o instanceof Farmacisti)
        {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
            throw new SpitaliException("Objekti nuk eshte i llojit Farmacist!!!");
        }
    }
    
    @Override
    public List<Farmacisti> findAll() {
       return em.createNamedQuery("Farmacisti.findAll").getResultList();
    }
}
