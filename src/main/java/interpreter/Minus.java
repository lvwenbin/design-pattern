package interpreter;

public class Minus implements Expression{

	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1()-context.getNum2();
	}

}
