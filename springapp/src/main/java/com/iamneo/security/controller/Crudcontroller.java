package com.iamneo.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.entity.Crudmodel;
import com.iamneo.security.service.Crudservice;
@CrossOrigin
@RestController
public class Crudcontroller {
	@Autowired
          
	
	    Crudservice s;
	   
		
		@PostMapping("/post")
		public Crudmodel addInfo(@RequestBody Crudmodel st) {
			return s.saveDetails(st);
		}
		
		@GetMapping("/get")
		public List<Crudmodel> fetchDetails(){
			return s.getDetails();
		}
		@GetMapping("/get/{vehicle_id}")
		public Optional<Crudmodel> fetchDetails(@PathVariable int vehicle_id){
			return s.getDetails(vehicle_id);
		}
		
		@PutMapping("/put")
		public Crudmodel updateInfo(@RequestBody Crudmodel st1) {
			return s.updateDetails(st1);
		}
		@DeleteMapping("/delete/{vehicle_no}")
		public String deleteInfo(@PathVariable("vehicle_no")int vehicle_id) {
			s.deleteDetails(vehicle_id);
			return "The element is deleted";
		}
	}
