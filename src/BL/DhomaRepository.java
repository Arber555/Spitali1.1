

package BL;

import EJB.Dhoma;
import EJB.Sektori;
import java.util.List;
import javax.persistence.Query;

public class DhomaRepository extends EntityManagerClass implements DhomaInterface{


    @Override
    public boolean insert(Object o) throws SpitaliException {
        if(o instanceof Dhoma)
        {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }
        else{
            throw new SpitaliException("Dhoma nuk eshte i incjalizuar!!!");
        }
    }

    @Override
    public boolean update(Object o) throws SpitaliException {
        if(o instanceof Dhoma)
       {
           em.getTransaction().begin();
           em.merge(o);
           em.getTransaction().commit();
           return true;
       }
       else
       {
           throw new SpitaliException("Objekti nuk eshte i llojit Dhoma!!!");
       }
    }

    @Override
    public boolean remove(Object o) throws SpitaliException {
        if(o instanceof Dhoma)
        {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
             throw new SpitaliException("Objekti nuk eshte i llojit Dhoma!!!");
        }
    }

    @Override
    public List<Dhoma> findAll() {
        return em.createNamedQuery("Dhoma.findAll").getResultList();
    }
    
    public List<Dhoma> findById(int i)
    {
        return em.createNamedQuery("Dhoma.findById").setParameter("id", i).getResultList();
    }
    
    public List<Dhoma> findByNrDhomes(int nr)
    {
        return em.createNamedQuery("Dhoma.findByNrdhomes").setParameter("nrdhomes", nr).getResultList();
    }
    
    public List<Dhoma> findBySektori(int i)
    {
        Query q = em.createQuery("Select d FROM Dhoma d where d.sektoriID = :ids");
        q.setParameter("ids", i);
        
        return q.getResultList();
    }

    public List<Dhoma> findBySektori(Sektori s) {
        return em.createQuery("Select d FROM Dhoma d where d.sektoriID = :ids").setParameter("ids", s.getId()).getResultList();
    }
}
