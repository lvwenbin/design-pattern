package memento;

public class Test {

	public static void main(String[] args) {
		Original og=new Original("eggs");
		
		Storage sr=new Storage(og.createMemento());
		
	System.out.println(og.getValue());
	og.setValue("apples");
	System.out.println(og.getValue());
	og.restoreMemento(sr.getMemento());
	System.out.println(og.getValue());
	}

}
