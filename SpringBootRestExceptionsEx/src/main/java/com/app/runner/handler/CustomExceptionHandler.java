package com.app.runner.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.runner.exception.UserNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> getId(UserNotFoundException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
