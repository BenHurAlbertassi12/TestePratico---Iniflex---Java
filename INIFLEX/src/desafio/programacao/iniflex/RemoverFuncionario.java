package desafio.programacao.iniflex;

import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class RemoverFuncionario {
    public static void remover(List<Funcionario> funcionarios, String nome) {
        Funcionario funcionarioParaRemover = null;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equals(nome)) {
                funcionarioParaRemover = funcionario;
                break;
            }
        }

        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário " + nome + " removido.");
        } else {
            System.out.println("Funcionário " + nome + " não encontrado.");
        }
    }
}

