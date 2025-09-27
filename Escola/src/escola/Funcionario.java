package escola;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    
    double salario;
    String cargo;
    LocalDate dataAdmissao;
    
    public Funcionario(String nome, String cpf, LocalDate dataNascimento, double salario, String cargo, LocalDate dataAdmissao){
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }
}
