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
	 * Atributo com modificador de acesso privado determina que este pode ser
     * acessado pelos metodos interno da classe
	 */
	private String privateAttribute;

	/*
	 * protected palavra reservada que define o modificador de acesso protegido
	 * Atributo com modificador de acesso protegido determina que este pode ser
     * acessado pelos metodos interno da classe, das classes filhas e também de classes no mesmo pacote
	 */
	protected String protectedAttribute;

	/*
	 * Atributo sem modificador de acesso. Desta forma com modificador de acesso default
	 * que permiti o acesso ao atributo dentro da classe e por outros codigo fonte
	 * dentro do mesmo pacote 
	 */
	String deafultAttribute;

	/*
	 * public palavra reservada que define o modificador de acesso publico
	 * Atributo com modificador de acesso public determina que este pode ser
     * acessado dentro e fora da classe, ultrapassando o encapsulamento da O.O
	 */
	public String publicAttribute;
	
	/*
	 * Metodo com prefixo get e set, que na orientacao a objeto (O.O)
	 * representam os metodos para encapsular os atributos privados
	 * e protegidos da classe
	 */

	public String getPrivateAttribute() {
		return privateAttribute;
	}
	
	public void setPrivateAttribute(String privateAttribute) {
		this.privateAttribute = privateAttribute;
	}
	
	public String getProtectedAttribute() {
		return protectedAttribute;
	}
	
	public void setProtectedAttribute(String protectedAttribute) {
		this.protectedAttribute = protectedAttribute;
	}
	
	public String getDeafultAttribute() {
		return deafultAttribute;
	}
	
	public void setDeafultAttribute(String deafultAttribute) {
		this.deafultAttribute = deafultAttribute;
	}
	
	public String getPublicAttribute() {
		return publicAttribute;
	}
	
	public void setPublicAttribute(String publicAttribute) {
		this.publicAttribute = publicAttribute;
	}

}
