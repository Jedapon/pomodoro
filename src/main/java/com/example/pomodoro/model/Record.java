package com.example.pomodoro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="record")
public class Record {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "user_id" , nullable = false)
	private Long userId;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "work_session_count", nullable = false)
	private int workSessionCount;
	
	@Column(name = "total_time", nullable = false)
	private int totalTime;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getWorkSessionCount() {
		return workSessionCount;
	}

	public void setWorkSessionCount(int workSessionCount) {
		this.workSessionCount = workSessionCount;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	
	

}
