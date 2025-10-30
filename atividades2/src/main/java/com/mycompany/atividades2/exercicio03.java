package com.mycompany.atividades2;
import java.text.DecimalFormat;

public class exercicio03 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("000.00");
        System.out.println("Este é o seu saldo: R$900,00");
        
        double por = 900 * 0.01;
        double rea = 900 + por;
        
        System.out.println("O reajuste do seu saldo é: R$"+df.format(rea));
        
    }
}
