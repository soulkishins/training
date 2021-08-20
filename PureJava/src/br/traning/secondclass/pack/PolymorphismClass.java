package br.traning.secondclass.pack;

import br.traning.secondclass.pack.subpack.ChildFinalClass;

public class PolymorphismClass {
	
	public static void main(String[] args) {
		
		ChildFinalClass childFinalClass = new ChildFinalClass();
		AbstractExampleClass abstractExampleClass = childFinalClass;
		ExampleInterface exampleInterface = childFinalClass;
		AnotherExampleInterface anotherExampleInterface = childFinalClass;
		
		exampleInterface.exampleMethod();
		exampleInterface.anotherExampleMethod();
		exampleInterface.defaultMethod();

		anotherExampleInterface.exampleMethod();
		anotherExampleInterface.anotherExampleMethod();
		anotherExampleInterface.uniqueMethod();
		
		Integer[] values = new Integer[] {20, 10, 5};
		System.out.println("Soma e: " + abstractExampleClass.somar(values[0], values[1]));
		System.out.println("Soma e: " + abstractExampleClass.somar(values));
		System.out.println("Subtracao e: " + abstractExampleClass.subtrair(values));
		abstractExampleClass.imprimir(values);

	}

}
