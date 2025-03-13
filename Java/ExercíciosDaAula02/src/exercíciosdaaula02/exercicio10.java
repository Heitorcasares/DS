
package exercíciosdaaula02;

public class exercicio10 {
    public static void main(String[] args){
        double s = 13500;
        double r = 0.30;
        double ac = s * r;
        double sf = s + ac;
        
        System.out.println("Seu salário atual: R$"+s);
        System.out.println("O valor do reajuste: "+r*100+"%");
        System.out.println("Salário reajustado: R$"+sf);
    }
}
