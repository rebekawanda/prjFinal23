package com.Grupo3.ProjetoFinal.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Grupo3.ProjetoFinal.entites.Jogo;
import com.Grupo3.ProjetoFinal.repositories.JogoRepository;

@Service
public class JogoService {
	
private final JogoRepository jogoRepository;
	
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	//inserir produto
    public Jogo savejogo(Jogo jogo) {
	    return jogoRepository.save(jogo);
		}

	// listar produto por id
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}

	// listar todos os produtos
	public List<Jogo> getAllJogos() {
		return jogoRepository.findAll();
	}

	// apagar produto
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
}
