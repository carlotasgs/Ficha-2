package ficha2;

import java.util.Scanner;

public class Segundos
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
		aux.set$segundos(i);
		aux.set$minutos(i / 60);
		aux.set$horas(i / 60 / 60);
		aux.set$dias(i / 60 / 60 / 24);
		aux.set$meses(i / 60 / 60 / 24 / 30);
		return aux;
	}

}
