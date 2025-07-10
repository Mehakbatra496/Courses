package com.dto_practice.courses.dto;

import java.time.LocalDateTime;

public class CourseResponseDTO {

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	private Long id;
    private String title;
    private int durationInHours;
    private String level;
    private LocalDateTime createdAt;
}
