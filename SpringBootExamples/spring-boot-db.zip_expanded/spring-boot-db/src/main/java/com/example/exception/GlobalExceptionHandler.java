package com.example.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		// takes all the errors and adds the default message to the List
		BindingResult errors = ex.getBindingResult();//.getFieldErrors();
				//.collect(Collectors.toList());
		Map<String,BindingResult> errorMap = new HashMap<>();
		errorMap.put("errors", errors);
		return ResponseEntity.status(403).body(errorMap);
	}

	@ExceptionHandler({ CustomerNotFoundException.class, TicketNotFoundException.class })
	public ResponseEntity<Object> handleResourceNotFound(RuntimeException ex) {
		Map<String, String> errors = new HashMap<String, String>();
		errors.put("error", ex.getMessage());
		return ResponseEntity.status(404).body(errors);
	}
}