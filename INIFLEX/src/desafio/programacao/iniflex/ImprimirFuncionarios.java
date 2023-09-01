package desafio.programacao.iniflex;

import java.text.NumberFormat;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class ImprimirFuncionarios {
    public static void imprimir(List<Funcionario> funcionarios) {
        System.out.println("Lista de Funcionários:");

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(true);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.nome);
            System.out.println("Data de Nascimento: " + funcionario.dataNascimento);
            System.out.println("Salário: " + numberFormat.format(funcionario.salario));
            System.out.println("Função: " + funcionario.funcao);
            System.out.println();
        }
    }
}
