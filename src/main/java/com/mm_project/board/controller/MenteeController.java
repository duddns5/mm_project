package com.mm_project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class MenteeController {
	
	@GetMapping("mentee")
	public void mentee() {}
	
	@GetMapping("mentee-form")
	public void menteeForm() {}
	
	@GetMapping("mentee-detail")
	public void menteeDetail() {}
	
	@GetMapping("mentee-modify")
	public void menteeModify() {}

}
