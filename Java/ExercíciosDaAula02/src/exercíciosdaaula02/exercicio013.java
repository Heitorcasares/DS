package exercíciosdaaula02;

public class exercicio013 {
    public static void main(String[] args){
        var nome = "Helena";
        var sexo = "F";
        double altura = 1.50;
        
        if (sexo.equals("M")){
            double pih = (72.7*altura)-58;
            System.out.println("Seu nome: "+nome);
            System.out.println("Seu sexo: "+sexo);
            System.out.println("Sua altura: "+altura+"m");
            System.out.println("Seu peso ideal é: "+pih+"Kg");
        }
        
        else if (sexo.equals("F")){
            double pim = (62.1*altura)-44.7;
            System.out.println("Seu nome: "+nome);
            System.out.println("Seu sexo: "+sexo);
            System.out.println("Sua altura: "+altura+"m");
            System.out.println("Seu peso ideal é: "+pim+"Kg");
        }
    }
}
