package desafio.programacao.iniflex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class CalcularSalariosMinimos {
    public static void imprimirSalariosMinimos(List<Funcionario> funcionarios) {
        BigDecimal salarioMinimo = BigDecimal.valueOf(1212.00);

        System.out.println("Salários em termos de salários mínimos:");
        for (Funcionario funcionario : funcionarios) {
            BigDecimal salariosMinimos = funcionario.salario.divide(salarioMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(funcionario.nome + ": " + salariosMinimos + " salários mínimos");
        }
    }
}
