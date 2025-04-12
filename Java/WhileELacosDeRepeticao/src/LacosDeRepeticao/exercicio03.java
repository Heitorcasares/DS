
package LacosDeRepeticao;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Média das avaliações do Aluno: ");
        System.out.println("Digite a primeira nota: ");
        int x = entrada.nextInt();
        while(x < 0 || x > 10){
            System.out.println("Valor inválido!");
            System.out.println("Digite novamente a primeira nota: ");
            x = entrada.nextInt();
        }
        System.out.println("Digite a segunda nota: ");
        int y = entrada.nextInt();
        
        while(y < 0 || y > 10){
            System.out.println("Valor inválido!");
            System.out.println("Digite novamente a segunda nota: ");
            y = entrada.nextInt();
        }
        
        int media = (x+y)/2;
        
        System.out.println("A média das notas das avaliações deste aluno é: "+media);
        
    }
}
