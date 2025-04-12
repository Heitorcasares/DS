package whileelacosderepeticao;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double i = 1;
        double nota = 0;
        System.out.println("Quantos alunos tem em sua sala? ");
        double alunos = entrada.nextDouble();
        
        while(i <= alunos){
            System.out.println("Digite a média do primeiro bimestre: ");
            double B1 = entrada.nextDouble();
            System.out.println("Digite a média do segundo bimestre: ");
            double B2 = entrada.nextDouble();
            System.out.println("Digite a média do terceiro bimestre: ");
            double B3 = entrada.nextDouble();
            System.out.println("Digite a média do quarto bimestre: ");
            double B4 = entrada.nextDouble();
            i = i+1;
            
            double soma = B1 + B2 + B3 + B4;
            nota = nota + soma;
        }
        double media = nota/(4*alunos);
        System.out.println("Esta é a média de toda a sala: "+media);
    }
}
