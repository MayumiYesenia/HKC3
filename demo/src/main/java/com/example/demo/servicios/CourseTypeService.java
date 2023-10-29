package com.example.demo.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.CourseType;
import com.example.demo.repositorios.CourseTypeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseTypeService {
    @Autowired
    private CourseTypeRepository courseTypeRepository; 

    public List<CourseType> findAllCourseTypes() {
        return courseTypeRepository.findAll();
    }

    public CourseType getCourseTypeById(Long id) {
        Optional<CourseType> optionalCourseType = courseTypeRepository.findById(id);
        return optionalCourseType.orElse(null);
    }

    public CourseType createCourseType(CourseType courseType) {
        return courseTypeRepository.save(courseType);
    }

    public CourseType updateCourseType(Long id, CourseType courseType) {
        if (courseTypeRepository.existsById(id)) {
            courseType.setId(id);
            return courseTypeRepository.save(courseType);
        } else {
            return null; 
        }
    }

    public void deleteCourseType(Long id) {
        courseTypeRepository.deleteById(id);
    }
}

    