package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	// Ruta personalizada para obtener todos los usuarios
	@GetMapping("/users")
	public List<User> allUsers(){
		return (List<User>) repository.findAll();
	}
	
	// Ruta personalizada para buscar por nombre
	@GetMapping("/user/name/{name}")
	public List<User> findByName(@PathVariable("name") String name) {
		return repository.findByName(name);
	}

    // Ruta personalizada para buscar por apellido
    @GetMapping("/user/surname/{surname}")
	public List<User> findBySurname(@PathVariable("surname") String surname) {
		return repository.findBySurname(surname);
	}
	
	// @PostMapping("/user")
	// public User createUser(@RequestBody User user) {
	// 	return repository.save(user);
	// }
	
	// @PutMapping("/user/{id}")
	// public User updateUser(@PathVariable int id ,@RequestBody User user) {
	// 	return repository.save(user);
	// }
	
	// @DeleteMapping("/user/{id}")
	// public void deleteUser(@PathVariable("id") Long id) {
	// 	repository.deleteById(id);
	// }
}
