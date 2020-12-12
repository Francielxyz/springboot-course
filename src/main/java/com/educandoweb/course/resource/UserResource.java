package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//Recursos do Usuário
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Franciel", "Ruanvha15@gmai.com", "9 9124-4792", "123");
		return ResponseEntity.ok().body(u);
	}
	
}
