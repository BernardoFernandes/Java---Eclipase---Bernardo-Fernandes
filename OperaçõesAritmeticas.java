package operaçõesaritmeticas;
import java.util.Scanner;
public class OperaçõesAritmeticas {

    public static void main(String[] args) {
Scanner Ler = new Scanner (System.in);
 double num1;
 double num2;
 String operacao;
 double resultado=0;
 System.out.print("Digite o 1º numero");
 num1 = Ler.nextDouble();
 System.out.print("Digite o 2º numero");
 num2 = Ler.nextDouble();
 System.out.println("digite o numero da operação desejada");
 operacao = Ler.next();
 switch(operacao){
     case "+":
     resultado=num1+num2;
     System.out.println("O resultado é:" + resultado);
     break;
     case "-":
     resultado=num1-num2;
     System.out.println("O resultado é:" + resultado);
     break;
     case "*":
     resultado=num1*num2;
     System.out.println("O resultado é:" + resultado);
     break;
     case "/":
     resultado=num1/num2;
     System.out.println("O resultado é:" + resultado);
     break;
 }
     
 }
    }
    

