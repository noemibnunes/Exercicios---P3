package ano;

public class DiasDoMesApp {
	public static void main(String[] args){
		
		Ano ano = new Ano();
		
		int numero = 0;
	
		numero = 2012;
		ano.setNumero(numero);

		if(ano.isBissexto()) {
			System.out.println("O ano informado � bissexto");
			for (int mes = 1 ; mes <= 12; mes++){
				System.out.println("M�s " + mes + " de " + numero + " tem " + ano.getQtdDias(mes) + " dias");	
			} 
		
		} else {
				System.out.println("O ano informado n�o � bissexto");
				for (int mes = 1; mes <= 12; mes++){
				System.out.println("M�s " + mes + " de " + numero + " tem " + ano.getQtdDias(mes) + " dias");	

			}
		}
		System.out.println();
		
		numero = 2015;
		ano.setNumero(numero);
		
		
		if(ano.isBissexto()) {
			System.out.println("O ano informado � bissexto");
			for (int mes = 1; mes <= 12; mes++){
				System.out.println("M�s " + mes + " de " + numero + " tem " + ano.getQtdDias(mes) + " dias");	
			} 
		
		} else {
				System.out.println("O ano informado n�o � bissexto");
				for (int mes = 1; mes <= 12; mes++){
				System.out.println("M�s " + mes + " de " + numero + " tem " + ano.getQtdDias(mes) + " dias");	

			}
		}
		System.out.println();
		
	}
}
