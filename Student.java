/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person implements Comparable<Student>,Serializable{
    private int studentId;
    private int academic_year;
    private float gpa;
    private float social_activities;

    public Student() {
        
    }

    public Student(int studentId, int academic_year, float gpa, float social_activities, String name, String gender, int birth_year) {
        super(name, gender, birth_year);
        this.studentId = studentId;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getSocial_activities() {
        return social_activities;
    }

    public void setSocial_activities(float social_activities) {
        this.social_activities = social_activities;
    }
   
    @Override
    public String toString() {
       return "Student(name=" +name +" ,gender=" + gender +" ,birth_year=" + birth_year
                +" ,studentId="+studentId+" ,acadenmic_year="+academic_year +",gpa="+ gpa + ",Social_activities="+social_activities+")";
    } 
    
    @Override
    public int compareTo(Student o) {
        return (int) -(this.getGpa()-o.getGpa());
    }

    public String getFileLine(){
        return name + ","+ gender + ","+birth_year+","+ studentId +","+academic_year+","+gpa+","+social_activities+"\n";
    }
    public void parse(String line){
        String params[] = line.split(",");
        try {
            name = params[0];
            gender = params[1];
            birth_year = Integer.parseInt(params[2]);
            studentId=Integer.parseInt(params[3]);
            academic_year=Integer.parseInt(params[4]);
            gpa = Float.parseFloat(params[5]);
            social_activities= Float.parseFloat(params[6]);
        
        } catch (ArrayIndexOutOfBoundsException ex) {
        }finally{
            
        }
    }

  
    
}
