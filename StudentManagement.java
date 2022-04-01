/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThuaKeBai1;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class StudentManagement {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Student> studentList;

    public StudentManagement(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public StudentManagement(){
         this.studentList = new ArrayList<>();
    }
    public void themSinhVien(Student sv) {
	this.studentList.add(sv);
    }
    public void inDanhSachSinhVien() {
        for (Student student : studentList) {
            System.out.println(student);
	}
    }
    public void timSinhVienTheoNamSinh(int namsinh){
        for (Student st : studentList) {
            if(st.getBirth_year()==namsinh) {
                System.out.println(st);
            }
        }
    }
    public void timSinhVienTheoTen(String name) {
	for (Student st : studentList) {
            if(st.getName().equals(name)) {
                System.out.println(st);
            }
	}
    }
    
    public static void main(String[] args) {
        StudentManagement st = new StudentManagement();
        while(true){
            System.out.println("1.Nhap thong tin cho sinh vien");
            System.out.println("2.Hien thi thong tin");
            System.out.println("3.Tim kiem sinh vien theo nam sinh");
            System.out.println("4.Tim kiem sinh vien theo ten");
            System.out.println("5.Ket thuc chuong trinh");
            System.out.println("Nhap lua chon:");
            int luachon = Integer.parseInt(sc.nextLine());
            switch(luachon){
                case 1: 
                    System.out.println("Nhap thong tin cho sinh vien");
                    System.out.print("Nhap name:");
                    String name = sc.nextLine();
                    System.out.print("Nhap gender:");
                    char gender = sc.next().charAt(0);
                    System.out.print("Nhap birth_year:");
                    int birth_year = sc.nextInt();
                    System.out.print("Nhap studentId:");
                    int studentId = sc.nextInt();
                    System.out.print("Nhap academic_year:");
                    int academic_year = sc.nextInt();
                    sc.nextLine();
                    Student std = new Student(studentId, academic_year, name, gender, birth_year);
                    st.themSinhVien(std);
                    
                break;   
                case 2:
                    System.out.println("Hien thi danh sach sinh vien:");
                    st.inDanhSachSinhVien();

                    break;
                case 3:
                    System.out.println("Tim kiem sinh vien theo nam sinh");
                    System.out.println("Nhap nam sinh can tim kiem:");
                    int namsinh = sc.nextInt();
                    sc.nextLine();
                    st.timSinhVienTheoNamSinh(namsinh);
                    break;
                case 4:
                    System.out.println("Tim kiem sinh vien theo ten:");
                    System.out.println("Nhap ten sinh vien can tim kiem:");
                    String ten = sc.nextLine();
                    st.timSinhVienTheoTen(ten);
                    break;
                case 5: 
                    return;
                default:
                    System.out.println("Khong hop le!!!");
                    continue;
                    
            }
        
        }
    }
}
