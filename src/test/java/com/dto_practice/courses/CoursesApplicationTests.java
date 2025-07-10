package com.dto_practice.courses;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.dto_practice.courses.model.Course;
import com.dto_practice.courses.repository.CourseRepository;

@SpringBootTest
@ComponentScan(basePackages = "com.dto_practice.courses")
class CoursesApplicationTests {

	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void contextLoads() {
	}

	//test cases written here
	
	@Test
	public void testCourseRepository()
	{
		System.out.println("Testing course repo");
		List<Course> courses=courseRepository.findByDepartmentId(1);
		
		courses.forEach(System.out::println);
		System.out.println("Courses found: " + courses.size());
		
		
		List<Course> courses2=courseRepository.findByTitleContains("Spring");
		courses2.forEach(System.out::println);
		System.out.println("Courses found: " + courses2.size());

	}
	
	
	@Test
	public void testCourseRepository2()
	{	
		List<Course> courses2=courseRepository.findByTitleContains("boot");
		courses2.forEach(System.out::println);
		System.out.println("Courses found: " + courses2.size());

	}
	
}
