package view;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	private static Map<String, Class> comandos = new HashMap<String, Class>();
	
	static{
		comandos.put("FazerReserva", FazerReservaCommand.class);
	}
	
	public static void invoke(String command){
		try {
			Command c = (Command)comandos.get(command).newInstance();
			AutenticaDecorator ad = new AutenticaDecorator(c);
			ad.execute();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
