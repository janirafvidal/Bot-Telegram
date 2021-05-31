package BotTelegram;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.*;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
 
public class BotProgramacionDAW extends TelegramLongPollingBot {
	

	private String setResponse(String originalMessage) {
		
		switch (originalMessage) {
		
		case ("/start"):
			return welcomeMsg();
		
		
		case ("/help"):
			return helpMessage();
		
//		case ("/randomPic"):
//			return sendRandomPic();
		
		case ("/luckyCookie"):
			return luckyCookie();
		
		case ("/randomNum"):
			return sendRandomNum();
		
		case ("/flipCoin"):
			return caraCruz();
		
		case ("/animos"):
			return "�nimo!! Cada vez queda menos para acabar el curso";
		
		case ("/cuantoFalta"):
			return cuantoFalta();
		
		case ("/games"):
			return gamesMsg();

		
		case ("/infoCreador"):
			return "Jan F. Vidal" +"\nestudiante de 1� de DAW en el instituto IES El Camin�s. "
					+"Curso 20/21";
		
		case ("/retos"):
			return retos();
		
		case ("/adivina"):
			return adivina();
		
		default:
			return originalMessage;
		}
		
	}
	
	public String welcomeMsg() {

		return "Hola! Mi nombre es Boty y soy un bot creado por una estudiante de "
				+ "Desarrollo de Aplicaciones Web."
				+ "\nSi tienes dudas y quieres saber de qu� soy capaz, "
				+ "ejecuta el comando /help y tendr�s acceso a todas las instrucciones que tengo "
				+ "disponibles!!"
				+ "\n��Casi se me olvida!! Si no ejecutas ning�n comando prefijado te devolver� el mensaje"
				+ " que me hayas enviado.";
	}
	
 	public String helpMessage() {



 		
 		return("Hola humano!! Mi nombre es Boty y usando estos comandos puedes ver de lo que soy capaz!!"
 				+ "\n\n /help: muestra la ayuda."
 			//	+ "\n /randomPic: envia una imagen aleatoria de un banco de im�genes."
 				+ "\n /luckyCookie: abre una galleta de la suerte y hace una predicci�n."
 				+ "\n /randomNum: responde con un n�mero aleatorio del 0 al 100."
 				+ "\n /animos: muestra un mensaje de �nimo para estudiantes en momentos dif�ciles."
 				+ "\n /cuantoFalta: cuenta los d�as que faltan para verano."
 				+ "\n /infoCreador: muestra los datos del creador del bot."
 				+ "\n /games: muestra los comandos sobre los juegos disponibles."
 				+ "\n\nEn caso de que no env�es ning�n comando te devolver� tu propio mensaje repetido."
 				
 				);
 		
 	}
 	
 	public String gamesMsg() {

 		
 		return("Estos son los juegos a los que puedes jugar conmigo:"
 				+ "\n\n /flipCoin: simula el juego de cara o cruz."
 				+ "\n /retos: juego de retos."
 				+ "\n /adivina: juego de adivinanzas."
 				+ "\n\nEn caso de que no env�es ning�n comando te devolver� tu propio mensaje repetido."
 				
 				);
 		
 	}
 	
 	
// 	public String sendRandomPic() {
// 		
// 		
//		SendMessage message = new 
// 		SendMessage().setParseMode("https://drive.google.com/drive/u/2/folders/1KCEhjmWaXfskuAhlwY0T6Nq9OsqIE76B");
//		return message;
// 		
// 	}
 	
