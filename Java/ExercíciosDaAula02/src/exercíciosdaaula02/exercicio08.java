package exercíciosdaaula02;

public class exercicio08 {
    public static void main(String[] args){
        int YD = 10000;
        int Y = YD/365;
        int M = (YD-Y*365)/30;
        int D = (YD-Y*365) - M*30;
        
        System.out.println("Esses são dias que você viveu: " + YD);
        System.out.println("Então você viveu "+ Y + " ano(s), " + M + " meses e "+D+" dias");
    }
}
