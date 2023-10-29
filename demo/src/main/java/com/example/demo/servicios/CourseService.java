package com.example.demo.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Course;
import com.example.demo.repositorios.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findallAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        return optionalCourse.orElse(null);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course course) {
        if (courseRepository.existsById(id)) {
            course.setId(id);
            return courseRepository.save(course);
        } else {
            return null; 
        }
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
