package com.anluge.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anluge.aula01.modelo.Papel;

public interface PapelRepository extends JpaRepository<Papel , Long> {
 
	 Papel findByPapel(String papel);
}
