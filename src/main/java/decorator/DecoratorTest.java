package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
	Sourceable sad=new Decorator(new Source());
	sad.method1();
	}

}
