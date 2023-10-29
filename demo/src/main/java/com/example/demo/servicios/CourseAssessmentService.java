package com.example.demo.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.CourseAssessment;
import com.example.demo.repositorios.CourseAssessmentRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CourseAssessmentService {
    @Autowired
    private CourseAssessmentRepository courseAssessmentRepository; 

    public List<CourseAssessment> findAllCourseAssessments() {
        return courseAssessmentRepository.findAll();
    }

    public CourseAssessment getCourseAssessmentById(Long id) {
        Optional<CourseAssessment> optionalCourseAssessment = courseAssessmentRepository.findById(id);
        return optionalCourseAssessment.orElse(null);
    }

    public CourseAssessment createCourseAssessment(CourseAssessment courseAssessment) {
        return courseAssessmentRepository.save(courseAssessment);
    }

    public CourseAssessment updateCourseAssessment(Long id, CourseAssessment courseAssessment) {
        if (courseAssessmentRepository.existsById(id)) {
            courseAssessment.setId(id);
            return courseAssessmentRepository.save(courseAssessment);
        } else {
            return null; 
        }
    }

    public void deleteCourseAssessment(Long id) {
        courseAssessmentRepository.deleteById(id);
    }
}
