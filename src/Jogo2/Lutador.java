package Jogo2;

public class Lutador extends Personagem implements Funcionalidade{
	protected int poder;
	protected float furia;
	private Status status;
	
	public Lutador() {
		super();
		
	}
	
	public Lutador(String nome, String raca, float vida) {
		super(nome,raca,vida);
		
	}
	
	public Lutador(int poder, float furia, Status status) {
		this.furia = furia;
		this.poder = poder;
		this.status = status;
		
	}
	
	/*public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getRaca() {
		return raca;
		
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
		
	}
	
	public float getVida() {
		return vida;
		
	}
	
	public void setVida(float vida) {
		this.vida = vida;
		
	}*/
	
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
	
	public Status getStatus() {
		return status;
		
	}
	
	public void setStatus(Status status) {
		this.status = status;
		
	}
	
	public String mostrarLutadorDetalhado() {
		String nome =  getNome();
		String raca =  getRaca();
		String vida = getVida() + "";
		String exp = status.mostrarStatusDetalhado() + "";
		//String poder = getPoder() + "";
		//String furia = getFuria() + "";
		
		return nome + raca + vida + exp;
		
	}
	
	public void DanoInimigo() {
		
	}
	
	public float danoSofrido() {
		return  getVida() - status.getDano();
	}
	
	public double poderDeAtaque() {
		return getPoder() + getFuria();
		
	}
	
	public void incrementarVida() {
		
	}
	
	public void decrementarVida() {
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " +getNome() + "Raca: " +getRaca() + " vida: " +getVida();
	}
	
	@Override
	public void treinar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aprenderMagia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ataqueEdefesa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarAcao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lancarMagia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morrer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pular() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarAtividadePrincipal() {
		// TODO Auto-generated method stub
		
	}

}
