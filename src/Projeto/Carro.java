package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carro implements CarroInterface{
	
	private String nome;
	private String placa;
	private boolean ligado;
	
	public Carro(String nome, String placa) {
		super();
		this.nome = nome;
		this.placa = placa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean ligado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public void parar() {
		System.out.println("Desligando o carro...");
		System.out.println("Carro desligado!");
		try {
			new Thread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void iniciar(){
		this.setLigado(true);
		System.out.println("Ligando o carro...");
		System.out.println("Carro ligado!");
		try {
			new Thread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void acelerar(){
		System.out.println("Acelerando o carro!");
		try {
			new Thread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viraEsquerda(){
		System.out.println("Carro virando a esquerda!");
		try {
			new Thread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viraDireita(){
		System.out.println("Carro virando a direita!");
		try {
			new Thread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void frear() {
		System.out.println("Freiando o carro...");
		System.out.println("Carro parado!");
		try {
			new Thread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String obstaculos() {
		List<String> obstaculos = new ArrayList();
		obstaculos.add("Carro na garagem.");
		obstaculos.add("Carro na BR101.");
		obstaculos.add("Sinal Vermelho.");
		obstaculos.add("Sinal Verde.");
		obstaculos.add("Faixa de pedestre.");
		obstaculos.add("Destino a esquerda.");
		obstaculos.add("Destino a direita.");
		obstaculos.add("Britz a frente!");
		obstaculos.add("Buraco a direita.");
		obstaculos.add("Burado a esquerda.");
		obstaculos.add("Destino encontrado!");
		
		Random random = new Random();
		int numero = random.nextInt(10)+1;
		
		return obstaculos.get(numero);
	}
}
