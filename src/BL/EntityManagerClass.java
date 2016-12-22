package BL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerClass {
    public EntityManager em = Persistence.createEntityManagerFactory("Spitali1.1PU").createEntityManager();
}
