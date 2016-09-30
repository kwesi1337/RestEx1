/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import java.util.List;

/**
 *
 * @author josephawwal
 */
public interface FacadePerson {
    
    
    public Person addPerson(Person p);
    public Person deletePerson(long id);
    public Person getPerson(long id);
    public List<Person> getPersons();
    public Person editPerson(Person p);
    
}
