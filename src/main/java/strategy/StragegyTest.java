package strategy;

public class StragegyTest {

	public static void main(String[] args) {
	String exp="2+8";
	 ICalculator cal = new Plus();  
     int result = cal.calculate(exp);  
     System.out.println(result);  
	}

}