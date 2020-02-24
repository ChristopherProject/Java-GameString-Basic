import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AboutProgram();
		print("\nRegole del gioco\n");
		print("Dire Una Parola in seguito dire un'altra parola che inizi con la lettera finale di essa e cosi via.");
		GameStarted();
	}

	static void print(String m) {
		System.out.println(m);
	}
	static void AboutProgram() {
		System.out.println(" ____            _     _____                                     \r\n"
				+ "|  _ \\          | |   |  __ \\                                    \r\n"
				+ "| |_) | ___  ___| |_  | |__) | __ ___   __ _ _ __ __ _ _ __ ___  \r\n"
				+ "|  _ < / _ \\/ __| __| |  ___/ '__/ _ \\ / _` | '__/ _` | '_ ` _ \\ \r\n"
				+ "| |_) |  __/\\__ \\ |_  | |   | | | (_) | (_| | | | (_| | | | | | |\r\n"
				+ "|____/ \\___||___/\\__| |_|   |_|  \\___/ \\__, |_|  \\__,_|_| |_| |_|\r\n"
				+ "                                        __/ |                   \r\n"
				+ "                                       |___/                    ");
	}
	
	
	static void GameStarted() {
		
		String parola;
		String ultimate;
		String prime;
		char ultima;
		char prima;


		System.out.println("\n\nInserisci una parola: ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {

				parola = scanner.nextLine();

				prima = parola.charAt(0);
				ultima = parola.charAt(parola.length() - 1);

				prime = Character.toString(prima);
				ultimate = Character.toString(ultima);

				if (!prime.equals(ultimate)) {
					System.out.println("Inserisci Una Parola Che Inizia Con " + ultimate);
				} else {
					System.out.println("Hai Perso!");
					System.exit(0);

				}
			}
		}
	}
}
