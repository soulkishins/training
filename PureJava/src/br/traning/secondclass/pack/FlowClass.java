package br.traning.secondclass.pack;

public class FlowClass {
	
	public static void main(String[] args) {
		
		var i = 10;
		var str = "Ola mundo!";
		
		if (str instanceof String) {
			str = str + " Voce e nota " + i + "!";
		}
		
		switch (i) {
		case 10:
			System.out.println(str);
		case 0:
			System.out.println("Ola mundo! Voce e nota 0!");
			break;
		case 1000:
			System.out.println("Ola mundo! Voce e nota 1000!");
			break;
		}
		
		System.out.println("Contagem regressiva");
		for (var y = 10; y > 0; y--) {
			System.out.println(y);
		}
		
		System.out.println("Vamos la pessoal, hora de contar ate 10");
		int contar = 0;
		while (contar++ < 10) {
			System.out.println(contar);
		}
		
		System.out.println("Vamos la pessoal, agora contar ate 10 a 0");
		do {
			System.out.println(contar);
		} while(--contar > 0);
		
		System.out.println("Ops! Algo deu errado.. rs, vamos tentar novamente");
		
		int contagemRegressiva = 10;
		do {
			if (contagemRegressiva % 2 != 0) continue;
			System.out.println(contagemRegressiva);
		} while(--contagemRegressiva > 0);
		
		switch ("Contei errado? oxi...") {
		case "Sim":
			System.out.println("Sera que nao sei contar???");
			break;
		case "Nao":
			System.out.println("Claro que eu sei contar xD!");
			break;
		default:
			System.out.println("Obvio que nao sei contar, o fluxo esta errado baby!");
		}

	}

}
