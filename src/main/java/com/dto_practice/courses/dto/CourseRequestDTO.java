package com.dto_practice.courses.dto;

import com.dto_practice.courses.model.Department;

import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CourseRequestDTO {

	  @NotBlank(message = "Title is required")
	    private String title;

	    @NotNull(message = "Duration is required")
	    @Min(value = 1, message = "Duration must be at least 1 hour")
	    private Integer durationInHours;

	    @NotBlank(message = "Level is required")
	    private String level;
	    
	    @NotBlank(message = "instructor is required")
	    private String instructor;

	    private String description;  // ✅ Extra field not in entity
	    
	   
	
		public String getTitle() {
			return title;
		}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Integer getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(Integer durationInHours) {
		this.durationInHours = durationInHours;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

