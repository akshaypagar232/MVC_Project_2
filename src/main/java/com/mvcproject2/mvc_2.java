package com.mvcproject2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mvc2")
public class mvc_2 {
	
	@GetMapping("/n2")
	public ResponseEntity<student> n2(@RequestParam int id) {

		student s1=new student(11, "sdfc", "gruhefiguh");
		student s2=new student(12, "edfk", "fhgiuy");
		student s3=new student(13, "fdgf", "hfdghiuh");
		student s4=new student(14, "gdsf", "fhughf");
		student s5=new student(15, "sirf", "hjhgfjkg");
		student s6=new student(16, "eggf", "gfkfjji");
		student s7=new student(17, "wdff", "bfhigfg");
		student s8=new student(18, "aasf", "hdfbfjgr");
		
		
		List<student> st= new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		st.add(s6);
		st.add(s7);
		st.add(s8);
		
		student ss1 =new student();
		
		for (student student : st) {
			
			if (student.getSid()==id) {
				
				ss1.setSid(student.getSid());
				ss1.setSname(student.getSname());
				ss1.setScoll(student.getScoll());

			}
			
		}

		System.out.println(ss1);
		
		
		return new ResponseEntity<student> (ss1,HttpStatus.OK) ;
		
		
//		Stream<student> stream = st.stream();
//		
//		Stream<student> filter = stream.filter(   (i)->i.getSid()==id    );
//		
//		List<student> collect = filter.collect(Collectors.toList());
//		
//		return new ResponseEntity<List<student>>(collect,HttpStatus.OK);
	
		
	}
}
