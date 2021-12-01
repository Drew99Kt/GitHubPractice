package RisaNarisa;

import java.util.Scanner;

public class Risa_Class1 {

	public static void main(String[] args) {
	
		Scanner wholeSC = new Scanner(System.in);

		System.out.println("Is the whole milk available?  True or False?");

		boolean wholeAVA = wholeSC.nextBoolean();

		if (wholeAVA == true) {
			Scanner wholeeprDateSC = new Scanner(System.in);

			System.out.println("How many day till expired for whole milk?");

			int wholedays = wholeeprDateSC.nextInt();

			if (wholedays >= 14) {
				Scanner wholeonSaleSC = new Scanner(System.in);

				System.out.println("If the whole milk is on sale, say True.  If not, say False!");

				boolean wholesale = wholeonSaleSC.nextBoolean();

				if (wholesale == true) // if whole milk is on sale
				{
					System.out.println("Nuch,buy 2 gallon of wholeper milk!");

				}
				if (wholesale == false) // if whole milk is not on sale..
					System.out.println("Nuch, buy 1 gallon of wholeper milk!");
			}

		}
		if (wholeAVA == false) {

			Scanner twoperSC = new Scanner(System.in);

			System.out.println("Is the 2% milk available?  True or False?");

			boolean twoperAVA = twoperSC.nextBoolean();

			if (twoperAVA == true) {
				Scanner twopereprDateSC = new Scanner(System.in);

				System.out.println("How many day till expired for twoper milk?");

				int twoperdays = twopereprDateSC.nextInt();

				if (twoperdays >= 14) {
					Scanner twoperonSaleSC = new Scanner(System.in);

					System.out.println("If the twoper milk is on sale, say True.  If not, say False!");

					boolean twopersale = twoperonSaleSC.nextBoolean();

					if (twopersale == true) {
						System.out.println("Nuch,buy 2 gallon of twoper milk!");

					} else {
						System.out.println("Nuch, buy 1 gallon of twoper milk!!!!");
					}
				} else {
					System.out.println("Nuch, buy 1 gallon of twoper milk!");
				}

			} else

			{
				Scanner fatfreeSC = new Scanner(System.in);

				System.out.println("Is the fatfree milk available?  True or False?");

				boolean fatfreeAVA = fatfreeSC.nextBoolean();

				if (fatfreeAVA == true) {
					Scanner fatfreeeprDateSC = new Scanner(System.in);

					System.out.println("How many day till expired for fatfree milk?");

					int fatfreedays = fatfreeeprDateSC.nextInt();

					if (fatfreedays >= 14) {
						Scanner fatfreeonSaleSC = new Scanner(System.in);

						System.out.println("If the fatfree milk is on sale, say True.  If not, say False!");

						boolean fatfreesale = fatfreeonSaleSC.nextBoolean();

						if (fatfreesale == true) {
							System.out.println("Nuch,buy 2 gallon of fatfree milk!");

						} else {
							System.out.println("Nuch, buy 1 gallon of fatfree milk!!!!");
						}
					} else {
						System.out.println("Nuch, buy 1 gallon of fatfree milk!");
					}
				} else {
					System.out.println("Nuch, buy any ice cream and leave !!!");
				}

			}

		}



	}
}
	
