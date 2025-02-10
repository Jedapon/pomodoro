package com.example.pomodoro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pomodoro.service.RecordService;

@RestController
@RequestMapping("/api")
public class RecordController {
	@Autowired
	private RecordService service;
	
	@GetMapping("/test-insert")
	public String testInsert() {
		service.saveSampleRecord();
		return "Record Inserted";
	}
}
