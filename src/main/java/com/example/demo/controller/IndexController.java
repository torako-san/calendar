package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Calendar;
import com.example.demo.repository.CalendarRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {
	
	private final CalendarRepository repository;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("Calendar", repository.findAll());
		return "index";
	}
	
	@GetMapping("/add")
	public String addCalendar(@ModelAttribute Calendar calender) {
		return "add";
	}
	
	
	@PostMapping("/schedule")
	public String postCalendar(@Validated @ModelAttribute Calendar calendar, BindingResult result) {
		if (result.hasErrors()) {
			return "add";
		}
		repository.save(calendar);
		return "redirect:/";
		
		
	}
	
}