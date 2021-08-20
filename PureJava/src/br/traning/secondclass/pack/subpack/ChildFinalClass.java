package br.traning.secondclass.pack.subpack;

import java.util.stream.Stream;

import br.traning.secondclass.pack.AbstractExampleClass;
import br.traning.secondclass.pack.AnotherExampleInterface;
import br.traning.secondclass.pack.ExampleInterface;

public final class ChildFinalClass extends AbstractExampleClass implements ExampleInterface, AnotherExampleInterface {

	@Override
	public void exampleMethod() {
		System.out.println("Me chamou???");
	}

	@Override
	public void anotherExampleMethod() {
		System.out.println("Eu sou o outro metodo!");
	}

	@Override
	public void uniqueMethod() {
		System.out.println("Eu sou unico, voce sabia??");
	}

	@Override
	public int somar(Integer... values) {
		return Stream
				.<Integer>of(values)
				.reduce((x, y) -> x + y)
				.get();
	}

	@Override
	int subtrair(Integer... values) {
		return Stream
				.<Integer>of(values)
				.reduce((x, y) -> x - y)
				.get();
	}

	@Override
	protected void imprimir(Integer... values) {
		Stream
		.<Integer>of(values)
		.forEach(System.out::println);
	}

}
