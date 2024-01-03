package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Projectentity;
import com.example.demo.repository.Projectrepo;

@RestController
public class Projectcontroller {
	@Autowired
	private Projectrepo repo;
	@PostMapping("/add")
	public Projectentity addpro(@RequestBody Projectentity pro ) {
		try {
			repo.save(pro);
			return pro;
		}catch(Exception e) {
			e.printStackTrace();
		}
	 
		return null;
	}
	}

