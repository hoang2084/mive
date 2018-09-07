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
    public enum Gender {MALE, FEMALE;}
    private Adress address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Adress getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

