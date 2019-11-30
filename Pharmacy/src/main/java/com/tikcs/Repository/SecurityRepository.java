package com.tikcs.Repository;

import org.springframework.stereotype.Repository;

public interface SecurityRepository {
	String findLoggedInUsername();

    void autoLogin(String username, String password);
}
