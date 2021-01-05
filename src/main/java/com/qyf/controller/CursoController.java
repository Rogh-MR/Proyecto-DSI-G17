package com.qyf.controller;
/*
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qyf.interfaceService.ICursoServ;
import com.qyf.model.Curso;

@Controller
@RequestMapping
public class CursoController {
	
	@Autowired
	private ICursoServ cursos;
	
	@GetMapping("/matriculaCurso/{id}")
	public String matricularse(@PathVariable int id, Model model) {
		Optional<Curso> curso = cursos.listarId(id);
		model.addAttribute("curso", curso);
		
		return "matriculaCurso";
	}
	
	@PostMapping("/guardarMatricula")
	public String guardarMatricula(@Validated Curso curso, Model model) {
		String dir = null;
		int i = cursos.guardar(curso);
		if(i == 0) {
			dir = "redirect:/matriculaCurso/"+curso.getId_curso().toString();
		}
		else {
			dir = "redirect:/";
		}
		return dir;
	}
}*/
