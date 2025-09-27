package exerciciopo;

public class ExercicioPO {

    public static void main(String[] args) {
        
        Banco bancoBB = new Banco("Sergio", 43536537, 200);
        
        System.out.println(bancoBB.num_conta);
        System.out.println(bancoBB.cliente);
    }
    
}
