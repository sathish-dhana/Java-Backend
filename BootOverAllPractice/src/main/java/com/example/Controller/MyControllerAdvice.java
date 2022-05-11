package com.example.Controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.Exception.ProductException;

@ControllerAdvice
public class MyControllerAdvice {
	
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> MyProcutExceptionHandler(ProductException p) {
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), "success", "i created this");
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.ACCEPTED);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myNotify(HttpServletResponse resp, MethodArgumentNotValidException e) {
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), "my error", "i created this");
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_GATEWAY);
		
	}
}
