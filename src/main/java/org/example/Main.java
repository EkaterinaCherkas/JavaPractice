package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student Dima = new Student("dima", "27-02", 1, new int[] { 2, 2, 3, 2, 5 });
        Student Katya = new Student("katya", "27-03", 1, new int[] { 5, 5, 5, 4, 5 });
        Student Sergey = new Student("sergey", "28-04", 3, new int[] { 3, 4, 3, 4, 5 });
        Student Tanya = new Student("tanya", "26-05", 1, new int[] { 3, 3, 3, 3, 2 });
        Student Nadia = new Student("nadia", "23-04", 3, new int[] { 2, 5, 5, 2, 5 });
        Student Misha = new Student("misha", "21-01", 3, new int[] { 4, 3, 3, 4, 5 });
        Set<Student> studentsSet = new HashSet<>(Arrays.asList(Dima, Katya, Sergey, Tanya, Nadia, Misha));

        Student.printStudents(studentsSet, 3);

        System.out.println("-------");

        Student.print(studentsSet);
        Student.print(studentsSet);
        Student.deleteStudents(studentsSet);
    }
}