/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.gson.Gson;
import entity.Person;
import java.util.List;

/**
 *
 * @author josephawwal
 */
public class JSONConverter {
    
    
    static Gson gson = new Gson();
    
    public static Person getPersonFromJson(String js){
        
        return null;
    }
    
    
    public static String getJSONFromPerson(Person p){
        
        return gson.toJson(p);
        
    }
    
    
        public static String getJSONFromPerson(List<Person> persons){
            
            return "";
            
        }
    }
