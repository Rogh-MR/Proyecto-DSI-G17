package com.qyf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qyf.model.Coordinador;

@Repository
public interface ICoordinador extends JpaRepository<Coordinador, Integer> {
	
}
