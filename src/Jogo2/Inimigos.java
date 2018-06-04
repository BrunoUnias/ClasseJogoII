package Jogo2;

public class Inimigos extends Personagem{
	private int poder;
	private float furia;
	private Status status;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Inimigos() {
		super();
		
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public float getFuria() {
		return furia;
	}

	public void setFuria(float furia) {
		this.furia = furia;
	}
	
	
	public String mostrarInimigosDetalhado() {
		String nome = getNome();
		String raca = getRaca();
		String vida = getVida() + "";
		String poder = getPoder() + "";
		String furia = getFuria() + "";
		
		return nome + raca + vida + poder + furia;
		
	}
	
	public double danoSofrido() {
		return getVida() - status.getDano();
		
	}
	
	public double poderDeAtaque() {
		return getPoder() + getFuria();
		
	}

}
