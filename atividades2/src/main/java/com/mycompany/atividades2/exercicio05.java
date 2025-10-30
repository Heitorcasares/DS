package com.mycompany.atividades2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        
        double SM = 788.00;
        
        System.out.println("Digite o seu salário: ");
        double s = entrada.nextDouble();
        
        double cal = s/SM;
        
        System.out.println("Essa é a quantidade de salários minímos que você ganha: "+df.format(cal)+" salários");
    }
}
