package br.com.job.vacancy.management.app.alljobs.alljobs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.job.vacancy.management.app.alljobs.alljobs.dto.RequisicaoNovaVaga;
import br.com.job.vacancy.management.app.alljobs.alljobs.model.Vaga;
import br.com.job.vacancy.management.app.alljobs.alljobs.repository.VagaRepository;

@Controller
@RequestMapping("cadastroVaga")
public class VagaController {
	@Autowired
	private VagaRepository vagarepository;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoNovaVaga requisicao) {
		return "cadastroVaga/formulario";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovaVaga requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "cadastroVaga/formulario";
		}
		Vaga vaga = requisicao.toVaga();
		vagarepository.save(vaga);
		return "cadastroVaga/formulario";
	}
	

}
