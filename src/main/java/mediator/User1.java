package mediator;

public class User1 extends User {  
	  
    public User1(MyMediator mediator){  
        super(mediator);  
    }  
      
    @Override  
    public void work() {  
        System.out.println("user1 exe!");  
    }  
}  