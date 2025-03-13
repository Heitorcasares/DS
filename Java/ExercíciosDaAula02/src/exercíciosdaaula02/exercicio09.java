package exercíciosdaaula02;

public class exercicio09 {
    public static void main(String[] args){
        double TE = 10000000;
        double b = 500000;
        double n = 200000;
        double v = 1900000;
        double pTEb = (b / TE) * 100;
        double pTEn = (n / TE) * 100;
        double pTEv = (v / TE) * 100;
        
        System.out.println("Número total de eleitores: " + TE);
        System.out.println("Número de votos brancos: " + b);
        System.out.println("Número de votos nulos: " + n);
        System.out.println("Número de votos válidos: "+ v);
        System.out.println("Percentual da relação de total de eleitores com votos brancos: "+pTEb+"%");
        System.out.println("Percentual da relação de total de eleitores com votos nulos: "+pTEn+"%");
        System.out.println("Percentual da relação de total de eleitores com votos válidos: "+pTEv+"%");
        
        
    }
}
