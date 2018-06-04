package Jogo2;

public class Barbaro extends Lutador{
	
	public Barbaro() {
		super();
		
	}
	
	public Barbaro(String nome, String raca, float vida) {
		super(nome, raca, vida);
		
	}
	
	public int getPoder() {
		return poder;
		
	}
	
	public void setPoder(int poder) {
		if(poder <= 700) {
			this.poder = poder;
			
		}
		else {
			System.out.println("poder nao e permitido.");
		
		}
		
		}
		
	public float getFuria() {
		return furia;

	}
	
	public void setFuria(float furia) {
		if(furia <= 5.0f) {
			this.furia = furia;
			
		}else {
			System.out.println("Essa furia nao e permitida.");
		}
		
	}
	
	public void ataqueMachado() {
		if(poder <= 700 && furia <= 5.0f) {
			System.out.println("machadada pode ser realizada.");
			
		}
		else {
			System.out.println("machadada nao pode ser realizada.");
			
		}
		
	}

}
