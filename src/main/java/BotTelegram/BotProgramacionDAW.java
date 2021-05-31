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
			return "Ánimo!! Cada vez queda menos para acabar el curso";
		
		case ("/cuantoFalta"):
			return cuantoFalta();
		
		case ("/games"):
			return gamesMsg();

		
		case ("/infoCreador"):
			return "Jan F. Vidal" +"\nestudiante de 1º de DAW en el instituto IES El Caminàs. "
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
				+ "\nSi tienes dudas y quieres saber de qué soy capaz, "
				+ "ejecuta el comando /help y tendrás acceso a todas las instrucciones que tengo "
				+ "disponibles!!"
				+ "\n¡¡Casi se me olvida!! Si no ejecutas ningún comando prefijado te devolveré el mensaje"
				+ " que me hayas enviado.";
	}
	
 	public String helpMessage() {



 		
 		return("Hola humano!! Mi nombre es Boty y usando estos comandos puedes ver de lo que soy capaz!!"
 				+ "\n\n /help: muestra la ayuda."
 			//	+ "\n /randomPic: envia una imagen aleatoria de un banco de imágenes."
 				+ "\n /luckyCookie: abre una galleta de la suerte y hace una predicción."
 				+ "\n /randomNum: responde con un número aleatorio del 0 al 100."
 				+ "\n /animos: muestra un mensaje de ánimo para estudiantes en momentos difíciles."
 				+ "\n /cuantoFalta: cuenta los días que faltan para verano."
 				+ "\n /infoCreador: muestra los datos del creador del bot."
 				+ "\n /games: muestra los comandos sobre los juegos disponibles."
 				+ "\n\nEn caso de que no envíes ningún comando te devolveré tu propio mensaje repetido."
 				
 				);
 		
 	}
 	
 	public String gamesMsg() {

 		
 		return("Estos son los juegos a los que puedes jugar conmigo:"
 				+ "\n\n /flipCoin: simula el juego de cara o cruz."
 				+ "\n /retos: juego de retos."
 				+ "\n /adivina: juego de adivinanzas."
 				+ "\n\nEn caso de que no envíes ningún comando te devolveré tu propio mensaje repetido."
 				
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
 				"No hay mal que por bien no venga", "No te va a tocar la lotería, por lo menos tendrás salud",
 				"Los segundos serán los primeros", "Un buen bocata de lomo, bacon y queso no te vendría mal",
 				"El gimnasio no te sienta bien, mejor tómate una cerveza", "Están volando hostias y estás en el aeropuerto, corre.",
 				"Tercio y tapa", "No hay mal que por bien no venga", "Cómprate un billete de avión y no vuelvas",
 				"Pídete otra, esto va para largo", "Si estás leyendo esto es porque sabes leer", "Nunca digas nunca",
 				"Si quieres, puedes. Otra cerveza, por favor", "Lánzate, también le gustas", "Si os gustáis, liaros",
 				"Necesitas un cambio de aires", "No hagas una ingeniería, mejor apúntate a un gym", "No te muevas, te va a atropellar un camión",
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
 
        return "Faltan " + dias +" días para verano."; 
		
 	}
	
	
	public String retos() {
 		
 		String[] retos = {
 				"Aguanta la respiración 30 segundos.", "No puedes hablar en 5 minutos", "Haz la gallina cada vez que hable alguien",
 				"Haz el pino durante 10 segundos sin pared", "Mantén los ojos abiertos durante 30 segundos", "Chúpate un codo",
 				"Envía un mensaje preocupante a un amigo", "Imita con gestos tu película favorita", "Imita a uno de los jugadores",
 				"Gira sobre ti mismo 10 veces y ponte a la pata coja", "Ponte los pies por detrás de la cabeza", "Al suelo y 15 flexiones",
 				"Llama al timbre de tus vecinos y pídeles algo para cocinar", "Tienes 5 minutos para vestirte como uno de tus compañeros", 
 				"Finge haber suspendido uno de los exámenes finales y llama a un familiar" };
 				
 		String reto=null;
 		
 		for (int i=0; i<=retos.length-1; i++) {
 			
 			int random = (int) (Math.random()*((retos.length-1)-0)+0);
 			
 			reto = retos[random];
 			
 		}
 		
 		return reto;
 	}
	
	
	public String adivina() {
 		
 		String[] adivinanzas = {
 				"¿De qué color es el caballo blanco de Santiago?", "Finalizan por el principio y comienzan por el final, en todos los años de una vida desde siempre las podrás encontrar ¿Qué son? ",
 				"En la temporada de brillante sol, maduro la fruta con lluvia y calor.", "Soy un mes de vacaciones con nombre de emperador. A veces refresco el rostro otras doy mucho calor.",
 				"Agua pasa por mi casa, cate de mi corazón.", "Cuanto más me lavo, mas sucia estoy.",
 				"En alto vive, en alto mora, en alto teje, la tejedora.", "Tiene dientes y no come, tiene cabeza y no es hombre.", "Quién bebe agua por los pies?",
 				"Ave me llaman a veces y es llana mi condición.", "Soy blanco como la nieve y dulce como la miel; yo alegro los pasteles y la leche con café.", "Qué animal tiene silla y no se puede sentar?",
 				"La A, anda. La B, besa. La C, reza. ¿Qué fruta es?", "Dentro de una vaina voy y ni espada ni sable soy.", "Tengo duro cascarón, pulpa blanca y líquido dulce en mi interior."};
 				
 		String adiv=null;
 		
 		for (int i=0; i<=adivinanzas.length-1; i++) {
 			
 			int random = (int) (Math.random()*((adivinanzas.length-1)-0)+0);
 			
 			adiv = adivinanzas[random];
 			
 		}
 		
 		return adiv;
 	}
	
 	
	
	
	
	public void onUpdateReceived(final Update update) {
		// Esta función se invocará cuando nuestro bot reciba un mensaje
 
		// Se obtiene el mensaje escrito por el usuario
		final String messageTextReceived = update.getMessage().getText();
 
		// Se obtiene el id de chat del usuario
		final long chatId = update.getMessage().getChatId();
 
		// Se crea un objeto mensaje
		SendMessage message = new SendMessage().setChatId(chatId).setText(setResponse(messageTextReceived));
		
		try {
			// Se envía el mensaje
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
		// Se devuelve el token que nos generó el BotFather de nuestro bot
		return "*******************************************";
	}
}
