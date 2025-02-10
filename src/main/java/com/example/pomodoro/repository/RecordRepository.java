package com.example.pomodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pomodoro.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
