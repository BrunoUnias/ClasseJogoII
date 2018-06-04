package Jogo2;
import java.util.ArrayList;

public class MetodoLuta {
	private String descricao;
	private String nome;
	
	private ArrayList<Luta> listaLuta = new ArrayList<Luta>();
	private ArrayList<MetodoLuta> metodos = new ArrayList<MetodoLuta>();
	
	public MetodoLuta(String descricao,String nome) {
		this.descricao = descricao;
		this.nome = nome;
		
	}
	
	
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getDescricao() {
		return descricao;
		
	}
	
	public void setDescricao( String descricao) {
		this.descricao = descricao;
		
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
