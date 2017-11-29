package view;

public class Decorator implements Command{
	private Command component;
	
	public Decorator(Command decorates){
		this.component = decorates;
	}

	@Override
	public void execute() {
		component.execute();
	}
}
