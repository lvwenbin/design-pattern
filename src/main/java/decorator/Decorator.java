package decorator;

public class Decorator implements Sourceable{
	private Source source;
	public Decorator( Source source){
		this.source=source;
	}
	public void method1() {
		System.out.println("before decorator");
		source.method1();
		System.out.println("after decorator");
	}

	
}
