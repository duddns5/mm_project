package com.mm_project.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mentoring")
public class MentoringController {
	
	@GetMapping("accept-page")
	public void acceptPage() {}
	
	@GetMapping("apply-complate")
	public void applyComplate() {}
	
	@GetMapping("mentor-apply")
	public void mentorApply() {}
	
	@GetMapping("mentor-list")
	public void mentorList() {}
	
	@GetMapping("mentor-manage")
	public void mentorManage() {}
	
	@GetMapping("mentor-rating")
	public void mentorRating() {}
	
	@GetMapping("payment-page")
	public void paymentPage() {}
	
}
