package br.com.heranca;

public class Cachorro extends Animal implements InterfaceAnimal {

	public void somAnimal() {
		System.out.println("Som do Cachorro: Au au au");
	}
	
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

	public void subir() {
		System.out.println("Cachorro subindo");
	}
}

