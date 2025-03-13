package exercíciosdaaula02;

public class Exercicio03 {
    public static void main(String[] args){
        String nome = "Carlos";
        float salario = 1000000;
        float vendas = 500000;
        double por = 0.15;
        double comis = vendas * por;
        double fm = salario + comis;
        
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: " + "R$" + salario);
        System.out.println("Salário no final do mês: " + "R$" + fm);
    }
}
