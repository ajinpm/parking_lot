package com.baton.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.baton.service.LevelService;
import org.springframework.web.bind.annotation.*;

public class LevelController {
	
	@Autowired
	LevelService levelService;
	
	@PutMapping("/addlevel")
	private int addlevel() {
		return levelService.addLevel();
	}
	

}
