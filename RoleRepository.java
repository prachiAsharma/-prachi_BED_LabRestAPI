package com.gl.studentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.studentRegistration.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRolename(String roleName);

}
