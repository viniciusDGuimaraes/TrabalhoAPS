package view;


public class ViewFacade {
	
	public static void invoke(String command){
		System.out.println("Chama o invoker");
		Invoker.invoke(command);		
	}
}
