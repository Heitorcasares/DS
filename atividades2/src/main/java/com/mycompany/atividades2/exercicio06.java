package com.mycompany.atividades2;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        
        int ant = num-1;
        int suc = num+1;
        
        System.out.println("Este é o seu antecessor: "+ant);
        System.out.println("Este é o seu sucessor: "+suc);
        
    }
}
