package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Projeto {
	
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat Uno", "LPT-0248");
		carro.iniciar();
		
		while(carro.ligado()) {
			String obstaculo = carro.obstaculos();
			if(obstaculo.equals("Carro na garagem.")) {
				System.out.println(obstaculo);
				carro.acelerar();
			}else if(obstaculo.equals("Carro na BR101.")) {
				System.out.println(obstaculo);
				carro.acelerar();
			}else if(obstaculo.equals("Sinal Vermelho.")) {
				System.out.println(obstaculo);
				carro.frear();
			}else if(obstaculo.equals("Sinal Verde.")) {
				System.out.println(obstaculo);
				carro.acelerar();
			}else if(obstaculo.equals("Faixa de pedestre.")) {
				System.out.println(obstaculo);
				carro.frear();
			}else if(obstaculo.equals("Destino a esquerda.")) {
				System.out.println(obstaculo);
				carro.viraEsquerda();
			}else if(obstaculo.equals("Destino a direita.")) {
				System.out.println(obstaculo);
				carro.viraDireita();
			}else if(obstaculo.equals("Britz a frente!")) {
				System.out.println(obstaculo);
				carro.frear();
			}else if(obstaculo.equals("Buraco a direita.")) {
				System.out.println(obstaculo);
				carro.viraEsquerda();
			}else if(obstaculo.equals("Burado a esquerda.")) {
				System.out.println(obstaculo);
				carro.viraDireita();
			}else if(obstaculo.equals("Destino encontrado!")) {
				System.out.println(obstaculo);
				carro.setLigado(false);
				carro.parar();
			}
		}
		
	}
	

}
