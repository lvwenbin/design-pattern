package mediator;

public class User2 extends User {  
	  
    public User2(MyMediator mediator){  
        super(mediator);  
    }  
      
    @Override  
    public void work() {  
        System.out.println("user2 exe!");  
    }  
}  