
package exercíciosdaaula02;

public class exercicio011 {
    public static void main(String[] args){
        double vc = 66000;
        double pd = 0.28;
        double im = 0.45;
        double ac = vc * pd;
        double ac2 = vc * im;
        double pc = vc + ac + ac2;
        
        System.out.println("Valor de Fábrica do carro: R$"+vc);
        System.out.println("Percentual da distribuidora: "+pd*100+"%");
        System.out.println("Percentual do imposto: "+im*100+"%");
        System.out.println("Preço que irá aparecer ao consumidor: R$"+pc);
    }
}
