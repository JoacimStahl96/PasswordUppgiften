import java.util.Scanner;

public class PasswordUppgift {
	public static void main(String[] args) {
		System.out.println("Skriv in ditt l�senord.");
		Scanner passWordLine = new Scanner(System.in); // l�ser av vad som skrivs i console
		String l�senordF�rs�k = passWordLine.nextLine(); // ger m�jlighet att skriva i console
		String passWord = "jocke123"; // l�senordet
		if (passWord.equals(l�senordF�rs�k) == false) { // .equals()==false anv�nds f�r att kolla om det som skrivs in
														// �r r�tt l�senord, g�r annars in i if-sats
			System.out.println("Fel l�senord. V�nligen skriv in ditt l�senord igen ");
			l�senordF�rs�k = passWordLine.nextLine(); // g�r s� man f�r skriva l�senord igen

			if (passWord.equals(l�senordF�rs�k) == false) { // passWord.equals(l�senordF�rs�k)==false
				System.out.println("Fel l�senord. V�nligen skriv in ditt l�senord igen, sista chansen.");
				l�senordF�rs�k = passWordLine.nextLine(); // g�r s� man f�r skriva l�senord igen
			}
			if (passWord.equals(l�senordF�rs�k) == false) { // har f�rs�kt andra s�tt men f�r det ej att fungera s� equal.()==false fick duga.
				System.out.println("F�r m�nga misslyckade f�rs�k");
			} else {
				System.out.println("R�tt l�senord, v�lkommen"); // r�tt p� andra f�rs�ket
			}
		} else {
			System.out.println("R�tt l�senord, v�lkommen"); // r�tt p� f�rsta f�rs�ket
		}
	}
}
