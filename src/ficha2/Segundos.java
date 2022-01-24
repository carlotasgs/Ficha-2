package ficha2;

import java.util.Scanner;

public class Segundos
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of seconds: ");
		Segundos myObj = new Segundos();

		GuardaValor auxGuardaValor = new GuardaValor();
		auxGuardaValor = convertSecondsque();

		System.out.println(auxGuardaValor);
		auxGuardaValor.equals(myObj)
		sc.close();
	}

	public static GuardaValor convertSecondsque()
	{
		GuardaValor aux = new GuardaValor();
		aux.set$dias(10);

		return aux;
	}

}
