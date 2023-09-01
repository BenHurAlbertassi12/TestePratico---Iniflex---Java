package desafio.programacao.iniflex;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class BuscarMaiorIdade {
    public static void imprimirMaiorIdade(List<Funcionario> funcionarios) {
        Funcionario funcionarioMaiorIdade = null;
        int maiorIdade = 0;

        for (Funcionario funcionario : funcionarios) {
            int idade = calcularIdade(funcionario.dataNascimento);
            if (idade > maiorIdade) {
                maiorIdade = idade;
                funcionarioMaiorIdade = funcionario;
            }
        }

        if (funcionarioMaiorIdade != null) {
            System.out.println("Funcionário mais velho: " + funcionarioMaiorIdade.nome +
                               ", Idade: " + maiorIdade);
        }
    }

    private static int calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }
}