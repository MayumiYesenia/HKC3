package com.example.demo.entidades;
import jakarta.persistence.*;

@Entity
public class CourseAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String tipoNota;
    private Integer numNota;
    private String nomenclatura;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public CourseAssessment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public Integer getNumNota() {
        return numNota;
    }

    public void setNumNota(Integer numNota) {
        this.numNota = numNota;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
