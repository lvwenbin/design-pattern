package prototype.newAndPrototype;

public class Test1  implements Cloneable{
	String str;
    public Test1(String str){
//    	 if(str.startsWith("r")){加上这段new会耗费很长的时间
//             str="aaaaaaa";
//         }
//         str.replaceAll("es", "aa");
         this.str=str; 
        
    }
    public Test1 clone() throws CloneNotSupportedException{
        return (Test1)super.clone();
    }
}
