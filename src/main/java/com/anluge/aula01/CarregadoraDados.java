package com.anluge.aula01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anluge.aula01.modelo.Papel;
import com.anluge.aula01.repository.PapelRepository;

@Component
public class CarregadoraDados implements CommandLineRunner {
	 
	@Autowired
	private PapelRepository papelRepository;

	@Override
	public void run(String... args) throws Exception {
		
		 String[] papeis = {"ADMIN" , "USER" , "BIBLIOTECARIA"};
		  for(String papelString: papeis) {
			  Papel papel = papelRepository.findByPapel(papelString);
			    if(papel == null) {
			    	papel = new Papel(papelString);
			    	papelRepository.save(papel);
			    }
		  }

	}

}
