package edunova;

import javax.swing.JOptionPane;

public class Zadaci {
	public static void main(String[] args) {

		// deklarirajte varijablu za pohranu tjelesne temperature �ovjeka
		// kao int i dodijelite vrijednost 36

		int humanTemperature = 36;

		System.out.println(humanTemperature);

		// deklarirajte varijablu za temperaturu kao int
		// i dodijelite vrijednost -9.
		// Ispi�ite vrijednost

		int temperatura = -9;
		System.out.println(temperatura);

		// Program od korisnika u�itava tri broja
		// program ispisuje zbroj prvoga i tre�ega
		// podijeljenj s drugim unesenim brojem

		float prviBroj, drugiBroj, treciBroj, rezultat;

		prviBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite prvi broj"));
		drugiBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite drugi broj"));
		treciBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite tre�i broj"));

		rezultat = (prviBroj + treciBroj) / treciBroj;
		System.out.println("Zbroj prvog i tre�eg broja podijeljen sa drugim iznosi "+rezultat);
	}

}
