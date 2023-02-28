package com.org.hul.service;

import java.util.List;

import com.org.hul.entity.UserQgpRssmLevel;

public interface UserQgpRssmLevelService {
	
	public List<UserQgpRssmLevel> list();
	public UserQgpRssmLevel getById(String id);
	public UserQgpRssmLevel saveUserDetails(UserQgpRssmLevel userQgpRssmLevel);

}
