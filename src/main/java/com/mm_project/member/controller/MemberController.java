package com.mm_project.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@GetMapping("change-pw")
	public void changePw() {}
	
	@GetMapping("confirm-pw")
	public void confirmPw() {}
	
	@GetMapping("forget-password")
	public void forgetPassword() {}
	
	@GetMapping("join-form-mentee")
	public void joinFormMentee() {}
	
	@GetMapping("join-form-mentor")
	public void joinFormMentor() {}
	
	@GetMapping("join-rule")
	public void joinRule() {}
	
	@GetMapping("login")
	public void login() {}
	
	@GetMapping("mentor-info")
	public void mentorInfo() {}
	
	@GetMapping("mypage")
	public void mypage() {}
	
}
