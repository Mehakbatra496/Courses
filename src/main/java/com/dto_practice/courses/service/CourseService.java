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


public interface CourseService {

    
    public String saveCourse(CourseRequestDTO dto);
       
    public List<CourseResponseDTO> getAllCourses();
    
    List<CourseResponseDTO> findByDurationInHours(int hours);
    List<CourseResponseDTO> findByDurationInHoursNative();
    List<CourseResponseDTO> findByDepartmentIdS(int deptId);
    
}
