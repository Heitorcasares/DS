package exercíciosdaaula02;

public class exercicio06 {
    public static void main(String[] args){
        double dis = 400;
        double consumo = 30;
        double p = 5.00;
        double CustoTotal = (dis/consumo)*p;
        
        System.out.println("Distância total percorrida: " + dis + "Km");
        System.out.println("Consumo total: " + consumo + "Km/L");
        System.out.println("Preço do combustível por Litro: R$" + p);
        System.out.println("Esse será o custo total com o combustível de sua viagem: R$" + CustoTotal);
        
        
    }
}
