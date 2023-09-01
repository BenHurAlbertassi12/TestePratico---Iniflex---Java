package desafio.programacao.iniflex;

import java.time.Month;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class BuscarAniversariantes {
    public static void imprimirAniversariantes(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            int mesAniversario = funcionario.dataNascimento.getMonthValue();
            if (mesAniversario == 10 || mesAniversario == 12) {
                System.out.println(funcionario.nome + " faz aniversário em " + Month.of(mesAniversario));
            }
        }
    }
}


