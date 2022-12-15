package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

}
