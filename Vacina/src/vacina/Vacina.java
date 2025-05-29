package vacina;
import java.util.Scanner;

public class Vacina {

    public static void main(String[] args) {
        //exercício feito em trio Arthur Baldo, Heitor da Silva Casares e André Schwartz
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do arranjo (H):");
        int H = scanner.nextInt();
        int[] genes = new int[H];
        
        System.out.println("Digite os " + H + " genes (um por linha):");
        for (int i = 0; i < H; i++) {
            genes[i] = scanner.nextInt();
        }
        
        System.out.println("Digite o gene alvo:");
        int geneAlvo = scanner.nextInt();
        
        int contador = 0;
        for (int gene : genes) {
            if (gene == geneAlvo) {
                contador++;
            }
        }
        
        if (contador > 1) {
            System.out.println("Achei o danado");
        } else if (contador == 1) {
            System.out.println("Ainda nao e o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }
        
        scanner.close();
    }
    
}
