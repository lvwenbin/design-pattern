package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable{
	
	private String string;
	private SerializableObject obj;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getString() {
		return string;
	}


	public void setString(String string) {
		this.string = string;
	}


	public SerializableObject getObj() {
		return obj;
	}


	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/* 浅复制 */  
	public Object clone() throws CloneNotSupportedException
	{Prototype protoType=(Prototype) super.clone();
		return protoType;
		
		
	}
	
	
	public Object deepClone() throws IOException, ClassNotFoundException
	{
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();  
	        ObjectOutputStream oos = new ObjectOutputStream(bos);  
	        
	        
	        oos.writeObject(this);  
	  
	        /* 读出二进制流产生的新对象 */  
	        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
	        
	        ObjectInputStream ois = new ObjectInputStream(bis);  
	        
	        
	        
	        return ois.readObject();
		
		
	}
	
	
	

}
class SerializableObject implements Serializable {  
    private static final long serialVersionUID = 1L;  
}  