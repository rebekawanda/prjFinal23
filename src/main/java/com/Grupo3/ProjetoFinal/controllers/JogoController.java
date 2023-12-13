package com.Grupo3.ProjetoFinal.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Grupo3.ProjetoFinal.entites.Jogo;
import com.Grupo3.ProjetoFinal.services.JogoService;

@RestController
@RequestMapping("/jogos")
public class JogoController {
	
	@Autowired
	private final JogoService jogoService;
	
		
	@Autowired
	public JogoController(JogoService jogoService) {
		this.jogoService = jogoService;
	}
	
	@GetMapping("/home")
	public String paginaInicial() {
		return "index"; 
}
	
	 @PostMapping("/create")
	    public Jogo createJogo(@RequestBody Jogo jogo) {
		 return jogoService.savejogo(jogo);
	    }

	@GetMapping("/{id}")
	//Localiza jogo por ID
	public ResponseEntity<Jogo> getJogo(@PathVariable Long id) {
		Jogo jogo = jogoService.getJogoById(id);
		if (jogo != null) {
			return ResponseEntity.ok(jogo);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	//Deleta um jogo
	public void deleteJogo(@PathVariable Long id) {
		jogoService.deleteJogo(id);
	}
	
	@GetMapping
	public List<Jogo> getAllJogos(){
		return jogoService.getAllJogos();
	}
}
