package com.mycompany.Connect;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateConnect {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    public static EntityManager em = emf.createEntityManager();
    public static EntityTransaction etr = em.getTransaction();

    public static void main(String[] args) {
        try {
            etr.begin();
            // Thực hiện các thao tác với entity trong đây

            etr.commit();
        } catch (Exception e) {
            if (etr.isActive()) {
                etr.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
