package com.Saksoft_assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Saksoft_assignment.entities.SokSoftEmployee;
import com.Saksoft_assignment.impl.SendMessage;
import com.Saksoft_assignment.services.SokSoft_Service;

@RestController
@RequestMapping("/soksoft")
public class SokSoft_Controller {

	@Autowired
	private SokSoft_Service service;

	@PostMapping
	public ResponseEntity<SokSoftEmployee> createSokSoftEmployee(@RequestBody SokSoftEmployee sse) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.createSokSoftEmployee(sse));
	}

	@GetMapping("/{id}")
	public ResponseEntity<SokSoftEmployee> getSingleSokSoftEmployee(@PathVariable int id) {
		return ResponseEntity.ok(this.service.getSingleSokSoftEmployee(id));
	}

	@GetMapping
	public ResponseEntity<List<SokSoftEmployee>> getAllSokSoftEmployee() {
		return ResponseEntity.ok(this.service.getAllSokSoftEmployee());
	}

	@PutMapping("/{id}")
	public ResponseEntity<SokSoftEmployee> updateSokSoftEmployee(@RequestBody SokSoftEmployee sse,
			@PathVariable int id) {
		return ResponseEntity.ok(this.service.updateSokSoftEmployee(sse, id));
	}

	@DeleteMapping("/{id}")
	public SendMessage deleteSokSoftEmployee(@PathVariable int id) {
		return this.service.deleteSokSoftEmployee(id);
	}

}
