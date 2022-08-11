package com.week8assignment.week8hw;

import com.week8assignment.week8hw.address.Address;
import com.week8assignment.week8hw.phone.Phone;
import com.week8assignment.week8hw.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class Week8hwApplication {

	public static void main(String[] args) {
		// configure with xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


		// tell context to get beans of different classes
		Phone newPhone = context.getBean("Phone",Phone.class);
		newPhone.setNumber("123456");

		Address newAddress = context.getBean("Address",Address.class);
		newAddress.setCity("Kuni");
		newAddress.setCountry("USA");
		newAddress.setZipcode("1015");
		newAddress.setState("WANO");

		Student newStudent = context.getBean("Student",Student.class);
		newStudent.setId(1);
		newStudent.setName("Luffy");
		newStudent.setPhoneList(List.of(newPhone));
		newStudent.setAddress(newAddress);
		System.out.println(newStudent);
	}
}

