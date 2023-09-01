import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import desafio.programacao.interfac.Funcionario;
import desafio.programacao.iniflex.AgruparFuncionarios;
import desafio.programacao.iniflex.AumentarSalarios;
import desafio.programacao.iniflex.BuscarAniversariantes;
import desafio.programacao.iniflex.BuscarMaiorIdade;
import desafio.programacao.iniflex.BuscarTotalSalarios;
import desafio.programacao.iniflex.CalcularSalariosMinimos;
import desafio.programacao.iniflex.ImprimirFuncionarios;
import desafio.programacao.iniflex.InserirFuncionarios;
import desafio.programacao.iniflex.RemoverFuncionario;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        InserirFuncionarios.inserir(funcionarios);
        RemoverFuncionario.remover(funcionarios, "João");
        AumentarSalarios.aplicarAumento(funcionarios, BigDecimal.valueOf(0.10));
        ImprimirFuncionarios.imprimir(funcionarios);       
        AgruparFuncionarios.imprimirAgrupadoPorFuncao(funcionarios);
        BuscarAniversariantes.imprimirAniversariantes(funcionarios);
        BuscarMaiorIdade.imprimirMaiorIdade(funcionarios);
        BuscarTotalSalarios.imprimirTotalSalarios(funcionarios);
        CalcularSalariosMinimos.imprimirSalariosMinimos(funcionarios);
    }   
}
