package BL;

import EJB.Doktori;
import java.util.List;
import javax.persistence.Query;

public class DoktoriRepository extends EntityManagerClass implements DoktoriInterface{


    @Override
    public boolean insert(Object o) throws SpitaliException {
        if(o instanceof Doktori)
        {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }
        else{
            throw new SpitaliException("Doktori nuk eshte i incjalizuar!!!");
        }
    }

    @Override
    public boolean update(Object o) throws SpitaliException {
       
       if(o instanceof Doktori)
       {
           em.getTransaction().begin();
           em.merge(o);
           em.getTransaction().commit();
           return true;
       }
       else
       {
           throw new SpitaliException("Objekti nuk eshte i llojit doktor!!!");
       }
    }

    @Override
    public boolean remove(Object o) throws SpitaliException {
         
        if(o instanceof Doktori)
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
    public List<Doktori> findAll() {
       return em.createNamedQuery("Doktori.findAll").getResultList(); 
    }
    
    public List<Doktori> findById(int i)
    {
        return em.createNamedQuery("Doktori.findById").setParameter("id",i).getResultList();   
    }
    
    public List<Doktori> findByEmri(String e)
    {
        return em.createNamedQuery("Doktori.findByEmri").setParameter("emri", e).getResultList();
    }
    
    public List<Doktori> findByMbiemri(String m)
    {
        return em.createNamedQuery("Doktori.findByMbiemri").setParameter("mbiemri", m).getResultList();
    }
    
    public List<Doktori> findByEmriMbiemri(String e, String m)
    {
        //return em.createNamedQuery("Doktori.findByEmriMbiemri").setParameter("emri", e)
        Query q = em.createQuery("select d from Doktori as d where d.emri = :emri and d.mbiemri = :mbiemri");
        q.setParameter("emri", e);
        q.setParameter("mbiemri", m);
       
        return q.getResultList();
    }
    
    public Doktori findByEmriFjalkalimi(String e, String f)
    {
        Query q = em.createQuery("select d from Doktori as d where d.emri = :emri and d.fjalkalimi = :f");
        q.setParameter("emri", e);
        q.setParameter("f", f);
        System.out.println(q.getResultList());
        
        if(q.getResultList().toString() != "[]")
            return (Doktori)q.getSingleResult();
        else
            return null;
    }
    
    
   /* public List<Doktori> findByEmriFjalkalimi(String e, String f)
    {
        Query q = em.createQuery("select * from Doktori as d where emri = :emri and fjalkalimi = :f");
        q.setParameter("emri", e);
        q.setParameter("f", f);
        
        return q.getResultList();
    }*/
}