package com.divij.di;

public class Student {
    private String studentName;
    private Integer rollNo;

    private Major major;

    public Student(Integer roll) {
        this.rollNo = roll;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void printInfo() {
        System.out.println("The name of the student is: " + this.studentName);
        System.out.println("The roll number of the student is: " + this.rollNo);
    }

    public void getMajor() {
        major.major();
    }
    
}
