package adapter;

public class Adapter extends Source implements Targetable{
 public Adapter()
 {super(1);
	System.out.println("this is adapter"); 
 }
	public void method2() {
	System.out.println("this is targetable method");
		
	}

}
