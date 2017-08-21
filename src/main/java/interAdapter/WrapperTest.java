package interAdapter;


public class WrapperTest {
	
      
    public static void main(String args[])
    {
    	Sourceable source1 = new Sourcesub1();  
        Sourceable source2 = new Sourcesub2();  
        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
