package desafio.programacao.iniflex;

// import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class ImprimirFuncionarios {
    public static void imprimir(List<Funcionario> funcionarios) {
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            System.out.println("Nome: " + funcionario.nome);
            System.out.println("Data de Nascimento: " + funcionario.dataNascimento.format(dateFormatter));
            System.out.println("Salário: " + funcionario.salario);
            System.out.println("Função: " + funcionario.funcao);
            System.out.println();
        }
    }
}
