package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
