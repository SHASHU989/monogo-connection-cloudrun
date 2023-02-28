package com.org.hul.srevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.hul.entity.UserQgpRssmLevel;
import com.org.hul.repository.UserQgpRssmLevelRepo;
import com.org.hul.service.UserQgpRssmLevelService;
@Service
public class UserQgpRssmLevelServiceImpl implements UserQgpRssmLevelService {
	
	@Autowired
	private UserQgpRssmLevelRepo userQgpRssmLevelRepo;
	@Override
	public List<UserQgpRssmLevel>list(){
		
		return userQgpRssmLevelRepo.findAll();
		
	}
	
	public UserQgpRssmLevel getById(String id) {
		return userQgpRssmLevelRepo.findById(id).get();
	}
	
	public UserQgpRssmLevel saveUserDetails(UserQgpRssmLevel userQgpRssmLevel)
	{
		return userQgpRssmLevelRepo.save(userQgpRssmLevel);
	}
	
	

}
