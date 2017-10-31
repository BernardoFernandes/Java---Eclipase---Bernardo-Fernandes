package pacote1;
import java.io.*;
public class diadasbruxas {

	public static void main(String[] args) throws IOException
	{String C="";
System.out.println("Halloween");
System.out.print("Doce ou travessura?: ");
InputStreamReader LerS = new InputStreamReader (System.in);
BufferedReader GuardaS = new BufferedReader (LerS);
C = GuardaS.readLine();
System.out.printf("O utilizador escolheu " + C,args);	}

}
