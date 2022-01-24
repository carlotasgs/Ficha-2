package ficha2;

// Ficha de exercícios 2 - exercicio 5
// Ex. 5:Crie uma função chamada factorRecursivo que recebe um argumento (n) e calcula o seu fatorial (recursivamente).
import java.util.Scanner;

public class Fatorial
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number");
		int myNum = sc.nextInt();

		Fatorial r = new Fatorial();
		int resp = r.fatorial(myNum);

		System.out.println("O seu fatorial (recursivamente) - " + resp);
		sc.close();
	}

	public int fatorial(int x)
	{
		if (x == 0)
			return 1;
		else
			return x * fatorial(x - 1);
	}

}
