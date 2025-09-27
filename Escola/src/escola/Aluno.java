package escola;
import java.time.LocalDate;

public class Aluno extends Pessoa{
    
    String matricula;
 
    public Aluno(String nome, String cpf, LocalDate dataNascimento, String matricula){
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }
    
    @Override
    public double tirarCopias(int qtd){
        double calculo = qtd * 0.07;
        return calculo;
    }
}
