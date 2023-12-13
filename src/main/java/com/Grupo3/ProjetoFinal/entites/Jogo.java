package com.Grupo3.ProjetoFinal.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class Jogo {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		// variaveis
		private Long id;

		private String nome;

		private String genero;
		
		private String descricao;
		
		private String integrantes;		

		private String url;
		
		private String thumbnail;
		

		//metodos
        public Long getId() {
	        return id;
        }
        public void setId(Long id) {
        	this.id = id;
        }
        
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public String getIntegrantes() {
			return integrantes;
		}
		public void setIntegrantes(String integrantes) {
			this.integrantes = integrantes;
		}
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		
		public String getThumbnail(){
			return thumbnail;
		}
		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}
	}


