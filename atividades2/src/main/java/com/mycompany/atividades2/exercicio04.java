package com.mycompany.atividades2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("000.00");
        
        System.out.println("Qual o valor da porcentagem IPI: ");
        double por = entrada.nextInt();
        System.out.println("Código da peça: ");
        double c1 = entrada.nextInt();
        System.out.println("Valor unitário da peça: ");
        double v1 = entrada.nextInt();
        System.out.println("Quantidade: ");
        double q1 = entrada.nextInt();
        System.out.println("Código da peça 2: ");
        double c2 = entrada.nextInt();
        System.out.println("Valor unitário da peça 2: ");
        double v2 = entrada.nextInt();
        System.out.println("Quantidade: ");
        double q2 = entrada.nextInt();
        
        double cal = (v1*q1 + v2*q2)*(por/100+1);
        
        System.out.println("Esse é o valor total a ser pago: R$"+df.format(cal));
    }
}
