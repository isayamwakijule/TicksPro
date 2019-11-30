package com.tikcs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tikcs.Model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
