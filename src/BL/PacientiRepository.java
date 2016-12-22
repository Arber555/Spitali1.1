/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import EJB.Dhoma;
import EJB.Pacienti;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Edmond
 */
public class PacientiRepository extends EntityManagerClass implements PacientiInterface
{
    
    @Override
    public boolean insert(Object o) throws SpitaliException {
        if(o instanceof Pacienti)
        {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }
        else{
            throw new SpitaliException("Pacineti nuk eshte i incjalizuar!");
        }
    }
        
    @Override
    public boolean update(Object o) throws SpitaliException {
        if(o instanceof Pacienti)
       {
           em.getTransaction().begin();
           em.merge(o);
           em.getTransaction().commit();
           return true;
       }
       else
       {
           throw new SpitaliException("Objekti nuk eshte i llojit pacineti!");
       }
    }

    @Override
    public boolean remove(Object o) throws SpitaliException {
        if(o instanceof Pacienti)
        {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
            return true;
        }
        else
        {
             throw new SpitaliException("Objekti nuk eshte i llojit pacienti!");
        }
    }
    
    @Override
    public List<Pacienti> findAll() {
        return em.createNamedQuery("Pacienti.findAll").getResultList();
    }
    
    public List<Pacienti> findById(int i)
    {
        return em.createNamedQuery("Pacienti.findById").setParameter("id", i).getResultList();
    }
    
    public List<Pacienti> findByEmriMbiemri(String e , String m)
    {
        Query q = em.createQuery("Select p from Pacienti as p where p.emri = :emri and p.mbiemri = :mbiemri");
        q.setParameter("emri", e);
        q.setParameter("mbiemri", m);
        return q.getResultList();
    }
    
    
    public List<Pacienti> findByDhoma(Dhoma i)
    {
        return em.createQuery("Select p from Pacienti as p where p.iDdhoma = :i").setParameter("i", i).getResultList();
    }
}
