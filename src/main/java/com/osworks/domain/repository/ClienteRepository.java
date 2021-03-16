package com.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osworks.domain.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	List<Cliente> findByName(String name);
	List<Cliente> findByNameContaining(String name);
	Cliente findByEmail(String email);
}
