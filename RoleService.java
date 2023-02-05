package com.gl.studentRegistration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.studentRegistration.entity.Role;

@Service
public interface RoleService {
	Role findByRolename(String rolename);

	Role saveRole(Role role);

	void updateRole(Role role, Long id);

	void deleteRole(Long id);

	List<Role> findAllRoles();

}
