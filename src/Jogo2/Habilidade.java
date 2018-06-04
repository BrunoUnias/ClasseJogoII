package Jogo2;

import java.util.HashMap;

public class Habilidade {
	private String nome;
	private float dano;
	
	HashMap<Integer, Habilidade> mapHabilidade = new HashMap<Integer, Habilidade>();
	
	public Habilidade(String nome, float dano) {
		this.nome = nome;
		this.dano = dano;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public float getDano() {
		return dano;
		
	}
	
	public void setDano(float dano) {
		this.dano = dano;
		
	}
	
	public String toString() {
		return "Nome  = " + getNome() + " Dano = " + getDano();
		
	}
	
	public HashMap getMapHabilidade() {
		return mapHabilidade;
		
		
	}
	
	public void setMapMagia(Integer numero,Habilidade habilidade) {
		mapHabilidade.put(numero, habilidade);
		
	}
	

}
