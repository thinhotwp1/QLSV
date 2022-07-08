/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Administrator
 */
import java.util.Comparator;//được sử dụng để sắp xếp các đối tượng của lớp do người dùng định nghĩa (user-defined)
 
/**
 * SortStudentByGPA class
 * 
 * @author viettuts.vn
 */
public class SortStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return 1;
        }
        return -1;
    }
}