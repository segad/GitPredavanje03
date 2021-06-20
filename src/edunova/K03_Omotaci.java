package edunova;

import javax.swing.JOptionPane;

public class K03_Omotaci {
	public static void main(String[] args) {
		/*
		//korisnik unosi broj, ali on to gleda kao string, pa ga treba prenjeti u integer
		//ovo je fiksni unos, kasnije æe biti i unos korisnika
		int i = Integer.parseInt("7");
		System.out.println(i);
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		System.out.println(b);
		
		//razlika izmeðu primitivinih tipova i objekata
		String unioKorisnik=JOptionPane.showInputDialog("Daj mi cijeli broj");
		
		i = Integer.parseInt(unioKorisnik);
		
		System.out.println(i+10);
		
		*/
		
		//Uèitajte dva cijela broja (korisnik) i ispište njihov zbroj
		
		int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		c = a+b;
		System.out.println("Zbroj prvog i drugog broja je " + c);
		
		
		int broj = 27363;
		
		long velikiBroj = Long.parseLong("2763");
		
		float decimalniManji = Float.parseFloat("3.14");
		
		double velikiDecimalni = Double.parseDouble("3.14");
		
		//Ovo je nejasno
		char znak = Character.forDigit(148, 10);

		System.out.println(znak);
	}

}
