package BL;

import EJB.Motra;
import java.util.List;
import javax.persistence.Query;

public class InfermieriRepository extends EntityManagerClass implements InfermieriInterface{

    @Override
    public boolean insert(Object o) throws SpitaliException {
        if(o instanceof Motra){
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }
        else{
            throw new SpitaliException("Resepsjonisti nuk eshte i incjalizuar!!!");
        }
    }

    @Override
    public boolean update(Object o) throws SpitaliException {
        if(o instanceof Motra)
        {
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
            throw new SpitaliException("Objekti nuk eshte i llojit Rescepsionisti!!!");
        }
    }

    @Override
    public boolean remove(Object o) throws SpitaliException {
        if(o instanceof Motra)
        {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
            throw new SpitaliException("Objekti nuk eshte i llojit doktor!!!");
        }
    }
    
    @Override
    public List<Motra> findAll() {
        return em.createNamedQuery("Motra.findAll").getResultList();
    }

    public List<Motra> findById(int i)
    {
        return em.createNamedQuery("Motra.findById").setParameter("id", i).getResultList();
    }
    
    public List<Motra> findByEmri(String emri)
    {
        return em.createNamedQuery("Motra.findByEmri").setParameter("emri", emri).getResultList();
    }
    
    public List<Motra> findByMbiemri(String mbiemri)
    {
        return em.createNativeQuery("Motra.findByMbiemri").setParameter("mbiemri", mbiemri).getResultList();
    }
    
    public List<Motra> findByEmriMbiemri(String e, String m)
    {
        Query q = em.createQuery("select m from Motra as m where m.emri = :emri and m.mbiemri = :mbiemri");
        q.setParameter("emri", e);
        q.setParameter("mbiemri", m);
        
        return q.getResultList();
    }
    
    public Motra findByEmriFjalkalimi(String e, String f)
    {
        Query q = em.createQuery("select d from Motra as d where d.emri = :emri and d.fjalkalimi = :f");
        q.setParameter("emri", e);
        q.setParameter("f", f);
        
        
        if(q.getResultList().toString() != "[]")
            return (Motra)q.getSingleResult();
        else
            return null;
        
        
    }
}
