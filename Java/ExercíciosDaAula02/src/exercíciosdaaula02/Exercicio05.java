package exercíciosdaaula02;

public class Exercicio05 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        var s = "Troca!";
        
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println(s);
        if (s.equals("Troca!")){
            x = x * 8;
            y = y * 8;
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
        
    }
}
