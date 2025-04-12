package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int cont = 1;
        int z = 0;
        int u = 0;
        
        System.out.println("Quantos números tem a sequência: ");
        int x = entrada.nextInt();
        System.out.println("\n");
        
        while(cont <= x){
            System.out.println("Digite um número: ");
            int y = entrada.nextInt();
            while(y < 0 || y > 1000){
                System.out.println("Valor inválido!");
                System.out.println("Digite o valor novamente: ");
                y = entrada.nextInt();
            }
            if(cont == 1){
                z = y;
                u = y;
            }
            if(y > z){
                z = y;
            }
            if(y < u){
                u = y;
            }
            cont = cont+1;
        }
        int soma = z + u;
        System.out.println("Este é o menor número: "+u);
        System.out.println("Este é o maior número: "+z);
        System.out.println("Esta é a soma destes dois números: "+soma);
    }
}
