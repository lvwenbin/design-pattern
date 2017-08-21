package observer;

import java.util.Enumeration;
import java.util.Vector;

public class AbstractSubject implements Subject{
   Vector<Observer> vector=new Vector<Observer>();
	public void add(Observer observer) {
		vector.add(observer);
		
	}

	public void remove(Observer observer) {
		vector.remove(observer);
	}

	public void notifyObserver() {
		Enumeration<Observer> em=vector.elements();
		while(em.hasMoreElements()){
			em.nextElement().update();
		}
	}

	public void operation() {
		System.out.println("self update");
		this.notifyObserver();
		
	}

	

}
