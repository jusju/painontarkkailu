package viikko7;

import java.util.Scanner;

public class PainoSovellus {

	public static void main(String[] args) {
		PainoSovellus sovellus = new PainoSovellus();
		Scanner input = new Scanner(System.in);
		int valinta = 1;
		while(valinta != 0) {
			sovellus.tulostaValikko();
			valinta = input.nextInt();
			// ENTERIN POISTO PUSKURISTA
			input.nextLine();
			if(valinta == 1) {
				
			} else if(valinta == 2) {
				
			} else if(valinta == 3) {
				
			}
		}
		
	}

	public void tulostaValikko() {
		System.out.println("Valikko");
		System.out.println("0) Lopeta");
		System.out.println("1) Lis‰‰ painokirjaus menneelle p‰iv‰lle");
		System.out.println("2) Tulosta painokuvaaja");
		System.out.println("3) Lis‰‰ painokirjaus t‰lle p‰iv‰lle");
		System.out.print("Anna valintasi (0, 1, 2 tai 3): ");
	}
	
}
