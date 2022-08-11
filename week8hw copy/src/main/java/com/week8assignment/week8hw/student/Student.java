package com.week8assignment.week8hw.student;

import java.util.List;

import com.week8assignment.week8hw.address.Address;
import com.week8assignment.week8hw.phone.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student {
    private int id;
    private String name;

    private List<Phone>phoneList;

    private Address address;

    public Student(){

    }

    public Student(int id, String name, List<Phone> phoneList, Address address) {
        this.id = id;
        this.name = name;
        this.phoneList = phoneList;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public Address getAddress() {
        return address;
    }



    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", phoneList=" + phoneList +
                ", address=" + address +
                '}';
    }

}
