package mes;


public class ImprimeMesesApp {
	
	private static final int QTD_MESES = 12;
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= QTD_MESES; i++) {
			Mes mes = new Mes(i);
			System.out.println("Mes " + i + " eh " + mes.getNome());
		}
		
		System.out.println();
		
		String[] nomesMeses = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto", "setembro" , "outubro", "novembro", "dezembro"};
		for (int i = 0; i < nomesMeses.length; i++) {
			Mes mes = new Mes(nomesMeses[i]);
			System.out.println("Mes " + nomesMeses[i] + " eh " + mes.getNumero());
		}
		
	}
}
