package Jogo2;

import java.util.HashMap;

public class Magia {
	private String nome;
	private float dano;
	
	public Magia(String nome, float dano) {
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
	
	
	/*public void setMapMagia(Integer numero,Magia magia) {
		mapMagia.put(numero, magia);
		
	}*/
	
	
	
}
