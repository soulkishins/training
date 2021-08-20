/*
 * package palavra reservada que define em qual diretorio encontrasse este arquivo de codigo fonte
 */
package br.traning.firstclass.anotherpack;

/*
 * import palavra reservada que define em qual diretorio encontrasse o arquivo de codigo fonte referenciado
 */
import br.traning.firstclass.pack.ExampleClass;

/*
 * class palavra reservada que define uma Classe em Java
 * Classes sao abstracoes de um Objeto fisico, uma ideia ou necessidade dentro de um escopo
 */
/*
 * extends palavra reservada que define que a Class e uma subclasse (classe filha) de outra.
 * Subclasses herdam todos os atributos e metodos publicos e protected da classe pai, se estiver
 * no mesmo pacote, tambem herda os atributos e metodos com modificador de acesso default
 */
/*
 * public palavra reservada que define o modificador de acesso publico.
 * Classe com modificador de acesso publico determina que esta pode ser
 * referenciada em qualquer outro arquivo de codigo fonte
 */
public class ChildExampleClass extends ExampleClass {
	
	/*
	 * private palavra reservada que define o modificador de acesso privado
	 * Atributo com modificador de acesso publico determina que este pode ser
     * referenciada em qualquer outro arquivo de codigo fonte
	 */
	private String privateAttribute;

	/*
	 * protected palavra reservada que define o modificador de acesso protegido
	 */
	protected String protectedAttribute;

	/*
	 * Atributo sem modificador de acesso. Desta forma com modificador de acesso default
	 */
	String deafultAttribute;

	/*
	 * public palavra reservada que define o modificador de acesso publico
	 */
	public String publicAttribute;
	
	

}
