﻿package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personJeong = new Person("정채원", 22);
		personJeong.showInfo();
		
		System.out.println(personJeong);
		
		Person p = personJeong.getSelf();
		System.out.println(p);
	}

}
