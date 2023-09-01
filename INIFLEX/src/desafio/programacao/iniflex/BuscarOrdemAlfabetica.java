package desafio.programacao.iniflex;

import java.util.Collections;
import java.util.List;

import desafio.programacao.interfac.Funcionario;

public class BuscarOrdemAlfabetica {
    public static void imprimirOrdemAlfabetica(List<Funcionario> funcionarios) {
        Collections.sort(funcionarios, (f1, f2) -> f1.nome.compareTo(f2.nome));

        System.out.println("Lista de funcionários em ordem alfabética:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome);
        }
    }
}