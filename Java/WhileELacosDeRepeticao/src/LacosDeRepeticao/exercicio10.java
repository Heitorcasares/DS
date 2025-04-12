package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número e veja a tabuada do respectivo número!");
        System.out.println("Digite um número: ");
        int x = entrada.nextInt();
        
        System.out.println("Esta é a tabuada deste número: ");
        for(int contador = 1; contador <= 10; contador++){
            System.out.println(x+" X "+contador+" = "+x*contador);
        }
    }
}
