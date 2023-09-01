package desafio.programacao.iniflex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import desafio.programacao.interfac.Funcionario;

public class AgruparFuncionarios {
    public static void imprimirAgrupadoPorFuncao(List<Funcionario> funcionarios) {
        Map<String, List<Funcionario>> funcionariosPorFuncao = new HashMap<>();

        for (Funcionario funcionario : funcionarios) {
            funcionariosPorFuncao.computeIfAbsent(funcionario.funcao, k -> new ArrayList<>()).add(funcionario);
        }

        System.out.println("Funcionários agrupados por função:");
        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {
            String funcao = entry.getKey();
            List<Funcionario> funcionariosDaFuncao = entry.getValue();
            
            System.out.println("Função: " + funcao);
            for (Funcionario funcionario : funcionariosDaFuncao) {
                System.out.println("   " + funcionario.nome);
            }
        }
    }
}

