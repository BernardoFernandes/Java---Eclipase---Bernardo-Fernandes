package pacote1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area_do_Rectangulo {

	public static void main(String[] args) throws IOException
		{String C="";
		System.out.print("Digite o comprimento?: ");
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		C = GuardaS.readLine();
		System.out.println("Qual a Largura?");
		String L = "";
		InputStreamReader LerSL = new InputStreamReader (System.in);
		BufferedReader GuardaSL = new BufferedReader (LerSL);
		L = GuardaSL.readLine();
	System.out.printf("A Área é %d.", Integer.valueOf(C)*Integer.valueOf(L));
		
	}

}
