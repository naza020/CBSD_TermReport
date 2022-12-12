/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author theki
 */
public class CovidTable {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");

        public static boolean insertCovid(Covid co) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean check=true;
        try {
            em.persist(co);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            check=false;
        } finally {
            em.close();
            return check;
        }
    }
        
        public static boolean insertListCovid(List<Covid> coList) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean check=true;
        try {
            for(Covid co : coList) {
                em.persist(co);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            check=false;
        } finally {
            em.close();
            return check;
        }
    }
        
    public static void updateCovid(Covid co) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        Covid fromDb = em.find(Covid.class, co.getCovidPK());
        fromDb.setNewCase(co.getNewCase());
        fromDb.setTotalCase(co.getTotalCase());
        fromDb.setNewCaseExcludeabroad(co.getNewCaseExcludeabroad());
        fromDb.setTotalCaseExcludeabroad(co.getTotalCaseExcludeabroad());
        fromDb.setNewRecovered(co.getNewRecovered());
        fromDb.setTotalRecovered(co.getTotalRecovered());
        fromDb.setNewDeath(co.getNewDeath());
        fromDb.setTotalDeath(co.getTotalDeath());
        fromDb.setCaseForeign(co.getCaseForeign());
        fromDb.setCasePrison(co.getCasePrison());
        fromDb.setCaseWalkin(co.getCaseWalkin());
        fromDb.setCaseNewPrev(co.getCaseNewPrev());
        fromDb.setCaseNewDiff(co.getCaseNewDiff());
        fromDb.setDeathNewPrev(co.getDeathNewPrev());
        fromDb.setDeathNewDiff(co.getDeathNewDiff());
        fromDb.setUpdateDate(co.getUpdateDate());
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static Covid findCovidByPk(CovidPK pk) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        Covid co = em.find(Covid.class, pk);
        em.close();
        return co;
    }
    
    public static List<Covid> findCovidByYear(Integer year) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Covid.findByYear");
        query.setParameter("years", year);
        List<Covid> coList = (List<Covid>) query.getResultList();
        em.close();
        return coList;
    }
    public static List<Covid> findCovidByWeek(Integer week) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Covid.findByWeeknum");
        query.setParameter("weeknum", week);
        List<Covid> coList = (List<Covid>) query.getResultList();
        em.close();
        return coList;
    }
    public static List<Covid> findAllCovid() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        List<Covid> coList = (List<Covid>) em.createNamedQuery("Covid.findAll").getResultList();
        em.close();
        return coList;
    }
   
    public static void removeCovid(Covid co) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");
        EntityManager em = emf.createEntityManager();
        Covid fromDb = em.find(Covid.class, co.getCovidPK());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                
    }
    
}
