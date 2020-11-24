package com.qyf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qyf.model.Departamento;
import com.qyf.model.DeptoResponse;

@Repository
public interface IDepartamento extends JpaRepository<Departamento, Integer>{
	
	@Query("SELECT d FROM Departamento d WHERE "+
	"CONCAT(d.id_depto, d.departamento) LIKE %?1%")
	public List<Departamento> findAll(String key);
	
	@Query("SELECT new com.qyf.model.DeptoResponse(d.id_depto,d.id_jefe) FROM Jefes_Depto j "+
	"RIGHT OUTER JOIN Departamento d ON j.departamento.id_depto = d.id_depto")
	public List<DeptoResponse> listaDepartamentos();
}
