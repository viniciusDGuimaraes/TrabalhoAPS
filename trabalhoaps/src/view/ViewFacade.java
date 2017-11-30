package view;


public class ViewFacade {
	//Facade - Questão 2
	public static void invoke(String command){
		System.out.println("Chama o invoker");
		Invoker.invoke(command);		
	}
}
