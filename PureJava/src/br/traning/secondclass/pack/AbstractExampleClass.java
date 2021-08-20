package br.traning.secondclass.pack;

public abstract class AbstractExampleClass {
	
	public int somar(int x, int y) {
		return x + y;
	}
	
	public abstract int somar(Integer... values);
	
	abstract int subtrair(Integer... values);
	
	protected abstract void imprimir(Integer... values);

}
