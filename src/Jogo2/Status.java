package Jogo2;

public class Status {
	//private Barbaro barbaro;
	//private Cavaleiro cavaleiro;
	//private Mago mago;
	//private Ninja ninja;
	private int exp;
	private float dano;
	
	public Status() {
		//this.barbaro = barbaro;
		//this.cavaleiro = cavaleiro;
		this.exp = exp;
		this.dano = dano;
		
	}
	
	public Status(float dano, int exp) {
		//this.barbaro = barbaro;
		//this.cavaleiro = cavaleiro;
		this.exp = exp;
		this.dano = dano;
		
	}

	/*public Barbaro getBarbaro() {
		return barbaro;
		
	}

	public void setBarbaro(Barbaro barbaro) {
		this.barbaro = barbaro;
		
	}

	public Cavaleiro getCavaleiro() {
		return cavaleiro;
		
	}

	public void setCavaleiro(Cavaleiro cavaleiro) {
		this.cavaleiro = cavaleiro;
		
	}
	
	public Mago getMago() {
		return mago;
	}

	public void setMago(Mago mago) {
		this.mago = mago;
	}
	
	

	public Ninja getNinja() {
		return ninja;
	}

	public void setNinja(Ninja ninja) {
		this.ninja = ninja;
	}*/

	public int getExp() {
		return exp;
		
	}

	public void setExp(int exp) {
		this.exp = exp;
		
	}
	
	
	
	public float getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
		
	}
	
	public String mostrarStatusDetalhado() {
		String exp = getExp() + ""; 
		return exp;
		
	}

	/*public void mostrarStatusDetalhado() {	
		String nome = getBarbaro().getNome();
		String vida = getBarbaro().getVida() + "";
		String raca =  getBarbaro().getRaca();
		String furia = getBarbaro().getFuria() + "";
		String poder = getBarbaro().getPoder() + "";
		
		System.out.println(nome + vida + raca + furia + poder);
		
	}
	
	public double totalDano() {
		return getBarbaro().getVida() - getDano();
		
	}
	
	public void mostrarStatusDetalhado1() {
		String nome = getCavaleiro().getNome();
		String vida = getCavaleiro().getVida() + "";
		String raca =  getCavaleiro().getRaca();
		
		System.out.println(nome + vida + raca);
		
	}
	
	public double totalDano2() {
		return getCavaleiro().getVida() - getDano();
		
	}
	
	public void mostrarStatusDetalhado2() {
		String nome = getMago().getNome();
		String vida = getMago().getVida() + "";
		String raca = getMago().getRaca();
		String furia = getMago().getFuria() + "";
		String poder = getMago().getPoder() + "";
		
		System.out.println(nome + vida + raca + furia + poder);
		
	}
	
	public double totalDano3() {
		return getMago().getVida() - getDano();
		
	}
	
	public void mostrarStatusDetalhado4() {
		String nome = getNinja().getNome();
		String vida = getNinja().getVida() + "";
		String raca = getNinja().getRaca();
		String furia = getNinja().getFuria() + "";
		String poder = getNinja().getPoder() + "";
		
		System.out.println(nome + vida + raca + furia + poder);
		
	}
	
	public double totalDano4() {
		return getNinja().getVida() - getDano(); 
		
	}
	
	public double poderAtaque() {
		return getBarbaro().getPoder() * getBarbaro().getFuria();
		
	}*/

}
