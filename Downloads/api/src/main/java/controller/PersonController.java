package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public Person getAll(){
		return ps.getAll();
	}
	
}
