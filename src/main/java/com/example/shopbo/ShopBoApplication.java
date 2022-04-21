package com.example.shopbo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class ShopBoApplication {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("shop");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try{

            Team team = new Team();

            team.setName("TeamA");
            em.persist(team);
            System.out.println("team=============");



            Member member = new Member();

            member.setTeam(team);
            member.setUserName("aaa");
            em.persist(member);

            System.out.println("member=============");





            /*Member findMember = em.find(Member.class, 1);

            System.out.println("===============" + findMember.getId());
            System.out.println("===============" + findMember.getName());*/


            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();


    }

}
