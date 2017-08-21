package bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Bridge bridge = new Mybridge();  
        
        /*调用第一个对象*/  
        Sourceable source1 = new Sourcesub1();
        bridge.setSourceable(source1);  
        bridge.method();  
          
        /*调用第二个对象*/  
        Sourceable source2 = new Sourcesub2();  
        bridge.setSourceable(source2);  
        bridge.method();  

	}

}
