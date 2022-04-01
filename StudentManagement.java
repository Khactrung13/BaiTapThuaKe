/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class StudentManagement {
    static Scanner sc = new Scanner(System.in);
//    static Student[] students =null;
    static List<Student> studentList = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        StudentManagement std = new StudentManagement();
        Student[] students =null;
        int choose;
        int n=0;
        students = new Student[n];
        do {        
            std.showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:
                    System.out.print("Nhap so luong sinh vien:");
                    n = Integer.parseInt(sc.nextLine());
                    students = new Student[n];
                    for (int i = 0; i < students.length; i++) {
                        System.out.println("Nhap thong tin hoc sinh thu " +(i+1));
                        students[i]=new Student();
                        std.inputStudent(students[i]);
                    }
                    break;
                case 2:
                    Arrays.sort(students);
                    break;
                case 3:
                    for (int i = 0; i < students.length; i++) {
                        System.out.println(students[i].toString());
                    }
                    break;                     
                case 4:
                    std.write(students);
                    break;
                case 5:
                    std.read();
                    std.show(students);
                    break;
                case 6:                    
                    return;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
            
        } while (choose!=6);
    }
    public void showMenu(){
        System.out.println("1.Them sinh vien");
        System.out.println("2.Sap xep theo GPA");
        System.out.println("3.Hien thi thong tin sinh vien");
        System.out.println("4.Ghi vao file student.txt");
        System.out.println("5.Doc du lieu tu file student.txt");
        System.out.println("6.Ket thuc chuong trinh");
        System.out.print("chon:");
        
    }
     public void inputStudent(Student st){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap name:");
        st.setName(sc.nextLine());
        System.out.print("Nhap gender:");
        st.setGender(sc.nextLine());
        System.out.print("Nhap birth_year:");
        st.setBirth_year(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap studentId:");
        st.setStudentId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap academic_year:");
        st.setAcademic_year(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap GPA:");
        st.setGpa(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhap social_activities:");
        st.setSocial_activities(Float.parseFloat(sc.nextLine()));
    }

    public void write(Student[] students) {  
        try {   
            FileOutputStream f = new FileOutputStream("student.dao");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(students);  
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
    }
    public Student[] read() {      
        Student[] student = null;
        try {   
            FileInputStream f = new FileInputStream("student.dao");
            ObjectInputStream inStream = new ObjectInputStream(f);
            student = (Student[]) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        return student;
    }
    public void show(Student[] students) throws Exception {    
        try {
            for (int i = 0; i < students.length; i++) {
                System.out.println((i + 1) + ":name:"
                        + students[i].getName() + ",gender: "
                        + students[i].getGender() + ",birth_year:"+students[i].getBirth_year()
                        +",studentId:"+students[i].getStudentId() +",Academid_year:"+students[i].getAcademic_year()
                        +",gpa:"+students[i].getGpa()+",Social_activities:"+students[i].getSocial_activities());
            }
        } catch (NullPointerException e) {
            System.out.println("File Empty");
        }
    }
}
