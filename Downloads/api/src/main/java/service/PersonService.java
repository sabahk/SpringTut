package service;

import java.util.Hashtable;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import model.Person;

@Service
@ComponentScan({"client"})
public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService() {
		Person p = new Person();
		p.setName("sabah");
		p.setAge(27);
		persons.put("1", p);
		
		p = new Person();
		p.setName("safan");
		p.setAge(22);
		persons.put("2", p);
	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}
}
