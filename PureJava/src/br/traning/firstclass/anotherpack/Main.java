/*
 * package palavra reservada que define em qual diretorio encontrasse este arquivo de codigo fonte
 */
package br.traning.firstclass.anotherpack;

/*
 * class palavra reservada que define uma Classe em Java
 * Classes sao abstracoes de um Objeto fisico, uma ideia ou necessidade dentro de um escopo
 * Classes dentro de um arquivo de codigo fonte podem apenas
 * utilizar os modificadores de acesso publico e default
 */
public class Main {
	
	/*
	 * public static void main(String[] args) {...} e o metodo inicial onde comeca a execucao do codigo Java
	 * Qualquer alteracao em sua declaracao o torna um metodo normal.
	 * Ex. public void main(String[] args) {...} sem a palavra static o torna um metodo normal
	 */
	/*
	 * void palavra reservada utilizada para representar que um metodo nao tem retorno de valor
	 */
	public static void main(String[] args) {

		/* um valor indicando verdadeiro ou falso */
		boolean bool = false || true;
		/* um caracter unicode (16-bit unsigned) */
		char chr = 'a';
		/* um inteiro de 8 bits (signed) */
		byte bt = 0;
		/* um inteiro de 32 bits (signed) */
		short shrt = 0;
		/* um inteiro de 32 bits (signed) */
		int i = 0;
		/* um inteiro de 64 bits (signed) */
		long lng = 0;
		/* um número de ponto flutuante de 32 bits (signed) */
		float ft = 0.0f;
		/* um número de ponto flutuante de 64 bits (signed) */
		double db = 0.0;
		/* String em Java nao e um tipo primito! E um Objeto, porem e o unico que pode ser inicializado sem a palavra reservada new */
		String str = "Ola Mundo";
		
		/* 
		 * new palavra reservada que inicializa uma instancia de um Objeto e chama seu construtor
		 * No caso de arrays, inicializa o ponteiro de memoria do array com o tamanho determinado
		 */
		char[] chrs = new char[0];
		
		char[] helloWorld = new char[]{'O', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o'};
		
		String helloWorldStr = new String(helloWorld);
		
		System.out.println(helloWorldStr);

	}

}

/* 
 * Segunda Classe no mesmo arquivo de codigo fonte, podem esta nao e uma classe interna de outra
 * e deve seguir as regras de modificadores de acesso public ou default
 */
class AnotherClass {
	
	public String helloWorld() {
		/* return palavra reservada que finaliza a execucao de um metodo e retorna o valor para que chamado o metodo */
		return "Ola mundo!";
	}
	
	/*
	 * Metodo sobrecarregado.
	 * Um metodo e sobrecarregado quando utilizamos a mesma declaracao e mudamos os parametros de entrada do metodo.
	 */
	public String helloWorld(String world) {
		/* return palavra reservada que finaliza a execucao de um metodo e retorna o valor para que chamado o metodo */
		return "Ola mundo " + world + "!";
	}
	
}

class AnotherClassOverride extends AnotherClass {
	
	/*
	 * Metodo sobreescrito
	 * Um metodo e sobreescrito quando numa classe filha declaramos o mesmo metodo a fim de mudar seu comportamento interno
	 */
	@Override
	public String helloWorld() {
		/* return palavra reservada que finaliza a execucao de um metodo e retorna o valor para que chamado o metodo */
		return "Eu fui sobreescrito! hehe";
	}
	
}