package main;

import entity.Jogador;
import entity.Time;

public class TimeApp {

	public static void main(String[] args) {
		
		
		Time vasco = new Time(1L, "Vasco");
		vasco.adicionarJogador(new Jogador(10L, "Roberto Dinamite", "Atacante"));
		vasco.adicionarJogador(new Jogador(11L, "Juninho Pernambucano", "Meio Campo"));
		Time botafogo = new Time(2L, "Botafogo");
		botafogo.adicionarJogador(new Jogador(20L, "Garrincha", "Atacante"));
		botafogo.adicionarJogador(new Jogador(21L, "Nilton Santos", "Lateral"));
		Time flamengo = new Time(3L, "Flamengo");
		flamengo.adicionarJogador(new Jogador(30L, "Zico", "Meio Campo"));
		flamengo.adicionarJogador(new Jogador(31L, "Júnior", "Lateral"));
		Time fluminense = new Time(4L, "Fluminense");
		fluminense.adicionarJogador(new Jogador(40L, "Whashington", "Atacante"));
		fluminense.adicionarJogador(new Jogador(31L, "Assis", "Atacante"));
		
		System.out.println(vasco);
		System.out.println(botafogo);
		System.out.println(flamengo);
		System.out.println(fluminense);	
		
	}

}
