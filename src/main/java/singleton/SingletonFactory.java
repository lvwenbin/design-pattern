package singleton;

public class SingletonFactory {
private SingletonFactory(){
	
}

private static SingletonFactory instance=new SingletonFactory();

public static SingletonFactory getInstance(){
	return SingletonFactory.instance;
	
}
}
