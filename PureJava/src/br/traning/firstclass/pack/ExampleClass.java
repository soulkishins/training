/*
 * package palavra reservada que define em qual diretorio encontrasse este arquivo de codigo fonte
 */
package br.traning.firstclass.pack;

/*
 * class palavra reservada que define uma Classe em Java
 * Classes sao abstracoes de um Objeto fisico, uma ideia ou necessidade dentro de um escopo
 */
public class ExampleClass {

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
	
	public InnerPrivateExampleClass innerPrivateExampleClassInstance;

	/*
	 * Classes internas
	 * Somente classes internas podem ter os modificadores private e protected
	 * As classes dentro de um arquivo de codigo fonte podem apenas
	 * utilizar os modificadores de acesso publico e default
	 */

	private class InnerPrivateExampleClass {

	}

	protected class InnerProtectedExampleClass {

	}

	class InnerDefaultExampleClass {

	}

	public class InnerPublicExampleClass {

	}
	
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
