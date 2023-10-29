package com.example.demo.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entidades.CourseAssessmentDetails;
import com.example.demo.repositorios.CourseAssessmentDetailsRepository;

import java.util.List;

@Service
public class CourseAssessmentDetailsService {
    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    public List<CourseAssessmentDetails> getAllCourseAssessmentDetails() {
        return courseAssessmentDetailsRepository.findAll();
    }

    public CourseAssessmentDetails getCourseAssessmentDetailsById(Long id) {
        return courseAssessmentDetailsRepository.findById(id).orElse(null);
    }

    public void createCourseAssessmentDetails(CourseAssessmentDetails details) {
        courseAssessmentDetailsRepository.save(details);
    }

    public void updateCourseAssessmentDetails(Long id, CourseAssessmentDetails details) {
        details.setId(id);
        courseAssessmentDetailsRepository.save(details);
    }

    public void deleteCourseAssessmentDetails(Long id) {
        courseAssessmentDetailsRepository.deleteById(id);
    }
}
