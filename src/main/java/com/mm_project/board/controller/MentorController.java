package com.mm_project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class MentorController {
	
	@GetMapping("mentor")
	public void mentor() {}
	
	@GetMapping("mentor-form")
	public void mentorForm() {}
	
	@GetMapping("mentor-detail")
	public void mentorDetail() {}
	
	@GetMapping("mentor-modify")
	public void mentorModify() {}

}