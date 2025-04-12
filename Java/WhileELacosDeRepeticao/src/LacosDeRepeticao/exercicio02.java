package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int x = entrada.nextInt();
        System.out.println("Entre com um segundo valor: ");
        int y = entrada.nextInt();
        
        
        while (y == 0){
            System.out.println("Valor Inválido");
            break;
        }
        
        if(y > 0){
            int div = x/y;
            System.out.println("Esse é resultado da divisão entre esses dois números: "+ div);
        }
        
    }
}
