/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Person implements Cloneable,Serializable{
    public String name;
    public String gender;
    public int birth_year;

    public Person() {
    }

    public Person(String name, String gender, int birth_year) {
        this.name = name;
        this.gender = gender;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", birth_year=" + birth_year + '}';
    }
    
    
 
}
