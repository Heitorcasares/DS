package whileelacosderepeticao;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é o tamanho do quadrado? ");
        int lado = entrada.nextInt();
        for(int contador = 1; contador <= lado; contador++){
            
            for(int contador2 = 1; contador2 <= lado-1; contador2++){
                System.out.print("*");
            }
            System.out.print("*\n");
        }
        System.out.println("Fim");
    }
}
