package com.petruciostech.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petruciostech.osworks.domain.model.Cliente;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Long> {

	List<Cliente> findAll();

}
