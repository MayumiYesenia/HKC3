package com.example.demo.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class CourseAssessmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String score;
    private String section;
    private String sectiongroup;
   
    @ManyToOne
    private CourseAssessment courseAssessment;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Professor professor;

    public CourseAssessmentDetails() {}

    public CourseAssessmentDetails(String score, String section, String sectiongroup, CourseAssessment courseAssessment, Student student, Professor professor) {
        this.score = score;
        this.section = section;
        this.sectiongroup = sectiongroup;
        this.courseAssessment = courseAssessment;
        this.student = student;
        this.professor = professor;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getScore() {
        return score;
    }

    public String getSection() {
        return section;
    }

    public String getSectiongroup() {
        return sectiongroup;
    }

    public CourseAssessment getCourseAssessment() {
        return courseAssessment;
    }

    public Student getStudent() {
        return student;
    }

    public Professor getProfessor() {
        return professor;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSectiongroup(String sectiongroup) {
        this.sectiongroup = sectiongroup;
    }

    public void setCourseAssessment(CourseAssessment courseAssessment) {
        this.courseAssessment = courseAssessment;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
