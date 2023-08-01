package com.divij.di;

public class Major {
    private String subject;

    public Major() {
        this.subject = "CS";
    }

    public Major(String subject) {
        this.subject = subject;
    }
    public void major() {
        System.out.println("Student is pursuing a major: " + this.subject);
    }
}
