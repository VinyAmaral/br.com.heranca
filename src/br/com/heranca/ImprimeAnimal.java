package br.com.heranca;

public class ImprimeAnimal {

	public static void main(String[] args) {
	
	InterfaceAnimal bart = new Cavalo();
	Cavalo c1 = new Cavalo();
	
	c1.setNome("Bart");
	System.out.println("O nome do Cavalo é: " + c1.getNome());
	c1.setIdade(17);
	System.out.println("A idade dele é de: " + c1.getIdade());
	bart.somAnimal();
	bart.correr();
	bart.subir();
	
System.out.println("--------------------------------");

	InterfaceAnimal Luna = new Cachorro();
	Cachorro c2 = new Cachorro();

	c2.setNome("Luna");
	System.out.println("\nO nome da cachorra é: " + c2.getNome());
	c2.setIdade(5);
	System.out.println("A idade dela é de: " + c2.getIdade());
	Luna.somAnimal();
	Luna.correr();
	Luna.subir();

System.out.println("--------------------------------");	

	InterfaceAnimal Ju = new Preguica();
	Preguica c3 = new Preguica();

	c3.setNome("Ju");
	System.out.println("\nO nome da preguiça é: " + c3.getNome());
	c3.setIdade(20);
	System.out.println("A idade dela é de: " + c3.getIdade());
	Ju.somAnimal();
	Ju.correr();
	Ju.subir();


	}
}

