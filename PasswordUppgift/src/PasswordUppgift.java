import java.util.Scanner;

public class PasswordUppgift {
	public static void main(String[] args) {
		System.out.println("Skriv in ditt lösenord.");
		Scanner passWordLine = new Scanner(System.in); // läser av vad som skrivs i console
		String lösenordFörsök = passWordLine.nextLine(); // ger möjlighet att skriva i console
		String passWord = "jocke123"; // lösenordet
		if (passWord.equals(lösenordFörsök) == false) { // .equals()==false används för att kolla om det som skrivs in
														// är rätt lösenord, går annars in i if-sats
			System.out.println("Fel lösenord. Vänligen skriv in ditt lösenord igen ");
			lösenordFörsök = passWordLine.nextLine(); // gör så man får skriva lösenord igen

			if (passWord.equals(lösenordFörsök) == false) { // passWord.equals(lösenordFörsök)==false
				System.out.println("Fel lösenord. Vänligen skriv in ditt lösenord igen, sista chansen.");
				lösenordFörsök = passWordLine.nextLine(); // gör så man får skriva lösenord igen
			}
			if (passWord.equals(lösenordFörsök) == false) { // har försökt andra sätt men får det ej att fungera så equal.()==false fick duga.
				System.out.println("För många misslyckade försök");
			} else {
				System.out.println("Rätt lösenord, välkommen"); // rätt på andra försöket
			}
		} else {
			System.out.println("Rätt lösenord, välkommen"); // rätt på första försöket
		}
	}
}
