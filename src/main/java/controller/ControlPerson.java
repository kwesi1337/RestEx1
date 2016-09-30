/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Person;
import facade.FacadePerson;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author josephawwal
 */
public class ControlPerson implements FacadePerson {
    
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public ControlPerson(){
        
        emf = Persistence.createEntityManagerFactory("PU");
        em = emf.createEntityManager();
        
    }
    
    @Override
    
    public Person getPerson(long id){
        
        
        return em.find(Person.class, id);
    }
    
    
    @Override
    
    public Person addPerson(Person p){
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        return p;
    }
    
    
    @Override
    
    public Person deletePerson(long id){
        
        Person p = em.find(Person.class, id);
        em.remove(p);
        return p;
    }
    
    
    @Override
    
    public List<Person> getPersons(){
        
        TypedQuery<Person> query = em.createNamedQuery("Person.findAll", Person.class);
        List<Person> personList = query.getResultList();
        
        return personList;
    }
    
    @Override
    
    public Person editPerson(Person person){
        
        Person p = em.find(Person.class, person.getId());
        if (p != null){
            
            em.getTransaction().begin();
            p = person;
            
            em.getTransaction().commit();
            
        }
        
        return p;
    }
}
