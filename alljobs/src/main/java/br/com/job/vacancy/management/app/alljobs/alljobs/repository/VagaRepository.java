package br.com.job.vacancy.management.app.alljobs.alljobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.job.vacancy.management.app.alljobs.alljobs.model.Vaga;
@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long>{
	
		
	}


