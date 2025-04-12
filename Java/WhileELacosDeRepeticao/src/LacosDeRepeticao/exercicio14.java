package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número que iremos mostrar o fatorial dele: ");
        System.out.println("Digite o número: ");
        int x = entrada.nextInt();
        int cont = 1;
        int y = x;
        int conta = 0;
        while((x-1) >= cont && y >= 2){
            cont = cont + 1;
            y = y - 1;
            conta = x * y;
            x = conta;
        }
        
        System.out.println("Este é o resultado do fatorial deste número: "+conta);
    }
}