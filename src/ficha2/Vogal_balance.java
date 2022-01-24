package ficha2;

import java.util.Scanner;

public class Vogal_balance
{

	public static void bVogais(String aFrase)
	{
		System.out.println("This frase contains ");
		int num = 0;
		char[] _vogaiStrings =
		{ 'a', 'A', 'o', 'O', 'i', 'I', 'e', 'E', 'u', 'U' };

		for (int i = 0; i < _vogaiStrings.length; i++)
		{

			for (int n = 0; n < aFrase.length(); n++)
			{

				if (_vogaiStrings[i] == aFrase.charAt(n))
				{
					num += 1;
				}

			}
			if (num != 0)
				System.out.println(_vogaiStrings[i] + ": " + num);
			num = 0;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your frase: ");

		bVogais(sc.nextLine());
		sc.close();
	}

}