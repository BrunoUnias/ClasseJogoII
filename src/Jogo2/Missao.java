package Jogo2;
import java.util.ArrayList;


public class Missao {
	private String tipo;
	private int quantidade;
	
	private ArrayList<Luta> listaLuta = new ArrayList<Luta>();
	private ArrayList<MetodoLuta> metodos = new ArrayList<MetodoLuta>();
	
	public Missao(String tipo,int quantidad) {
		this.quantidade = quantidade;
		this.tipo = tipo;
		
	}
	
	
	
	public String getTipo() {
		return tipo;
		
	}
	
	public void setTipo() {
		this.tipo = tipo;
		
	}
	
	public int getQuantidade() {
		return quantidade;
		
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		
	}
	

	public ArrayList<MetodoLuta> getMetodo(){
		return metodos;
		
	}
	
	public void setMetodo(MetodoLuta metodo) {
		metodos.add(metodo);
		
	}
	
	public ArrayList<Luta> getListaLuta(){
		return listaLuta;
		
	}
	
	public void setListaLuta(Luta luta) {
		listaLuta.add(luta);
		
	}
}
