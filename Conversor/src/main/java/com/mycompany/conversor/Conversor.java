package com.mycompany.conversor;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha a sua moeda: ");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.println("4 - Libra");
        System.out.println("Escolha: ");
        int moeda = entrada.nextInt();
        System.out.println("Escolha a moeda que você quer que converta: ");
        if(moeda == 1){
            System.out.println("1 - Dólar");
            System.out.println("2 - Euro");
            System.out.println("3 - Libra");
            System.out.println("Escolha: ");
            int converter = entrada.nextInt();
            System.out.println("Digite a quantidade que deseja converter:");
            double q = entrada.nextDouble();
            
            if(converter == 1){
                double calculo = q * 0.19;
                
                System.out.println("Em dólares vale: USD$"+calculo);
            }
            if(converter == 2){
                double calculo = q * 0.16;
                
                System.out.println("Em Euros vale: EUR€"+calculo);
            }
            if(converter == 3){
                double calculo = q * 0.14;
                
                System.out.println("Em Libras vale: GBP£"+calculo);
            }
        }
        if(moeda == 2){
            System.out.println("1 - Real");
            System.out.println("2 - Euro");
            System.out.println("3 - Libra");
            System.out.println("Escolha: ");
            int converter = entrada.nextInt();
            System.out.println("Digite a quantidade que deseja converter:");
            double q = entrada.nextDouble();
            
            if(converter == 1){
                double calculo = q * 5.34;
                
                System.out.println("Em reais vale: R$"+calculo);
            }
            if(converter == 2){
                double calculo = q * 0.86;
                
                System.out.println("Em euros vale: EUR€"+calculo);
            }
            if(converter == 3){
                double calculo = q * 0.76;
                
                System.out.println("Em libras vale: GBP£"+calculo);
            }
        }
        if(moeda == 3){
            System.out.println("1 - Real");
            System.out.println("2 - Dólar");
            System.out.println("3 - Libra");
            System.out.println("Escolha: ");
            int converter = entrada.nextInt();
            System.out.println("Digite a quantidade que deseja converter:");
            double q = entrada.nextDouble();
            
            if(converter == 1){
                double calculo = q * 6.18;
                
                System.out.println("Em reais vale: R$"+calculo);
            }
            if(converter == 2){
                double calculo = q * 1.16;
                
                System.out.println("Em dólares vale: USD$"+calculo);
            }
            if(converter == 3){
                double calculo = q * 0.88;
                
                System.out.println("Em libras vale: GBP£"+calculo);
            }
        }
        if(moeda == 4){
            System.out.println("1 - Real");
            System.out.println("2 - Dólar");
            System.out.println("3 - Euro");
            System.out.println("Escolha: ");
            int converter = entrada.nextInt();
            System.out.println("Digite a quantidade que deseja converter:");
            double q = entrada.nextDouble();
            
            if(converter == 1){
                double calculo = q * 7.06;
                
                System.out.println("Em reais vale: R$"+calculo);
            }
            if(converter == 2){
                double calculo = q * 1.32;
                
                System.out.println("Em dólares vale: USD$"+calculo);
            }
            if(converter == 3){
                double calculo = q * 1.14;
                
                System.out.println("Em euros vale: EUR€"+calculo);
            }
        }
        
    }
}
