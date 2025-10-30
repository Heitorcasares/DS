package com.mycompany.atividades2;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class exercicio02 {
    public static void main(String[] args){
        
        int media1 = (7+8+9)/3;
        int media2 = (4+5+6)/3;
        double somaM = media1+media2;
        double mediaMedia = somaM/2;
        
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.DOWN);
        
        System.out.println("Média dos números 7, 8, 9: "+media1);
        System.out.println("Média dos números 4, 5, 6: "+media2);
        System.out.println("Soma das duas médias: "+somaM);
        System.out.println("Média das médias: "+df.format(mediaMedia));
        
    }
}
