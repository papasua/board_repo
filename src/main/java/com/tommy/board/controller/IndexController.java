package com.tommy.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public String index() {
		log.info("index메소드 call");
		return "index";
	}
	
	@GetMapping("/newPost")
	public String newPost() {
		log.info("newPost메소드 call");
		return "smarteditor/newPost";
	}
}
