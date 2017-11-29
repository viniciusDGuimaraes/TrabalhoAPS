package view;

public class AutenticaDecorator extends Decorator{

	public AutenticaDecorator(Command decorates) {
		super(decorates);
	}
	
	public void autentica(){
		System.out.println("Autentica o command");
	}
	
	@Override
	public void execute(){
		autentica();
		super.execute();
	}
}
