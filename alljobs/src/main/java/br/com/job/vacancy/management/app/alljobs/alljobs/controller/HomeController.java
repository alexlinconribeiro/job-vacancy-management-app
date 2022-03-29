package br.com.job.vacancy.management.app.alljobs.alljobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.job.vacancy.management.app.alljobs.alljobs.model.Vaga;
import br.com.job.vacancy.management.app.alljobs.alljobs.repository.VagaRepository;


@Controller
public class HomeController {
	@Autowired
	private VagaRepository vagaRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Vaga> vagas = vagaRepository.findAll();
		model.addAttribute("vagas", vagas);
		return "home";
		
	}

}
