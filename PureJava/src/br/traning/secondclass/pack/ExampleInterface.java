package br.traning.secondclass.pack;

public interface ExampleInterface {
	
	void exampleMethod();
	
	public void anotherExampleMethod();
	
	default void defaultMethod() {
		System.out.println("Eu sou um metodo padrao, nao depende de nada da instancia da classe pra atingir meu objetivo xD");
	}

}
