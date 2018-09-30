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
		this.saldo = 0;
		dataAbertura = getDateTime();
	}
	
	// Métodos
	
	public void saca(double valorDeSaque) {
		saldo -= valorDeSaque;
	}
	
	public void deposita(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public double calculaRendimento() {
		return saldo * 0.1;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	
	public String getTitular() {
		return titular;
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
}
