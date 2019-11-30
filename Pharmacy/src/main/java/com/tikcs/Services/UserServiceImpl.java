package com.tikcs.Services;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tikcs.Model.User;
import com.tikcs.Repository.RoleRepository;
import com.tikcs.Repository.UserRepository;
import com.tikcs.Repository.UserServiceRepository;

public class UserServiceImpl implements UserServiceRepository {

	
	@Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		//Issue to be resolved
		//I expect to find the list of select roles only to be set to this user not all as from roleRepository.findAll() 
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);

	}

	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

}
