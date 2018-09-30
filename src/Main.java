import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setTitular("Danilo");
		c.deposita(1500);
		//System.out.println(c.calculaRendimento());
		
		Conta c1 = new Conta();
		c1.setTitular("Danilo");
		c1.deposita(1500);
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = new Date(); 
		//System.out.println( dateFormat.format(date));
		
		Fibonacci f = new Fibonacci();
		for (int i = 1; i <= 6; i++) {
			int res = f.calculaFibonacci(i);
			System.out.println(res);
		}
		
	}

}
