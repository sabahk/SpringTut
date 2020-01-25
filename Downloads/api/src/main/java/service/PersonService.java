package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService() {
		String loc ="detroit";
		String location = "http://api.openweathermap.org/data/2.5/weather?q=" + loc + "&appid=6a90ca8c6066710ca673da054dfd51b4";
		RestTemplate restTemplate = new RestTemplate();
		Person movie = restTemplate.getForObject(location, Person.class);
		Person p = new Person();
		p.setName(movie.getName());
		p.setAge(224);
		persons.put("1", p);

	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}
	
	
}
