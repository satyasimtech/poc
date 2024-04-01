package com.example.java8.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class Student {

	 //  @Autowired
	// private StudentService;
	//@GetMapping(path = "/{id}")
	public static void main(String[] args) {
		
	
		//return null;
		
	//	Map<Integer, Lits<Integer>>
//		int[] arr = {2, 4, 6, 8, 2, 10, 4, 12, 6};
		
	//	[2,4,36,8,2,10,4,144,36]
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);


		List<Integer> newNumbers=new ArrayList<Integer>();
		
		numbers.stream().filter(s->s%3==0).map(s->s*s).collect(Collectors.toList());
		
		numbers.stream().forEach(s->{
			if(s%3==0) {
				newNumbers.add(s*s);
			}else {
				newNumbers.add(s);
			}
		});
		
		System.out.println(numbers);
		System.out.println(newNumbers);

				
//		2 -> 0,4
//		4 -> 1,6
//		6 -> 2,8
		
	}
}
