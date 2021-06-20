package edunova;

public class K05_Operatori {
	public static void main(String[] args) {

		int a = 5, b = 7;

		int r = a / b;

		System.out.println(r);

		// ovaj float mora se staviti, da ga pretvori iz integera u float, inaèe ne radi
		float fr = (float) a / b;

		System.out.println(fr);
		
		// ovaj operator se zove modulu %
		//ostatak cijelobrojnog dijeljenja, on uzme tu vrijednsot
		int t = 9 % 2;
		System.out.println(t);

	}

}
