package com.mvcproject2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc2")
public class mvc_2 {

	@GetMapping("/n2")
	public ResponseEntity<String> n2() {
		String str="start mvc project 2";
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
		
	}
}
