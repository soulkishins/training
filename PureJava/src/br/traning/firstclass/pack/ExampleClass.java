/*
 * package palavra reservada que define em qual diretorio encontrasse este arquivo de codigo fonte
 */
package br.traning.firstclass.pack;

/*
 * class palavra reservada que define uma Classe em Java
 * Classes sao abstracoes de um Objeto fisico, uma ideia ou necessidade dentro de um escopo
 */
public class ExampleClass {

	private String privateAttribute;

	protected String protectedAttribute;

	String deafultAttribute;

	public String publicAttribute;
	
	public InnerPrivateExampleClass innerPrivateExampleClassInstance;
	
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

	private class InnerPrivateExampleClass {

	}

	protected class InnerProtectedExampleClass {

	}

	class InnerDefaultExampleClass {

	}

	public class InnerPublicExampleClass {

	}

}
