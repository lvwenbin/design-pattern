package state;

public class Test {

	public static void main(String[] args) {
		State state=new State();
    Context c=new Context(state);
    state.setValue("state1");
    c.method();
    state.setValue("state2");
    c.method();
	}

}
