package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
public class Calendar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date scheduled_date;
	
	@NotBlank
	@DateTimeFormat(pattern = "HH:mm")
	private Date scheduled_time;
	
	@NotBlank
	@Size(min=1, max=20)
	private String scheduled_title;
}
