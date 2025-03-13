package exercíciosdaaula02;

public class exercicio014 {
    public static void main(String[] args){
        int LV = 90;
        var TC = "A";
        double G = 3.30;
        double A = 2.90;
        
        if(TC.equals("G")){
            if(LV<=20){
                double p1 = 0.04;
                double d1 = G * p1;
                double pf1L = G - d1;
                double pn = G * LV;
                double pft = LV * pf1L;
                
                System.out.println("Litros vendidos para você: "+LV+"L");
                System.out.println("Preço de cada litro: R$"+G);
                System.out.println("Desconto que você recebeu a cada litro vendido: "+p1*100+"%");
                System.out.println("Preço que você iria pagar: R$"+pn);
                System.out.println("Preço final a pagar: R$"+pft);
            }
            
            else if(LV>20){
                double p2 = 0.06;
                double d2 = G * p2;
                double pf2L = G - d2;
                double pn2 = G * LV;
                double pft2 = LV * pf2L;
                
                System.out.println("Litros vendidos para você: "+LV+"L");
                System.out.println("Preço de cada litro: R$"+G);
                System.out.println("Desconto que você recebeu a cada litro vendido: "+p2*100+"%");
                System.out.println("Preço que você iria pagar: R$"+pn2);
                System.out.println("Preço final a pagar: R$"+pft2);
            }
        }
        
        if(TC.equals("A")){
            if(LV<=20){
                double p1 = 0.03;
                double d1 = A * p1;
                double pf1L = A - d1;
                double pn = A * LV;
                double pft = LV * pf1L;
                
                System.out.println("Litros vendidos para você: "+LV+"L");
                System.out.println("Preço de cada litro: R$"+A);
                System.out.println("Desconto que você recebeu a cada litro vendido: "+p1*100+"%");
                System.out.println("Preço que você iria pagar: R$"+pn);
                System.out.println("Preço final a pagar: R$"+pft);
            }
            else if(LV>20){
                double p2 = 0.05;
                double d2 = A * p2;
                double pf2L = A - d2;
                double pn2 = A * LV;
                double pft2 = LV * pf2L;
                
                System.out.println("Litros vendidos para você: "+LV+"L");
                System.out.println("Preço de cada litro: R$"+A);
                System.out.println("Desconto que você recebeu a cada litro vendido: "+p2*100+"%");
                System.out.println("Preço que você iria pagar: R$"+pn2);
                System.out.println("Preço final a pagar: R$"+pft2);
            }
        }
    }
}
