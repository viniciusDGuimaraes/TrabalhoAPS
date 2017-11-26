package view;


public class ViewFacade {
	
	public void invoke(String command){
		Invoker.invoke(command);
		System.out.println("Chamou o invoker");
	}
}
