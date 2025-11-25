package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileRepository profileDao;
	
	@Override
	public List<ProfileDTO> getProfiles() {
		List<Profile> list = profileDao.findAll();
		return list.stream()
		.map(item -> new ProfileDTO(item.getId(),
				item.getName(), item.getPhone(), item.getDob()))
		.collect(Collectors.toList());
		
	}
}
