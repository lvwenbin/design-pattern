package bridge;

public abstract class Bridge {
private Sourceable sourceable;


public void method()
{
	this.sourceable.method();
	}
public Sourceable getSourceable() {
	return sourceable;
}

public void setSourceable(Sourceable sourceable) {
	this.sourceable = sourceable;
}
}
