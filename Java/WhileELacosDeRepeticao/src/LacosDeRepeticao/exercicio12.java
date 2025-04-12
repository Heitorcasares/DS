package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Temos uma sequência de Fibonacci:");
        System.out.println("1,1,2,3,5,8,13,21,34,55,...");
        System.out.println("Digite uma posição dessa sequência: ");
        int x = entrada.nextInt();
        int cont = 1;
        int z = 1;
        int y = 1;
        
        System.out.println("Esta é a sequência até a posição que você digitou: ");
        while(cont <= x){
            cont = cont +1;
            int conta = z + y;
            y =z;
            z = conta;
            System.out.print(conta+", ");
            
        }
        
        
    }
}
