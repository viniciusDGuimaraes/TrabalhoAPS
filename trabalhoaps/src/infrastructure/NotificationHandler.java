package infrastructure;

public class NotificationHandler {
	private NotificationHandler handler;
	
	public NotificationHandler(NotificationHandler handler){
		this.handler = handler;
	}

	public void handleNotification(){
		if(this.handler != null){
			System.out.println("repassou a notificação para o proximo usuário");
			this.handler.handleNotification();
		}else{
			System.out.println("Não foi possível tratar o evento de help");
		}
	}
}
