package com.example.demo.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entidades.CourseAssessmentDetails;
import com.example.demo.servicios.CourseAssessmentDetailsService;

import java.util.List;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {
    @Autowired
    private CourseAssessmentDetailsService courseAssessmentDetailsService;

    @GetMapping
    public List<CourseAssessmentDetails> getAllCourseAssessmentDetails() {
        return courseAssessmentDetailsService.getAllCourseAssessmentDetails();
    }

    @GetMapping("/{id}")
    public CourseAssessmentDetails getCourseAssessmentDetailsById(@PathVariable Long id) {
        return courseAssessmentDetailsService.getCourseAssessmentDetailsById(id);
    }

    @PostMapping
    public void createCourseAssessmentDetails(@RequestBody CourseAssessmentDetails details) {
        courseAssessmentDetailsService.createCourseAssessmentDetails(details);
    }

    @PutMapping("/{id}")
    public void updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails details) {
        courseAssessmentDetailsService.updateCourseAssessmentDetails(id, details);
    }
    @DeleteMapping("/{id}")
    public void deleteCourseAssessmentDetails(@PathVariable Long id) {
    courseAssessmentDetailsService.deleteCourseAssessmentDetails(id);
    }

    
}
