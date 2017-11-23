
package javaapplication4;
import java.util.Scanner;
public class ResultadoFinaldoAluno {

    public static void main(String[] args) {
    Scanner Ler = new Scanner (System.in);
String nome;
double num1 , num2;
double resultado;
System.out.print("digite o nome do aluno");
nome = Ler.next();
System.out.print("digite a avalição cognitiva do aluno");
num1 = Ler.nextDouble();
System.out.print("digite a avaliação das atitudes do aluno");
num2 = Ler.nextDouble();
resultado = 0.6*num1+0.4*num2;
if (resultado>=10)
System.out.print("o aluno passou.");
if (resultado<10)
System.out.print("o aluno reprovou.");
System.out.print("O resultado do aluno:" + nome + ",com:" + resultado);
    }
    
}
