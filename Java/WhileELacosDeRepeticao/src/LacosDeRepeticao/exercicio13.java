package LacosDeRepeticao;

public class exercicio13 {
    public static void main(String[] args){
       System.out.println("Temos uma sequência de Fibonacci:");
       System.out.println("0,1,1,2,3,5,8,13,21,34,55,...");
       int conta = 0;
       int z = 0;
       int y = 1;
       int x = 500; 
       System.out.println("Esta é a sequência até atingir um valor maior que 500: ");
       while(conta < x){
          conta = z + y;
          y =z;
          z = conta;
          System.out.print(conta+", ");
            
        }
    }
       
}
