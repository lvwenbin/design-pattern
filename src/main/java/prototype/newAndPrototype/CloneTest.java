package prototype.newAndPrototype;

public class CloneTest {
	 public static void main(String[] args) throws CloneNotSupportedException {
	        long t1=System.currentTimeMillis();
	        for(int i=0;i<10000000;i++){
	            Test1 s1= new Test1("test");
	        }
	        long t2=System.currentTimeMillis();
	        Test1 s1=new Test1("test");
	        for(int j=0;j<10000000;j++){
	            
	            Test1 s2=s1.clone();
	        }
	        long t3=System.currentTimeMillis();
	        
	        System.out.println(t2-t1);
	        System.out.println(t3-t2);
	    }
}
