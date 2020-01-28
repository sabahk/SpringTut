package service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Person;

@Service
public class PersonService {
	
	public Person getAll(){
		String loc ="detroit";
		String location = "http://api.openweathermap.org/data/2.5/weather?q=" + loc + "&appid=6a90ca8c6066710ca673da054dfd51b4";
		RestTemplate restTemplate = new RestTemplate();
		Person movie = restTemplate.getForObject(location, Person.class);
		return movie;
	}
	
	
}
