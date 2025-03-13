
package exercíciosdaaula02;

public class exercicio012 {
    public static void main(String[] args){
        double s = 2000;
        double cc = 0.30;
        double cv = 0.05;
        double v = 700000;
        double c = 90000;
        double q = 30;
        double ac = (c * cc) * q;
        double ac2 = v * cv;
        double sf = s + ac + ac2;
        
        System.out.println("Seu salário fixo: R$"+s);
        System.out.println("Total de vendas: R$"+v);
        System.out.println("Quantidade de carros que você vendeu: "+q+" carros");
        System.out.println("Preço de cada carro: R$"+c);
        System.out.println("Comissão do total das vendas: "+cv*100+"%");
        System.out.println("Comissão do total das vendas dos carros que você vendeu: "+cc*100+"%");
        System.out.println("Seu salário final vai ser: R$"+sf);
        
        
    }
}
