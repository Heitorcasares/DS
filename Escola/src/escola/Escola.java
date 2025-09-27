package escola;
import java.time.LocalDate;
import java.time.Month;

public class Escola {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Pedro", "902.221.560-15", LocalDate.of(1998, Month.MARCH, 23), "678348563456786734");
        Professor prof1 = new Professor("Marcos", "829.454.640-20", LocalDate.of(1985, Month.JUNE, 12), "Matemática", 2000);
        Funcionario funcionario1 = new Funcionario("Cleber", "219.022.700-37", LocalDate.of(1945, Month.JANUARY, 21), 3000, "Coordenador", LocalDate.of(2025, Month.APRIL, 24));
        
        System.out.println("Aluno 1: ");
        System.out.println("Nome: "+aluno1.nome);
        System.out.println("Total gasto nas cópias: R$"+aluno1.tirarCopias(100));
        System.out.println(" ");
        System.out.println("Professor 1: ");
        System.out.println("Nome: "+prof1.nome);
        System.out.println("Total gasto nas cópias: R$"+prof1.tirarCopias(100));
        System.out.println(" ");
        System.out.println("Funcionario 1: ");
        System.out.println("Nome: "+funcionario1.nome);
        System.out.println("Total gasto nas cópias: R$"+funcionario1.tirarCopias(100));
    }
    
}
