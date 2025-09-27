package escola;
import java.time.LocalDate;

public class Professor extends Pessoa{
    
    String disciplina;
    double salario;
    
    public Professor(String nome, String cpf, LocalDate dataNascimento, String disciplina, double salario){
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }
}
