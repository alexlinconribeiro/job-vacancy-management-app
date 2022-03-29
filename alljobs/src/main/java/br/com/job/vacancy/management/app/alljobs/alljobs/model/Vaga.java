package br.com.job.vacancy.management.app.alljobs.alljobs.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaga {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String nome;
	private String descricao;
	private String requisitos;
	private String local;
	@Enumerated(EnumType.STRING)
	private StatusVaga statusVaga;
	
	
	public StatusVaga getStatusVaga() {
		return statusVaga;
	}
	public void setStatusVaga(StatusVaga statusVaga) {
		this.statusVaga = statusVaga;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	
	
	
}
