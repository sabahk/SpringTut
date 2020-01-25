package client;

import java.util.Hashtable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import model.Person;;

@Component
public class CallRestApi implements CommandLineRunner {
	
	
	private static void callRestAPI() {
		Hashtable<String, Person> persons = new Hashtable<String, Person>();
		String loc = "detroit";
		String location = "http://api.openweathermap.org/data/2.5/weather?q=" + loc + "&appid=6a90ca8c6066710ca673da054dfd51b4";
		RestTemplate restTemplate = new RestTemplate();
		Person movie = restTemplate.getForObject(location, Person.class);
		Person p = new Person();
		p.setName(movie.getName());
		p.setAge(22);
		persons.put("3", p);
		System.out.println(location + " this is from api name is " + movie.getName());
	}

	@Override
	public void run(String...args) throws Exception{
		callRestAPI();
	}
}
