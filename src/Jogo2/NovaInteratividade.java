package Jogo2;

import java.util.ArrayList;
import java.util.Scanner;


public class NovaInteratividade {
	public static void main(String[] args) {
		Scanner writer = new Scanner(System.in);
		
		Barbaro barbaro = new Barbaro("Ragor", "Humano", 300.f);
		Ninja ninja = new Ninja("kusanagi", "humano", 200.f );
		Cavaleiro cavaleiro = new Cavaleiro("Arthur", "humano", 200.f);
		
				
		ArrayList<Lutador> lutadores1 = new ArrayList<Lutador>();
		ArrayList<Lutador> lutadores2 = new ArrayList<Lutador>();
		ArrayList<Lutador> lutadores3 = new ArrayList<Lutador>();
		ArrayList<Lutador> lutadores4 = new ArrayList<Lutador>();
		
		ArrayList<Status> status1 = new ArrayList<Status>();
		
		lutadores1.add(barbaro);
		lutadores2.add(ninja);
		lutadores3.add(cavaleiro);
		
		for (Lutador lutador : lutadores1) {
			lutador.mostrarLutadorDetalhado();
			
		}
		
		boolean read = true;
		
		while(read) {
			System.out.println("1- criar guerreiro 2- deletar guerreiro 3- mostrar guerreiro");
			writer.nextLine();
			String auxNome = writer.next();
			String auxRaca = writer.next();
			float auxVida = writer.nextFloat();
			int opcoes = writer.nextInt();
			writer.nextLine();
			
			if(opcoes == 1) {
				System.out.println("informar nome:");
				auxNome = writer.next();
				System.out.println("informar raca:");
				auxRaca = writer.next();
				System.out.println("informar a vida:");
				auxVida = writer.nextFloat();
				Barbaro adcBarbaro = new Barbaro(auxNome, auxRaca, auxVida);
				lutadores1.add(adcBarbaro);
				
			}
			
			else if(opcoes == 2) {
				System.out.println("remover do jogo");
				System.out.println("1- barbaro");
				int opcoes2 = writer.nextInt();
				if(opcoes == 1) {
					for(int i = 0; i <= lutadores1.size(); i++ ) {
						if(auxNome.equals(lutadores1.get(i).getNome())) {
							lutadores1.remove(i);
							
						}
					}
				}
				
			}
			
			else if(opcoes == 3) {
				System.out.println("1- Barbaro 2- Ninja 3- Cavaleiro");
				int opcoes1 = writer.nextInt();
				writer.nextLine();
				if(opcoes1 == 1) {
					for (Lutador lutador : lutadores1) {
						System.out.println("mostrar lutador:");
						lutador.mostrarLutadorDetalhado();
				}
					
				}
				
				else if(opcoes1 == 2) {
					for (Lutador lutador : lutadores2) {
						lutador.mostrarLutadorDetalhado();
						
					}
				}
				
				else if(opcoes1 == 3) {
					for (Lutador lutador : lutadores3) {
						lutador.mostrarLutadorDetalhado();
						
					}
				}
			}
		}
		
	}

}
