package BL;

import java.util.List;
import EJB.Rescepsionisti;
import javax.persistence.Query;

public class RescepsionistiRepository extends EntityManagerClass implements RescepsionistiInterface{

    @Override
    public boolean insert(Object o) throws SpitaliException {
        if(o instanceof Rescepsionisti){
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
        if(o instanceof Rescepsionisti)
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
       
        if(o instanceof Rescepsionisti)
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
    public List<Rescepsionisti> findAll() {
        return em.createNamedQuery("Rescepsionisti.findAll").getResultList();
    }
    
    public List<Rescepsionisti> findById(int i)
    {
        return em.createNamedQuery("Rescepsionisti.findById").setParameter("id", i).getResultList();
    }
    
    public List<Rescepsionisti> findByEmri(String emri)
    {
        return em.createNamedQuery("Rescepsionisti.findByEmri").setParameter("emri", emri).getResultList();
    }
    
    public List<Rescepsionisti> findByMbiemri(String mbiemri)
    {
        return em.createNativeQuery("Rescepsionisti.findByMbiemri").setParameter("mbiemri", mbiemri).getResultList();
    }
    
    public List<Rescepsionisti> findByEmriMbiemri(String e, String m)
    {
        Query q = em.createQuery("select r from Rescepsionisti as r where r.emri = :emri and r.mbiemri = :mbiemri");
        q.setParameter("emri", e);
        q.setParameter("mbiemri", m);
        
        return q.getResultList();
    }
    
    public Rescepsionisti findByEmriFjalkalimi(String e, String f)
    {
        Query q = em.createQuery("select d from Rescepsionisti as d where d.emri = :emri and d.fjalkalimi = :f");
        q.setParameter("emri", e);
        q.setParameter("f", f);
        
        if(q.getResultList().toString() != "[]")
            return (Rescepsionisti)q.getSingleResult();
        else
            return null;
    }
}
