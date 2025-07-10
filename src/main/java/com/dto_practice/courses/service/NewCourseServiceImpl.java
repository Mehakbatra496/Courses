package com.dto_practice.courses.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.dto_practice.courses.dto.CourseRequestDTO;
import com.dto_practice.courses.dto.CourseResponseDTO;
import com.dto_practice.courses.model.Course;
import com.dto_practice.courses.repository.CourseRepository;

@Service
public class NewCourseServiceImpl 
{

    @Autowired
    private CourseRepository repository;
    
    @Autowired
    private ModelMapper modelMapper;


    public String saveCourse(CourseRequestDTO dto)
    {
       
//    	Course course = new Course();   // for course only 
//        course.setTitle(dto.getTitle());
//        course.setInstructor(dto.getInstructor());
//        course.setDurationInHours(dto.getDurationInHours());
//        course.setLevel(dto.getLevel());
//        course.setCategory("General"); // default or computed
    		
    	//instead of manually setting the Course object properties, we will use model mapper as
    	
    	Course course= modelMapper.map(dto, Course.class);
        
        
        Course saved = repository.save(course);    // only course type of object will be accepted

//        CourseResponseDTO response = new CourseResponseDTO();
//        response.setId(saved.getId());
//        response.setTitle(saved.getTitle());
//        response.setDurationInHours(saved.getDurationInHours());
//        response.setLevel(saved.getLevel());
//        response.setCreatedAt(saved.getCreatedAt());

        return "Data inserted successfully in DB from the new course";
    }
    
    
    
    public List<CourseResponseDTO> getAllCourses() {   
    	
        List<Course> courses = repository.findAll(); // courses list extracted from the DB      
        List<CourseResponseDTO> dtoList = new ArrayList<>(); // another list

        for (Course course : courses) {    //1  //2
       
//        	  CourseResponseDTO dto = new CourseResponseDTO();
//            dto.setId(course.getId());
//            dto.setTitle(course.getTitle());            
//            dto.setDurationInHours(course.getDurationInHours());
//            dto.setLevel(course.getLevel());
//            dto.setCreatedAt(course.getCreatedAt());
        	
        	CourseResponseDTO dto=	modelMapper.map(course, CourseResponseDTO.class);
            dtoList.add(dto); // old data is added to the new list 
            
           
        }

        return dtoList;   // return list
    }
    
    
    
    
    
    
    
    
    

}
