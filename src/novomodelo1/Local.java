package novomodelo1;

public class Local extends Cenario{
	protected String horario;
	protected String tempo;
	protected int hora; 
	
	 public Local( String nome, String tipo, float tamanho, int quantidade,String cor) {
		   super(nome, tipo,tamanho,quantidade,cor);
		   
	   }
	   
	   public Local() {
			super();
			
		}
	   
	   public String getHorario() {
		return horario;
		   
	   }
	   
	   public void setHorario(String horario) {
		   this.horario = horario;
		   
	   }
	   
	   public String getTempo() {
		return tipo;
		   
	   }
	   
	   public void setTempo(String tempo) {
		   this.tempo = tempo;
		   
	   }
	   
	   public int getHora() {
		   return hora;
		   
	   }
	   
	   public void setHora( int hora) {
		   this.hora = hora;
		   
	   }
}
