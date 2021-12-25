package com.mm_project.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo")
public class TodoController {
	
	@GetMapping("todo-main")
	public void todoMain() {}
	
	@GetMapping("todo-detail")
	public void todoDetail() {}
	
	@GetMapping("todo-insert")
	public void todoInsert() {}
	
	@GetMapping("todo-modify")
	public void todoModify() {}
}
