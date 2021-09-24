package gov.michigan.bridges.rt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ReferenceDataController {

	
	private String serviceCode="test";
	
	@GetMapping("/hello")
	@Operation(summary = "API #1 level comment goes here ......")
	public String hello() {
		
		return "Hello, " + serviceCode; 

	}
	
		@GetMapping("/hello1")
	@Operation(summary = "API #1 level comment goes here ......")
	public String hello() {
		
		return "Hello"; 

	}
}
