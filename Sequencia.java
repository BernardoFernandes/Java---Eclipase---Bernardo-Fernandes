package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
   int soma=0;
   int num;
   Scanner Ler = new Scanner (System.in);
   System.out.print("Digite quantos numeros que somar");
   num = Ler.nextInt();
    for(int I=1;I<=num;I++){
    soma +=I;
    }
    System.out.println(soma);   
    }  
    }