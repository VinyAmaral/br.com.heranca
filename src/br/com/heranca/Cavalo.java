package br.com.heranca;

public class Cavalo extends Animal implements InterfaceAnimal{
	
	
	public void somAnimal() {
		System.out.println("Bart faz: hinn in in");
	}
	
	public void correr() {
		System.out.println("Bart está correndo");
	}

	@Override
	public void subir() {
		System.out.println("Bart está subindo");
		
	}
	
	

}

