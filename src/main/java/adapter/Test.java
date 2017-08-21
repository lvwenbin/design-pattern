package adapter;

public class Test {

	public static void main(String[] args) {
		//Targetable adapter=new Adapter();//class adapter
		Targetable objectAdapter=new Wrapper(new Source());
//		adapter.method1();
//		adapter.method2();
		objectAdapter.method1();
		objectAdapter.method2();
	}

}
