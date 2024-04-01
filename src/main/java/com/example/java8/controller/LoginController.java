package com.example.java8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java8.service.StreamService;
import com.example.model.Response;
import com.example.model.User;

@RestController
@RequestMapping("/java8")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	static int count=0;
	@Autowired
	private StreamService streamService;
   
	@GetMapping(path = "/login")
	public Response validateUser() {
		System.out.println("method called .............  "+count++);
		
		User user=new User();
		user.setId("101");
		user.setName("satya");
		
		Response response=new Response();
		response.setData(user);
		response.setHttpStatus(HttpStatus.OK);
     return response;
	}
}
