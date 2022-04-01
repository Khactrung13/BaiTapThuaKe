/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThuaKeBai1;

/**
 *
 * @author Admin
 */
public class Student extends Person {
    private int studentId;
    private int academic_year;


    public Student(int studentId, int academic_year, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.studentId = studentId;
        this.academic_year = academic_year;
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
    
    @Override
    public String toString(){
        return "Student(name: " +super.getName() +" ,gender: " + super.getGender() +" ,birth_year: " + super.getBirth_year()
                +" ,studentId: "+studentId+" ,acadenmic_year: "+academic_year +")";
    }
   
}
