package br.com.heranca;

public class Preguica extends Animal implements InterfaceAnimal{

	public void somAnimal() {
		System.out.println("Som da Preguiça: ah ah ah...zzqzzq");
	}
	
	public void subir() {
		System.out.println("Preguiça subindo.......");
	}

	public void correr() {
		System.out.println("A preguiça não corre");
		
	}
}

