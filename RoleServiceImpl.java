package com.gl.studentRegistration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.studentRegistration.entity.Role;
import com.gl.studentRegistration.repository.RoleRepository;

@Service
public class RoleServiceImpl {
	@Autowired
	private RoleRepository roleRepository;

	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	public Role findByRolename(String roleName) {
		return roleRepository.findByRolename(roleName);
	}

	public List<Role> findAllRoles() {
		return roleRepository.findAll();
	}

	public void deleteRole(Long id) {
		roleRepository.deleteById(id);
	}

	public void updateRole(Role role, Long id) {
		Role foundRole = roleRepository.findById(id).get();
		foundRole.setRolename(role.getRolename());
		roleRepository.save(foundRole);
	}

}
