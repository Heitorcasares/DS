package exerciciopo;

public class Banco {
    
    String cliente;
    int num_conta;
    float saldo;
    
    public Banco(String nomeDoCliente, int numeroDaConta, float saldoDisponivel){
        this.cliente = nomeDoCliente;
        this.num_conta = numeroDaConta;
        this.saldo = saldoDisponivel;
    }
    
    public float sacar(float x){
        
        saldo = saldo - x; 
        if(saldo < 0){
            saldo = 0;
        }
        return saldo;
    }
    
    public float depositar(float y){
        
        saldo = saldo + y;
        
        return saldo;
    }
}
