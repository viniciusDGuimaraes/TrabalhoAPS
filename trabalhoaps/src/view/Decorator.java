package view;

public class Decorator implements Command{
	//Decorator - Questão 4
	private Command component;
	
	public Decorator(Command decorates){
		this.component = decorates;
	}

	@Override
	public void execute() {
		component.execute();
	}
}
