package model;

import java.util.List;

public class Person {

	String name;
	int age;
	List<Weather> weather;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Weather> getWeather(){
		return weather;
	}
	public void setWeather(List<Weather> weather){
		this.weather = weather;
	}
	
	
}
