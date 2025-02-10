package com.example.pomodoro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pomodoro.model.Record;
import com.example.pomodoro.repository.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository repository;
	
	public void saveSampleRecord() {
		Record record = new Record();
		record.setUserId(1L);
		record.setDate("2025-02-09");
		record.setWorkSessionCount(3);
        record.setTotalTime(75);
        repository.save(record);
	}
}
