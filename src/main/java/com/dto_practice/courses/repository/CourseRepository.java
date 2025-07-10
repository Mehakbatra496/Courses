package com.dto_practice.courses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dto_practice.courses.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long> 
{
//	private String title;
//    private String instructor;
//    private int durationInHours;
//    private String level;
//    private String category;
	
	List<Course> findByDurationInHours(int i);
	
	
	@Query(nativeQuery = true, value="Select * from Course")
	List<Course> findByDurationInHoursNative();
	
	// ALso correct way
//	@Query("select c from Course c")
//	List<Course> findByDurationInHoursNative();

	@Query(nativeQuery = true, value="Select * from Course where department_id=:deptId")
	List<Course> findByDepartmentId(int deptId);


	List<Course> findByTitleContains(String string);
	
	
}

