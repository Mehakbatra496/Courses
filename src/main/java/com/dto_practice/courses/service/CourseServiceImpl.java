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
@Primary
public class CourseServiceImpl implements CourseService
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

        return "Data inserted successfully in DB";
    }


	@Override
	public List<CourseResponseDTO> getAllCourses() {
		// TODO Auto-generated method stub
//		repository.get
		return null;
	}
    
	
	public List<CourseResponseDTO> findByDurationInHours(int hours)
	{
		
	List<Course> courses= repository.findByDurationInHours(hours);
	ArrayList<CourseResponseDTO> list2= new ArrayList<CourseResponseDTO>();
	
	for(Course c: courses)
	{
		list2.add(modelMapper.map(c, CourseResponseDTO.class));
	}
	
	return list2;
		
				 
	}
	
    public List<CourseResponseDTO> findByDurationInHoursNative()
    {
    	List<Course> courses=repository.findByDurationInHoursNative();
    	ArrayList<CourseResponseDTO> list2= new ArrayList<CourseResponseDTO>();
    	
    	for(Course c: courses)
    	{
    		list2.add(modelMapper.map(c, CourseResponseDTO.class));
    	}
    	
    	return list2; 
    }
    
    public List<CourseResponseDTO> findByDepartmentIdS(int deptId)
    {
    	List<Course> courses=repository.findByDepartmentId(deptId);
    	ArrayList<CourseResponseDTO> list2= new ArrayList<CourseResponseDTO>();
    	
    	for(Course c: courses)
    	{
    		list2.add(modelMapper.map(c, CourseResponseDTO.class));
    	}
    	
    	return list2; 
    }
    
    
    
//    public List<CourseResponseDTO> getAllCourses() {   
//    	
//        List<Course> courses = repository.// courses list extracted from the DB      
//        List<CourseResponseDTO> dtoList=new ArrayList<>(); // another list
//
//        for (Course course : courses) {    //1  //2
//       
////        	  CourseResponseDTO dto = new CourseResponseDTO();
////            dto.setId(course.getId());
////            dto.setTitle(course.getTitle());            
////            dto.setDurationInHours(course.getDurationInHours());
////            dto.setLevel(course.getLevel());
////            dto.setCreatedAt(course.getCreatedAt());
//        	
//        	CourseResponseDTO dto=	modelMapper.map(course, CourseResponseDTO.class);
//            dtoList.add(dto); // old data is added to the new list 
//            
//           
//        }
//
//        return dtoList;   // return list
//    }
    
        
    
    
    
    
    

}
