package com.mm_project.validator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

public class ValidatorResult {
	
	private Map<String,Object> error;
	
	public ValidatorResult() {
		error = new HashMap<>();
	}
	
	public void addErrors(Errors errors) {
		for (FieldError fieldError : errors.getFieldErrors()) {
			error.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
	}
	
	public Map<String,Object> getError(){
		return error;
	}

}
