package com.week8assignment.week8hw;

import com.week8assignment.week8hw.address.Address;
import com.week8assignment.week8hw.phone.Phone;
import com.week8assignment.week8hw.student.Student;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    // create beans for all instances

    @Bean(name="Address")
    public Address createAddress(){
        return new Address();
    }
    @Bean(name="Phone")
    public Phone createPhone(){
        return new Phone();
    }
    @Bean(name="Student")
    public Student newStudent(){
        return new Student();
    }

}
