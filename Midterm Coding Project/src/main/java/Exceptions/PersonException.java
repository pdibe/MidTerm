package Exceptions;
import com.cisc181.core.Person;
public class PersonException extends Exception{
	private int age;
	private Person person;
	private String invalidNumber;
	public PersonException(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public PersonException(Person person){
		this.person = person;
	}
	public PersonException(String phone_number){
		this.invalidNumber = phone_number;
	}
	
	public String getInvalidNumber(){
		return this.invalidNumber;
	}
}
