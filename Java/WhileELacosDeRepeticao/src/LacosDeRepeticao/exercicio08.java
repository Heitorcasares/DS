package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int x = entrada.nextInt();
        while (x <= 0){
            System.out.println("Valor inválido!");
            System.out.println("Digite novamente o número: ");
            x = entrada.nextInt();
        }
        
        System.out.println("Estes são todos os números até o número que você digitou: ");
        for(int contador = 1; contador <= x; contador++){
            System.out.print(contador + "," + " ");
        }
        System.out.println("\nFim!");
    }
}
