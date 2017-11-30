package view;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	//Classe que invoca os commands - Questão 3
	private static Map<String, Class> comandos = new HashMap<String, Class>();
	
	static{
		comandos.put("FazerReserva", FazerReservaCommand.class);
	}
	
	public static void invoke(String command){
		try {
			Command c = (Command)comandos.get(command).newInstance();
			//Decorator de autenticação - Questão 4
			Decorator ad = new AutenticaDecorator(c);
			ad.execute();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
