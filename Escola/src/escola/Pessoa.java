package escola;
import java.time.LocalDate;

public class Pessoa {
    String nome;
    String cpf;
    LocalDate dataNascimento;
    
    public Pessoa(String nomePerson, String cpf, LocalDate dataDeNascimento){
        this.nome = nomePerson;
        this.cpf = cpf;
        this.dataNascimento = dataDeNascimento;
    }
    
    public double tirarCopias(int qtd){
        double calculo = qtd * 0.10;
        
        return calculo;
    }
}

