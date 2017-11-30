
package javaapplication1;

import java.util.Scanner;

public class 3maior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    double num1,num2,num3;
    double max = 0;
    System.out.print("Digite o primeiro numero");
    num1 = ler.nextDouble();
    System.out.print("digite o segundo numero");
    num2 = ler.nextDouble();
    System.out.print("Digite o terceiro numero");
    num3 = ler.nextDouble();
    if (num1>num2 && num1>num3)
    max=num1;
        
        
    if(num2>num1 && num2>num3)
    max = num2;
    if(num3>num1 && num3>num2)
    max = num3;
    System.out.print("maximo:" + max);
       
    }
    
    
    }
