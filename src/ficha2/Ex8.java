package ficha2;

import java.util.Scanner;

public class Ex8
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of seconds: ");

		// Segundos myObj = new Segundos();

		GuardaValor auxGuardaValor = new GuardaValor();
		auxGuardaValor = convertSecondsque(sc.nextInt());

		System.out.println(auxGuardaValor);
//		auxGuardaValor.equals(myObj)
		sc.close();
	}

	public static GuardaValor convertSecondsque(int i)
	{

		GuardaValor aux = new GuardaValor();
		aux.set$meses(i / (60 * 60 * 24 * 30));
		i = i % (60 * 60 * 24 * 30);

		aux.set$dias(i / (60 * 60 * 24));
		i = i % (60 * 60 * 24);

		aux.set$horas(i / (60 * 60));
		i = i % (60 * 60);

		aux.set$minutos(i / 60);
		i = i % 60;

		aux.set$segundos(i);

		return aux;
	}

}
