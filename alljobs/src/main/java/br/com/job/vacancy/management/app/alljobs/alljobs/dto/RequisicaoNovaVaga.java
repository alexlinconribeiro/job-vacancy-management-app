package br.com.job.vacancy.management.app.alljobs.alljobs.dto;

import javax.validation.constraints.NotBlank;

import br.com.job.vacancy.management.app.alljobs.alljobs.model.Vaga;

public class RequisicaoNovaVaga {
	
	@NotBlank
	private String nomeVaga;
	@NotBlank
	private String descricaoVaga;
	@NotBlank
	private String requisitosVaga;
	@NotBlank
	private String localVaga;
	
	public String getNomeVaga() {
		return nomeVaga;
	}
	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}
	public String getDescricaoVaga() {
		return descricaoVaga;
	}
	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}
	public String getRequisitosVaga() {
		return requisitosVaga;
	}
	public void setRequisitosVaga(String requisitosVaga) {
		this.requisitosVaga = requisitosVaga;
	}
	public String getLocalVaga() {
		return localVaga;
	}
	public void setLocalVaga(String localVaga) {
		this.localVaga = localVaga;
	}
	public Vaga toVaga() {
		Vaga vaga = new Vaga();
		vaga.setDescricao(descricaoVaga);;
		vaga.setNome(nomeVaga);
		vaga.setRequisitos(requisitosVaga);
		vaga.setLocal(localVaga);
		return vaga;
	}
	

}
