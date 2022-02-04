package ficha2;

import java.util.Scanner;

public class Ex8 {

		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Escreva um número:");
			int numero = sc.nextInt();

			Ex8 r = new Ex8();
			int segundos;
			int resultado = r.convertSeconds(segundos);

			System.out.println("O seu fatorial (recursivamente) - " + resultado);
			sc.close();
		}

		public int convertSeconds(int segundos)
		{
			
		}


}
