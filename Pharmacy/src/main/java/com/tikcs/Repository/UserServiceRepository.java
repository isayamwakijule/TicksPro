package com.tikcs.Repository;

import org.springframework.stereotype.Repository;

import com.tikcs.Model.User;

public interface UserServiceRepository {
	void save(User user);

    User findByUsername(String username);
}
