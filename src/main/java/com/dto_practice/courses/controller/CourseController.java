package com.dto_practice.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto_practice.courses.dto.CourseRequestDTO;
import com.dto_practice.courses.dto.CourseResponseDTO;
import com.dto_practice.courses.service.CourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/courses")
public class CourseController {

	// in case of multiple bean of the same parent class/interface , we specify the exact bean to inject, is beneficial in loose coupling
	
    @Autowired
//	@Qualifier("newCourseService")
    private CourseService service;

    @PostMapping
    public String create(@RequestBody @Valid CourseRequestDTO dto) {
        return service.saveCourse(dto);
    }
    
    @GetMapping
    public ResponseEntity<List<CourseResponseDTO>> getAll() {
        return ResponseEntity.ok(service.getAllCourses()); // a list is returned
    }
    
    @GetMapping("/byhours/{hours}")
    public ResponseEntity<List<CourseResponseDTO>> getAllByDurationnHours(@PathVariable int hours) {
        return ResponseEntity.ok(service.findByDurationInHours(hours)); // a list is returned
    }
    
    
    @GetMapping("/nativebyhours")
    public ResponseEntity<List<CourseResponseDTO>> getAllByDurationnHoursNative() {
        return ResponseEntity.ok(service.findByDurationInHoursNative()); // a list is returned
    }
    
    @GetMapping("/nativebydeptid")
    public ResponseEntity<List<CourseResponseDTO>> findByDepartmentIdS(@Param(value = "id") int id) {
        return ResponseEntity.ok(service.findByDepartmentIdS(id)); // a list is returned
    }
    
    @GetMapping("/home")
    public void Home() {
    	System.out.print("Hie");
	}
    
    
}

