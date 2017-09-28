package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {

        for (Student student : students) {
            if (averageGrade == student.getAverageGrade()) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double result = students.get(0).getAverageGrade();
        for (Student student : students) {
            if (result < student.getAverageGrade()) {
                result = student.getAverageGrade();
            }
        }
        return getStudentWithAverageGrade(result);
    }

    public Student getStudentWithMinAverageGrade() {
        double result = students.get(0).getAverageGrade();
        for (Student student : students) {
            if (result > student.getAverageGrade()) {
                result = student.getAverageGrade();
            }
        }
        return getStudentWithAverageGrade(result);
    }

    public void expel(Student student) {
        students.remove(student);
    }
}