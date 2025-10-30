package com.mycompany.atividades2;
import java.util.Scanner;

public class Atividades2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite quantos anos você viveu: ");
        int ano = entrada.nextInt();
        System.out.println("Digite quantos meses você viveu: ");
        int mes = entrada.nextInt();
        System.out.println("Digite quantos dias você viveu: ");
        int dia = entrada.nextInt();
        
        int AnoDia = 365 * ano;
        int MesDia = 30 * mes;
        
        int totalDias = AnoDia + MesDia + dia;
        
        System.out.println("Você viveu "+totalDias+" dias");
    }
}
