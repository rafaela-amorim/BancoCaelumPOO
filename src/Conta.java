import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {
	
	// Atributos
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	
	// Construtor
	
	public Conta() {
		dataAbertura = getDateTime();
		
		// valores default
		titular = "Cliente";
		numero = 123;
		saldo = 0;
	}
	
	// Métodos

	public void deposita(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public double calculaRendimento() {
		return saldo * 0.1;
	}
	
	public boolean saca(double quantidade) {
		boolean retorno = true;
		
		if (quantidade <= this.saldo) {
			saldo -= quantidade;
		} else {
			retorno = false;
		}
		
		return retorno;
	}
	
	public boolean transferePara(Conta destino, double quantia) {
		boolean retorno = this.saca(quantia);
		
		if (retorno) {
			destino.deposita(quantia);
		}
		
		return retorno;
	}
	
	@Override
	public String toString() {
		return "Titular: " + this.titular + 
			   "\nNúmero: " + this.numero + 
			   "\nAgencia: " + this.agencia + 
			   "\nSaldo: " + this.saldo + 
			   "\nData de Abertura: " + this.dataAbertura;
	}
	
	// Auxiliares
	private String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = new Date(); 
		return dateFormat.format(date); 
	}
	
	// Getters & Setters
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
