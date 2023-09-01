package desafio.programacao.iniflex;

import java.math.BigDecimal;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class AumentarSalarios {
    public static void aplicarAumento(List<Funcionario> funcionarios, BigDecimal aumentoPercentual) {
        for (Funcionario funcionario : funcionarios) {
            BigDecimal novoSalario = funcionario.salario.multiply(BigDecimal.ONE.add(aumentoPercentual));
            funcionario.salario = novoSalario;
        }
    }
}

