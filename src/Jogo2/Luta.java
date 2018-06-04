package Jogo2;
import java.util.ArrayList;

public class Luta {
	private float dano; 
	private String luta;
	
	private ArrayList<Luta> listaLuta = new ArrayList<Luta>();
	
	public Luta(float dano, String luta) {
		this.dano = dano;
		this.luta = luta;
		
	}
	
	public String getLuta() {
		return luta;
		
	}
	
	public void setLuta(String luta) {
		this.luta = luta;
		
	}
	
	public float getDano() {
		return dano;
		
	}
	
	public void setDano(float dano) {
		this.dano = dano;
		
	}
	
	public ArrayList<Luta> getListaLuta(){
		return listaLuta;
		
	}
	
	public void setListaLuta(Luta luta) {
		listaLuta.add(luta);
		
	}

}
