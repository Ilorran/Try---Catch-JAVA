import java.util.Scanner;
public class Conta {
	
	private int conta;
	private double saldo;
	private String nome;
	private int limiteDeSaque;
	
	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
		System.out.println("Conta: " + conta);
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//métodos
	public boolean valorINI() throws LimitException {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Depósito inicial? (S/N): ");
		char deci = teclado.next().toUpperCase().charAt(0);
		if(deci == 'S') {
			System.out.print("Digite o valor: ");
			saldo = teclado.nextDouble();
		}
		else {
			System.out.print("Ok");
		}
		return true;
	}
	
	public void imprimeValor() throws LimitException {
		System.out.println("Conta: " + conta);
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);	
	}
	
	public void deposita(double valordeDeposito) throws LimitException {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Valor de depósito: ");
		valordeDeposito = teclado.nextDouble();
		saldo = saldo + valordeDeposito;
	}
	
	public String saca(double valordeSaque, int limiteDeSaque) throws LimitException {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Valor de saque: \n");
		valordeSaque = teclado.nextDouble();
		if(valordeSaque > 0 && valordeSaque <= limiteDeSaque){
			saldo = saldo - valordeSaque;
		}
		else if (valordeSaque <= 0){
			throw new LimitException("Saque deve ser superior a 0.");
		}
		else if(valordeSaque > limiteDeSaque){
			throw new LimitException("Limite de saque foi atingido e ou valor de saque maior do que saldo atual.");
		}
		else if(valordeSaque > saldo){
			throw new LimitException("Valor de saque maior do que saldo atual.");
		}
		return null;
	}
	
	

}
