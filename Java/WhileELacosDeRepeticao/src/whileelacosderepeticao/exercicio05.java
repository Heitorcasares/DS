package whileelacosderepeticao;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        int num2 = 0;
        while(i <= 10){
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();
            i = i+1;
           
            if(num > num2){
                num2 = num;
            }
        }
        
        System.out.println("Este é o maior número: "+ num2);
        
        
    }
}