 	public String luckyCookie() {
 		
 		String[] mensajes = {
 				"No hay mal que por bien no venga", "No te va a tocar la loter�a, por lo menos tendr�s salud",
 				"Los segundos ser�n los primeros", "Un buen bocata de lomo, bacon y queso no te vendr�a mal",
 				"El gimnasio no te sienta bien, mejor t�mate una cerveza", "Est�n volando hostias y est�s en el aeropuerto, corre.",
 				"Tercio y tapa", "No hay mal que por bien no venga", "C�mprate un billete de avi�n y no vuelvas",
 				"P�dete otra, esto va para largo", "Si est�s leyendo esto es porque sabes leer", "Nunca digas nunca",
 				"Si quieres, puedes. Otra cerveza, por favor", "L�nzate, tambi�n le gustas", "Si os gust�is, liaros",
 				"Necesitas un cambio de aires", "No hagas una ingenier�a, mejor ap�ntate a un gym", "No te muevas, te va a atropellar un cami�n",
 				"Eres peor que poner los ; en Java", "Majo pero no me liaba", "NO PUC MES"};
 		
 		String msj=null;
 		
 		for (int i=0; i<=mensajes.length-1; i++) {
 			
 			int random = (int) (Math.random()*((mensajes.length-1)-0)+0);
 			
 			msj = mensajes[random];
 			
 		}
 		
 		return msj;
 	}
 	
 	
	public String sendRandomNum() {
 		
 		int random = (int) (Math.random()*(100-0)+0);
 		return ("Numero aleatorio: " +random);
 		
 	}
	
	
	public String caraCruz() {
		
		String[] opciones = {"Cara", "Cruz"};
 		String opt=null;
 		
 		for (int i=0; i<=opciones.length; i++) {
 			
 			int random = (int) (Math.random()*(opciones.length-0)+0);
 			
 			opt = opciones[random];
 			
 		}
 		
 		return opt;
 		
 	}
	
	
	public String cuantoFalta() {

 		
		LocalDate inicio = LocalDate.now(); // hoy
        LocalDate fin = LocalDate.of(2021, 6, 21);// inicio de verano de 2021

        long dias = DAYS.between(inicio, fin);
        
        //String faltanX=;
 
        return "Faltan " + dias +" d�as para verano."; 
		
 	}
	
	
	public String retos() {
 		
 		String[] retos = {
 				"Aguanta la respiraci�n 30 segundos.", "No puedes hablar en 5 minutos", "Haz la gallina cada vez que hable alguien",
 				"Haz el pino durante 10 segundos sin pared", "Mant�n los ojos abiertos durante 30 segundos", "Ch�pate un codo",
 				"Env�a un mensaje preocupante a un amigo", "Imita con gestos tu pel�cula favorita", "Imita a uno de los jugadores",
 				"Gira sobre ti mismo 10 veces y ponte a la pata coja", "Ponte los pies por detr�s de la cabeza", "Al suelo y 15 flexiones",
 				"Llama al timbre de tus vecinos y p�deles algo para cocinar", "Tienes 5 minutos para vestirte como uno de tus compa�eros", 
 				"Finge haber suspendido uno de los ex�menes finales y llama a un familiar" };
 				
 		String reto=null;
 		
 		for (int i=0; i<=retos.length-1; i++) {
 			
 			int random = (int) (Math.random()*((retos.length-1)-0)+0);
 			
 			reto = retos[random];
 			
 		}
 		
 		return reto;
 	}
	
	
	public String adivina() {
 		
 		String[] adivinanzas = {
 				"�De qu� color es el caballo blanco de Santiago?", "Finalizan por el principio y comienzan por el final, en todos los a�os de una vida desde siempre las podr�s encontrar �Qu� son? ",
 				"En la temporada de brillante sol, maduro la fruta con lluvia y calor.", "Soy un mes de vacaciones con nombre de emperador. A veces refresco el rostro otras doy mucho calor.",
 				"Agua pasa por mi casa, cate de mi coraz�n.", "Cuanto m�s me lavo, mas sucia estoy.",
 				"En alto vive, en alto mora, en alto teje, la tejedora.", "Tiene dientes y no come, tiene cabeza y no es hombre.", "Qui�n bebe agua por los pies?",
 				"Ave me llaman a veces y es llana mi condici�n.", "Soy blanco como la nieve y dulce como la miel; yo alegro los pasteles y la leche con caf�.", "Qu� animal tiene silla y no se puede sentar?",
 				"La A, anda. La B, besa. La C, reza. �Qu� fruta es?", "Dentro de una vaina voy y ni espada ni sable soy.", "Tengo duro cascar�n, pulpa blanca y l�quido dulce en mi interior."};
 				
 		String adiv=null;
 		
 		for (int i=0; i<=adivinanzas.length-1; i++) {
 			
 			int random = (int) (Math.random()*((adivinanzas.length-1)-0)+0);
 			
 			adiv = adivinanzas[random];
 			
 		}
 		
 		return adiv;
 	}
	
 	
	
	
	
	public void onUpdateReceived(final Update update) {
		// Esta funci�n se invocar� cuando nuestro bot reciba un mensaje
 
		// Se obtiene el mensaje escrito por el usuario
		final String messageTextReceived = update.getMessage().getText();
 
		// Se obtiene el id de chat del usuario
		final long chatId = update.getMessage().getChatId();
 
		// Se crea un objeto mensaje
		SendMessage message = new SendMessage().setChatId(chatId).setText(setResponse(messageTextReceived));
		
		try {
			// Se env�a el mensaje
			execute(message);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
 
	@Override
	public String getBotUsername() {
		// Se devuelve el nombre que dimos al bot al crearlo con el BotFather
		return "BotyJanDaw";
	}
 
	@Override
	public String getBotToken() {
		// Se devuelve el token que nos gener� el BotFather de nuestro bot
		return "1845461233:AAGCIdxkTZbZX8LXTFUbUu3IY8WwfDPZjNo";
	}
}