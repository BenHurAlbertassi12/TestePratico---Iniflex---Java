import java.util.ArrayList;
import java.util.List;

import desafio.programacao.iniflex.ImprimirFuncionarios;
import desafio.programacao.iniflex.InserirFuncionarios;
import desafio.programacao.iniflex.RemoverFuncionario;
import desafio.programacao.interfac.Funcionario;

public class Main {
    public static void man(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        
        InserirFuncionarios.inserir(funcionarios);
        RemoverFuncionario.remover(funcionarios, "João");
        ImprimirFuncionarios.imprimir(funcionarios);


    }   
}
