package com.example.java8.controller;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

public class Interview {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		
		List<Integer> newNUmbers=numbers.stream().filter(s->s%2==0).map(s->s*s).collect(Collectors.toList());
		System.out.println("newNUmbers ==  "+newNUmbers);
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "satya");  // map size 10
		
//		key =1;
//		created hasValue key
//		
//		hasValue%current_size_map == bucket_number (8)
		
//		8 bucket ---> == is there any other key is avaibale at thic bucket or not
//		  if ava then it will call .equal() then able to find that both is same or not
//		  if key is same , in this it will update then value which associated with existing key and return then prev value
//				  if key 
		
//		1. saga
//		2. even driven (sns, sqs)
//		3. circut breake
//		4. agg log
//		
//		mvc
//		sigleton
//		factory
//		builder
//		adaptor 
//		
		
		
            
		//@RestController == @controller + @ResponseBody
		
		//@SpringBootApplication
		//@SpringBootConfiguration
		//@Configuration
		
		// @Autowire
		
//		@comonent ---
//		 @contrlooer
//		 @service
//		 @Repository
		
		// git clone <url>
		// git checkout -b <local_branch>  <remote_branch>
		// git checkout -b <local_BRnach>
		// 
		
		
		
	}
	
	// create a method to find duplicate element in array list
	

}
