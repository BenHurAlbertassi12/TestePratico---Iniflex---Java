package desafio.programacao.iniflex;

import java.math.BigDecimal;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class BuscarTotalSalarios {
    public static void imprimirTotalSalarios(List<Funcionario> funcionarios) {
        BigDecimal totalSalarios = BigDecimal.ZERO;

        for (Funcionario funcionario : funcionarios) {
            totalSalarios = totalSalarios.add(funcionario.salario);
        }

        System.out.println("Total dos salários dos funcionários: " + totalSalarios);
    }
}
