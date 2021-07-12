
public class testaClasseConta {

	public static void main(String[] args) throws LimitException {
		
		Conta conta = new Conta(3253, "Iorran Gabrieli");
		try {
			conta.valorINI();
			conta.deposita(0);
			conta.imprimeValor();
			conta.saca(0, 200);
			conta.imprimeValor();
		}
		catch(LimitException e){
			System.out.println("Error: " + e.getMessage());
		}
	}

}
