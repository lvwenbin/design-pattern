package mediator;

public abstract class User {
	private MyMediator mediator;  
    
    public MyMediator getMediator(){  
        return mediator;  
    }  
      
    public User(MyMediator mediator) {  
        this.mediator = mediator;  
    }  
  
    public abstract void work();  
}  

