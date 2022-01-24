package ficha2;

import java.util.Calendar;

//Exercicio1

public class main {
		
	public static int areaTriang(int altura, int base)
		  {
		    int areaTriangulo = (altura * base )/2;

		    return areaTriangulo;
		  }


//Exercicio2
	
	public static int areaRetang(int altura, int comprimento) 
		{
		
		int areaRetangulo = altura * comprimento;
		
		return areaRetangulo;
		}

//Exercicio3
	
	public static int areaCal(int x, int y, int z) 
	{
		
		if (z==1) {
			
			int areaTriangulo = (x * y)/2;
			return areaTriangulo;
		} else {
			int areaRetangulo = x * y;
			return areaRetangulo;
		}
	}

//Exercicio4
	
	public static int factor(int n) 
	{
		int fact=1;
		
		for (int i=1; i<= n; i++)
		{
			fact *= i;
		}
	return fact;
	}


}