
package fatoriall;
import java.util.Scanner;
public class Fatoriall {

    public static void main(String[] args) {
    int N, Fat=1;
Scanner LerS = new Scanner (System.in);
System.out.print("Digite um numero inteiro positivo inferior a 32");
N = LerS.nextInt();
for (int M=N ; M>=1 ; M--)
    Fat*=M;
System.out.printf("%d!=%d", N, Fat);
    }}
