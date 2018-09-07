package de.fantavier.j2ee.model;

import javax.persistence.*;

@Entity
@Table (name = "EMPLOYEE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ZUGEHÖRIGKEIT", discriminatorType = DiscriminatorType.STRING)
public abstract class Employee {

    private String name;
    private int age;
    private Gender gender;
    private enum Gender {MALE, FEMALE;}
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

