package createType.builder;

public class Director {

	
	private ComputerBuilder computerBuilder;

	public ComputerBuilder getComputerBuilder() {
		return computerBuilder;
	}

	public void setComputerBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	public Computer getComputer() {
        return computerBuilder.getComputer();
    }
    
    public void constructComputer() {
        computerBuilder.buildComputer();
        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
        computerBuilder.buildAudio();
    }


	
}
