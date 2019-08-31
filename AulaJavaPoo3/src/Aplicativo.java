
public class Aplicativo {

	public static void main(String[] args) {

		//Entrada de dados
		
		Conta c1, c2; //Objeto (referência) = NULL
		
		c1 = new Conta(123456, 23000, true);
		
		c1.sacar(2500);
		
		c2 = new Conta(123453, 50000);
		c2.sacar(3000);
		
		if(c2.isAtiva()) {
			//saida
			System.out.println("Numero: " + c2.getNumero());
			System.out.println("Saldo: " + c2.getSaldo());
		}
		if(c1.isAtiva()) {
			
			System.out.println("Numero: " + c1.getNumero());
			System.out.println("Saldo: " + c1.getSaldo());
		}
	}

}
