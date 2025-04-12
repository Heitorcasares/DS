package whileelacosderepeticao;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        
        System.out.println("Estes são os números pares até o número que você digitou: ");
        for(int contador = 0; contador <= num; contador=contador+2){
            System.out.println(contador);
        }
        System.out.println("Estes são os números ímpares até o número que você digitou: ");
        for(int contador = 1; contador <= num; contador=contador+2){
            System.out.println(contador);
        }
    }
}
