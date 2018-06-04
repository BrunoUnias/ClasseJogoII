package Jogo2;

import java.util.ArrayList;
import java.util.HashMap;

public class Mago extends Lutador{
	ArrayList<Luta> lutas = new ArrayList<Luta>();
	HashMap<String, Magia> magia = new HashMap<String, Magia>();
	
	public Mago(String nome, String raca, float vida) {
		super(nome,raca,vida);
		
	}
	
	public int getPder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		if(poder <= 1000) {
			this.poder = poder;
			
		}
		
	}
	
	public float getFuria() {
		return furia;
		
	}
	
	public void setFuria(float furia) {
		if(furia <= 1.0) {
			this.furia = furia;
			
		}
		
	}
	
	public void adicionarMagia() {
		
	}

}
