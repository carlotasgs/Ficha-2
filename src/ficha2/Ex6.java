package ficha2;

import java.util.Scanner;

public class Ex6
{

	public static int Vogais(String aFrase)
	{
		int num = 0;
		char[] _vogaiStrings =
		{ 'a', 'A', 'o', 'O', 'i', 'I', 'e', 'E', 'u', 'U' };

		for (int n = 0; n < aFrase.length(); n++)
		{

			for (int i = 0; i < _vogaiStrings.length; i++)
			{

				if (_vogaiStrings[i] == aFrase.charAt(n))
				{
					num += 1;
				}

			}
		}

		return num;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your frase: ");

		System.out.println("This frase contains " + Vogais(sc.nextLine()) + " vogais.");
		sc.close();
	}

}
