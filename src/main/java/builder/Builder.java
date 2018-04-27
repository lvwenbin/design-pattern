package builder;

import java.util.ArrayList;
import java.util.List;

import SimpleFactory.MailSender;
import SimpleFactory.Sender;
import SimpleFactory.SmsSender;

/**
 * @author Administrator
 * 使用生成器模式封装一个产品的构造过程, 并允许按步骤构造. 将一个复杂对象的构建与它的表示分离, 使得同样的构建过程可以创建不同的表示
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}  

