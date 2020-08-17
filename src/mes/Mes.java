package mes;

/**
 * Classe que representa um mes do ano.
 */
public class Mes {
	private int numero;
	
	/**
	 * Cria um mes passado o numero do mes.
	 * @param numero numero do mes
	 */
	public Mes(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Cria um mes passado o nome do mes.
	 * @param nome nome do mes
	 */
	public Mes(String nome) {
		
		if (nome.equals("janeiro")){
			this.numero = 1;
			
		} else if (nome.equals("fevereiro")) {
			this.numero = 2;
			
		} else if (nome.equals("mar�o")) {
			this.numero = 3;
			
		} else if (nome.equals("abril")) {
			this.numero = 4;
			
		} else if (nome.equals("maio")) {
			this.numero = 5;
			
		} else if (nome.equals("junho")) {
			this.numero = 6;
			
		} else if (nome.equals("julho")) {
			this.numero = 7;
			
		} else if (nome.equals("agosto")) {
			this.numero = 8;
			
		} else if (nome.equals("setembro")){
			this.numero = 9;
			
		} else if (nome.equals("outubro")) {
			this.numero = 10;
			
		} else if (nome.equals("novembro")) {
			this.numero = 11;
			
		} else if (nome.equals("dezembro")) {
			this.numero = 12;
			
	 	} else {
	 		System.out.println("N�mero inv�lido");
	 		this.numero = -1;
	 	}
	}
	
	
	/**
	 * Retorna o numero do mes.
	 * @return numero do mes
	 */
	public int getNumero() {	
		return this.numero;
	}
	
	
	/**
	 * Altera o numero do mes.
	 * @param numero novo numero do mes
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	/**
	 * Retorna o nome do mes. O nome segue o padrao brasileiro com
	 * os nomes com todas as letras em caixa baixa
	 * @return nome do mes
	 */
	public String getNome() {
		String nome = null;
		
		switch (numero){ 
			
			case 1:
				nome = "janeiro";
				break;
			case 2:
				nome = "fevereiro";
				break;
			case 3:
				nome = "mar�o";
				break;
			case 4:
				nome = "abril";
				break;
			case 5:
				nome = "maio";
				break;
			case 6:
				nome = "junho";
				break;
			case 7:
				nome = "julho";
				break;
			case 8:
				nome = "agosto";
				break;
			case 9:
				nome = "setembro";
				break;
			case 10:
				nome = "outubro";
				break;
			case 11:
				nome = "novembro";
				break;
			case 12:
				nome = "dezembro";
				break;
			 default:
				 nome = "m�s inv�lido"; 
				 break;
		} 
		return nome;
	}

	
	
}
