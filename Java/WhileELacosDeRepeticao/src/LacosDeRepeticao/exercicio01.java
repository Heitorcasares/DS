package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int x = entrada.nextInt();
        System.out.println("Entre com um segundo valor: ");
        int y = entrada.nextInt();
        
        while(y == 0){
            System.out.println("Valor inválido!");
            System.out.println("Digite o segundo valor novamente: ");
            y = entrada.nextInt();
        }
        
        int div = x/y;
        
        System.out.println("Esse é resultado da divisão entre esses dois números: "+ div);
    }
}
