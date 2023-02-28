package com.org.hul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.hul.entity.UserQgpRssmLevel;
import com.org.hul.service.UserQgpRssmLevelService;

@RestController
@RequestMapping("/qgp/rssm")
public class UserQgpRssmLevelController {
	@Autowired
	private UserQgpRssmLevelService userQgpRssmLevelService;
	@GetMapping("/all")
	public List<UserQgpRssmLevel> list(){
		return userQgpRssmLevelService.list();
	}
	@GetMapping("/{id}")
	public UserQgpRssmLevel getById(@PathVariable("id") String id) {
		return userQgpRssmLevelService.getById(id);
	}
	@PostMapping("/users")
	public UserQgpRssmLevel saveUserDetails(@RequestBody UserQgpRssmLevel userQgpRssmLevel)
	{
		return userQgpRssmLevelService.saveUserDetails(userQgpRssmLevel);
	}
	
}
