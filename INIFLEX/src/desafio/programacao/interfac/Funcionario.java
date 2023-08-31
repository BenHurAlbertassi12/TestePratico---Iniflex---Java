package desafio.programacao.interfac;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoas {
    public BigDecimal salario;
    public String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }
}
