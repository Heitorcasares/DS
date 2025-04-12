package LacosDeRepeticao;

public class exercicio11 {
    public static void main(String[] args){
        double PA = 80000;
        double TA = 0.03;
        double PA2 = 80000;
        double TA2 = 0.03;
        double PB = 200000;
        double TB = 0.015;
        double PB2 = 200000;
        double TB2 = 0.015;
        double cont = 0;
        double cont2 = 0;
        
        System.out.println("População A tem "+PA+" habitantes");
        System.out.println("A taxa de crescimento dele é: "+ TA);
        System.out.println("\nPopulação B tem "+PB+" habitantes");
        System.out.println("A taxa de crescimento dele é: "+ TB);
        
        while(PA < PB){
            double por = PA * TA;
            PA = PA + por;
            double por2 = PB * TB;
            PB = PB + por2;
            cont = cont + 1;
        }
        
        while(PA2 != PB2){
            double por2 = PA2 * TA2;
            PA2 = PA2 + por2;
            double por3 = PB2 * TB2;
            PB2 = PB2 + por3;
            cont2 = cont2 + 1;
        }
        
        if (PA > PB){
            System.out.println("Demorou "+cont+" anos para a população A ultrapassar a B");
        }
        
        System.out.println("Demorou "+cont2+" anos para a população A se igualar a B");
        
        
    }
}
