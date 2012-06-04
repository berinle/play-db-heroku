package models;

import play.db.ebean.Model;
import javax.persistence.*;
import java.util.*;

@Entity
public class Person extends Model {

	@Id
    public Long id;

    public String firstName;
    public String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static final Finder<Long, Person> FIND = new Finder<Long, Person>(Long.class,
            Person.class);

    public static List<Person> list(){
    	return FIND.all();
    }

    public static void delete(Long id){
    	FIND.byId(id).delete();
    }
    
}