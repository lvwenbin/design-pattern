package createType.builder;

public class ComputerCustomer {

	public static void main(String[] args) {
		Director director=new Director();
		director.setComputerBuilder(new HPComputerBuilder());
		director.constructComputer();
		Computer pc=director.getComputer();
		System.out.println(pc);

	}

}
