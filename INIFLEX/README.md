### 1. Classes Pessoa e Funcionário

- Criei uma classe `Pessoa` com os atributos `nome` (String) e `dataNascimento` (LocalDate).
- Estendi a classe `Funcionário` a partir da classe `Pessoa`.
- Na classe `Funcionário`, adicionei os atributos `salario` (BigDecimal) e `funcao` (String).

O primeiro trecho de código define a classe Pessoas, que possui duas variáveis de instância: nome para armazenar o nome da pessoa e dataNascimento para armazenar a data de nascimento da pessoa. Essa classe possui um construtor que recebe o nome e a data de nascimento como parâmetros.

O segundo trecho de código define a classe Funcionario, que estende a classe Pessoas. Além das variáveis de instância da classe pai, Funcionario possui também salario para armazenar o salário do funcionário e funcao para armazenar a função dele na empresa. O construtor da classe Funcionario recebe informações como nome, data de nascimento, salário e função, e chama o construtor da classe pai usando super(nome, dataNascimento) para inicializar os dados da pessoa.

No geral, essas classes ajudam a modelar informações sobre pessoas e funcionários, sendo a classe Funcionario uma extensão da classe Pessoas, adicionando atributos específicos para funcionários.

### 2. Classe Principal

- Criei uma classe `Principal` para executar as ações solicitadas.
- Alterei o nome para `Main` por uma questão mais semantica

Esse trecho de código é o ponto central que lida com os requisitos, aplicando várias operações sobre a lista de funcionários.

1. Importações:
   - Várias importações estão sendo feitas para classes e pacotes, incluindo `Funcionario`, bem como várias classes relacionadas a operações específicas (como `AgruparFuncionarios`, `AumentarSalarios`, etc.).

2. Classe `Main`:
   - Esta é a classe principal que contém o método `main`, que é o ponto de entrada do programa.

3. Lista de Funcionários:
   - Uma lista chamada `funcionarios` do tipo `List<Funcionario>` é criada para armazenar objetos do tipo `Funcionario`.

4. Operações sobre a Lista de Funcionários:
     - `InserirFuncionarios.inserir(funcionarios);`: Insere funcionários na lista.
     - `RemoverFuncionario.remover(funcionarios, "João");`: Remove o funcionário de nome "João" da lista.
     - `AumentarSalarios.aplicarAumento(funcionarios, BigDecimal.valueOf(0.10));`: Aumenta os salários dos funcionários em 10%.
     - `ImprimirFuncionarios.imprimir(funcionarios);`: Imprime os detalhes dos funcionários.
     - `AgruparFuncionarios.imprimirAgrupadoPorFuncao(funcionarios);`: Agrupa e imprime os funcionários por função.
     - `BuscarAniversariantes.imprimirAniversariantes(funcionarios);`: Imprime os funcionários que fazem aniversario no mês 10 e 12.
     - `BuscarMaiorIdade.imprimirMaiorIdade(funcionarios);`: Imprime o funcionário mais idoso.
     - `BuscarTotalSalarios.imprimirTotalSalarios(funcionarios);`: Imprime o total de salários da lista.
     - `CalcularSalariosMinimos.imprimirSalariosMinimos(funcionarios);`: Calcula e imprime os salários mínimos dos funcionários.

### 3. Ações

3.1. Inserir Funcionários: 
- Inseri todos os funcionários na mesma ordem e informações da tabela.
- Completei os codigos Pessoas e Funcionario

---
Esse trecho de código em define uma classe chamada InserirFuncionarios no pacote desafio.programacao.iniflex. Essa classe contém um método estático chamado inserir, que é responsável por adicionar instâncias de funcionários a uma lista de funcionários.

- A classe `InserirFuncionarios`:

  - É responsável por adicionar funcionários pré-definidos à lista de funcionários passada como parâmetro.
  - Importa a classe Funcionario do pacote desafio.programacao.interfac para poder criar instâncias de funcionários.

- O método `inserir(List<Funcionario> funcionarios)`:

  - Aceita uma lista de funcionários como parâmetro.
  - Usa o método add da lista para adicionar várias instâncias de funcionários   predefinidos.
  -Cada funcionário é criado com um nome, data de nascimento, salário e função específicos.
---

3.2. Remover Funcionário:
- Removi o funcionário "João" da lista.
---

1. `public static void remover(List<Funcionario> funcionarios, String nome) {`
   - Aqui começa a definição do método `remover`. Ele é público, estático (pertence à classe, não à instância) e não retorna nenhum valor (`void`).
   - Ele recebe dois parâmetros: uma lista de objetos do tipo `Funcionario` chamada `funcionarios` e uma string chamada `nome`.

2. `Funcionario funcionarioParaRemover = null;`
   - Declaração de uma variável `funcionarioParaRemover` do tipo `Funcionario`, essa variável será usada para armazenar temporariamente o funcionário que deve ser removido.

3. `for (Funcionario funcionario : funcionarios) {`
   - Início de um loop que percorre cada objeto `funcionario` na lista `funcionarios`.
   - O tipo de dado dos elementos da lista é `Funcionario`.

4. `if (funcionario.nome.equals(nome)) {`
   - Verifica se o nome do `funcionario` atual é igual à string `nome` fornecida como argumento.
   - Se essa condição for verdadeira, significa que o funcionário a ser removido foi encontrado.

5. `funcionarioParaRemover = funcionario;`
   - Atribui o valor do `funcionario` atual à variável `funcionarioParaRemover`.
   - Isso marca o funcionário a ser removido.

6. `break;`
   - Sai do loop `for` assim que um funcionário correspondente for encontrado.
   - Isso economiza tempo, pois não é necessário continuar procurando após encontrar o funcionário.

7. `}`
   - Fim do loop `for-each`.

8. `if (funcionarioParaRemover != null) {`
   - Verifica se um funcionário foi marcado para remoção (ou seja, se a variável `funcionarioParaRemover` não é nula).

9. `funcionarios.remove(funcionarioParaRemover);`
   - Remove o funcionário marcado para remoção da lista `funcionarios`.

10. `System.out.println("Funcionário " + nome + " removido.");`
    - Exibe uma mensagem indicando que o funcionário com o nome especificado foi removido com sucesso.

11. `} else {`
    - Se nenhum funcionário correspondente foi encontrado...

12. `System.out.println("Funcionário " + nome + " não encontrado.");`
    - Exibe uma mensagem informando que o funcionário com o nome especificado não foi encontrado na lista.

13. `}`
    - Fim do bloco condicional.

---

3.3. Imprimir Funcionários:
- Imprimi todos os funcionários com informações formatadas, incluindo datas e valores numéricos.

---

1. `import java.text.NumberFormat;`
   - Importa a classe `NumberFormat` do pacote `java.text`. Essa classe é usada para formatar números, incluindo valores monetários.

2. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

3. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, data de nascimento, salário, etc.

4. `public class ImprimirFuncionarios {`
   - Começa a definição da classe `ImprimirFuncionarios`.

5. `public static void imprimir(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimir`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

6. `System.out.println("Lista de Funcionários:");`
   - Exibe uma mensagem indicando o início da impressão dos detalhes dos funcionários na saída padrão.

7. `NumberFormat numberFormat = NumberFormat.getNumberInstance();`
   - Cria uma instância de `NumberFormat` para formatação de números.

8. `numberFormat.setMinimumFractionDigits(2);`
   - Define o número mínimo de casas decimais a serem exibidas.

9. `numberFormat.setMaximumFractionDigits(2);`
   - Define o número máximo de casas decimais a serem exibidas.

10. `numberFormat.setGroupingUsed(true);`
    - Ativa o uso de separadores de milhar para tornar os números mais legíveis.

11. `for (Funcionario funcionario : funcionarios) {`
    - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

12. `System.out.println("Nome: " + funcionario.nome);`
    - Exibe o nome do funcionário.

13. `System.out.println("Data de Nascimento: " + funcionario.dataNascimento);`
    - Exibe a data de nascimento do funcionário. Nesse ponto, a data não está formatada.

14. `System.out.println("Salário: " + numberFormat.format(funcionario.salario));`
    - Exibe o salário do funcionário, formatando-o usando o `NumberFormat` configurado.

15. `System.out.println("Função: " + funcionario.funcao);`
    - Exibe a função do funcionário.

16. `System.out.println();`
    - Exibe uma linha em branco para separar as informações dos funcionários.

17. `}`
    - Fim do loop `for-each`.

18. `}`
    - Fim da definição do método `imprimir`.

19. `}`
    - Fim da definição da classe `ImprimirFuncionarios`.

Nesta versão atualizada da classe `ImprimirFuncionarios`, o salário do funcionário é formatado usando a classe `NumberFormat`, garantindo que seja exibido com o número correto de casas decimais e com os separadores de milhar adequados. A formatação do salário torna os valores mais legíveis e fáceis de entender.

---

3.4. Atualizar Salários:
- Apliquei um aumento de 10% nos salários de todos os funcionários.
---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.math.BigDecimal;`
   - Importa a classe `BigDecimal` do pacote `java.math`. Essa classe é usada para manipular números decimais de alta precisão.

3. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

4. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, salário, etc.

5. `public class AumentarSalarios {`
   - Começa a definição da classe `AumentarSalarios`.

6. `public static void aplicarAumento(List<Funcionario> funcionarios, BigDecimal aumentoPercentual) {`
   - Declaração do método `aplicarAumento`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetros uma lista de objetos do tipo `Funcionario` chamada `funcionarios` e um objeto `BigDecimal` chamado `aumentoPercentual`.

7. `for (Funcionario funcionario : funcionarios) {`
   - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

8. `BigDecimal novoSalario = funcionario.salario.multiply(BigDecimal.ONE.add(aumentoPercentual));`
   - Calcula o novo salário do funcionário. O cálculo é feito multiplicando o salário atual do funcionário pelo resultado da expressão `BigDecimal.ONE.add(aumentoPercentual)`, que representa o aumento percentual.

9. `funcionario.salario = novoSalario;`
   - Atribui o novo salário calculado ao atributo `salario` do objeto `funcionario`, atualizando assim o salário do funcionário.

10. `}`
    - Fim do loop `for-each`.

11. `}`
    - Fim da definição do método `aplicarAumento`.

Esta classe `AumentarSalarios` é responsável por aplicar um aumento percentual aos salários dos funcionários em uma lista de objetos `Funcionario`. O aumento é calculado para cada funcionário e o salário é atualizado de acordo.

---

3.5. Agrupar Funcionários por Função: / 3.6. Imprimir Funcionários Agrupados:
- Agrupei os funcionários por função usando um MAP.

---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.util.ArrayList;`
   - Importa a classe `ArrayList` do pacote `java.util`. Essa classe é usada para criar listas dinâmicas.

3. `import java.util.HashMap;`
   - Importa a classe `HashMap` do pacote `java.util`. Essa classe é usada para criar mapas (tabelas de hash).

4. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

5. `import java.util.Map;`
   - Importa a classe `Map` do pacote `java.util`. Essa classe é usada para manipular mapas.

6. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, salário, etc.

7. `public class AgruparFuncionarios {`
   - Começa a definição da classe `AgruparFuncionarios`.

8. `public static void imprimirAgrupadoPorFuncao(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimirAgrupadoPorFuncao`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

9. `Map<String, List<Funcionario>> funcionariosPorFuncao = new HashMap<>();`
   - Cria um mapa onde a chave é uma string representando a função e o valor é uma lista de objetos `Funcionario`. Esse mapa será usado para agrupar os funcionários por função.

10. `for (Funcionario funcionario : funcionarios) {`
    - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

11. `funcionariosPorFuncao.computeIfAbsent(funcionario.funcao, k -> new ArrayList<>()).add(funcionario);`
    - Utiliza o método `computeIfAbsent` para adicionar o `funcionario` à lista correspondente à função dele no mapa `funcionariosPorFuncao`. Se a chave da função ainda não existir no mapa, cria-se uma nova lista e adiciona o funcionário a ela.

12. `}`
    - Fim do loop `for-each`.

13. `System.out.println("Funcionários agrupados por função:");`
    - Exibe uma mensagem indicando o início da impressão dos funcionários agrupados por função na saída padrão.

14. `for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {`
    - Início de um loop `for-each` que percorre cada entrada do mapa `funcionariosPorFuncao`.

15. `String funcao = entry.getKey();`
    - Obtém a chave (a função) da entrada atual do mapa.

16. `List<Funcionario> funcionariosDaFuncao = entry.getValue();`
    - Obtém a lista de funcionários associada à chave (função) da entrada atual do mapa.

17. `System.out.println("Função: " + funcao);`
    - Exibe o nome da função.

18. `for (Funcionario funcionario : funcionariosDaFuncao) {`
    - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionariosDaFuncao`.

19. `System.out.println("   " + funcionario.nome);`
    - Exibe o nome do funcionário com um recuo (espaços) para alinhamento visual.

20. `}`
    - Fim do loop `for-each` interno.

21. `}`
    - Fim do loop `for-each` externo.

22. `}`
    - Fim da definição do método `imprimirAgrupadoPorFuncao`.

Esta classe `AgruparFuncionarios` é responsável por receber uma lista de objetos `Funcionario` e imprimir os funcionários agrupados por função, exibindo o nome de cada funcionário sob a respectiva função.

---

3.8. Aniversariantes:
- Imprimi os funcionários que fazem aniversário nos meses 10 e 12.

---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.time.Month;`
   - Importa a classe `Month` do pacote `java.time`. Essa classe é usada para representar meses do ano.

3. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

4. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, data de nascimento, etc.

5. `public class BuscarAniversariantes {`
   - Começa a definição da classe `BuscarAniversariantes`.

6. `public static void imprimirAniversariantes(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimirAniversariantes`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

7. `for (Funcionario funcionario : funcionarios) {`
   - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

8. `int mesAniversario = funcionario.dataNascimento.getMonthValue();`
   - Obtém o valor do mês de aniversário do funcionário usando o método `getMonthValue()` da propriedade `dataNascimento`.

9. `if (mesAniversario == 10 || mesAniversario == 12) {`
   - Verifica se o mês de aniversário é outubro (10) ou dezembro (12).

10. `System.out.println(funcionario.nome + " faz aniversário em " + Month.of(mesAniversario));`
    - Exibe o nome do funcionário e o mês de aniversário utilizando a enumeração `Month` para obter o nome do mês correspondente ao valor.

11. `}`
    - Fim do bloco condicional.

12. `}`
    - Fim do loop `for-each`.

13. `}`
    - Fim da definição do método `imprimirAniversariantes`.

Esta classe `BuscarAniversariantes` é responsável por receber uma lista de objetos `Funcionario` e imprimir os funcionários que fazem aniversário nos meses de outubro ou dezembro, indicando o nome do funcionário e o mês de aniversário.

---

3.9. Maior Idade:
- Imprimi o funcionário com a maior idade, exibindo nome e idade.

---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.time.LocalDate;`
   - Importa a classe `LocalDate` do pacote `java.time`. Essa classe é usada para trabalhar com datas.

3. `import java.time.Period;`
   - Importa a classe `Period` do pacote `java.time`. Essa classe é usada para calcular intervalos de tempo.

4. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

5. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, data de nascimento, etc.

6. `public class BuscarMaiorIdade {`
   - Começa a definição da classe `BuscarMaiorIdade`.

7. `public static void imprimirMaiorIdade(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimirMaiorIdade`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

8. `Funcionario funcionarioMaiorIdade = null;`
   - Declaração de uma variável do tipo `Funcionario` para armazenar o funcionário mais velho.

9. `int maiorIdade = 0;`
   - Declaração de uma variável inteira para armazenar a maior idade encontrada.

10. `for (Funcionario funcionario : funcionarios) {`
    - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

11. `int idade = calcularIdade(funcionario.dataNascimento);`
    - Calcula a idade do funcionário chamando o método `calcularIdade` passando a data de nascimento do funcionário.

12. `if (idade > maiorIdade) {`
    - Verifica se a idade do funcionário é maior que a maior idade atualmente registrada.

13. `maiorIdade = idade;`
    - Atualiza a maior idade com o valor da idade do funcionário atual.

14. `funcionarioMaiorIdade = funcionario;`
    - Atualiza o funcionário mais velho com o funcionário atual.

15. `}`
    - Fim do bloco condicional.

16. `}`
    - Fim do loop `for-each`.

17. `if (funcionarioMaiorIdade != null) {`
    - Verifica se o funcionário mais velho foi encontrado.

18. `System.out.println("Funcionário mais velho: " + funcionarioMaiorIdade.nome + ", Idade: " + maiorIdade);`
    - Exibe o nome do funcionário mais velho e a sua idade.

19. `}`
    - Fim do bloco condicional.

20. `}`

21. `private static int calcularIdade(LocalDate dataNascimento) {`
    - Declaração do método `calcularIdade`, que é privado e estático. Ele calcula a idade com base na data de nascimento.

22. `LocalDate dataAtual = LocalDate.now();`
    - Obtém a data atual.

23. `return Period.between(dataNascimento, dataAtual).getYears();`
    - Calcula o período (intervalo) entre a data de nascimento e a data atual e retorna a quantidade de anos desse período.

24. `}`
    - Fim da definição do método `calcularIdade`.

25. `}`
    - Fim da definição da classe `BuscarMaiorIdade`.

Esta classe `BuscarMaiorIdade` é responsável por receber uma lista de objetos `Funcionario` e imprimir o nome e a idade do funcionário mais velho na lista. Isso é feito calculando a idade com base na data de nascimento usando a classe `LocalDate` e `Period` do pacote `java.time`.

---


3.10. Ordem Alfabética:
- Imprimi a lista de funcionários em ordem alfabética.

---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.util.Collections;`
   - Importa a classe `Collections` do pacote `java.util`. Essa classe é usada para manipular coleções, como listas.

3. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

4. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, salário, etc.

5. `public class BuscarOrdemAlfabetica {`
   - Começa a definição da classe `BuscarOrdemAlfabetica`.

6. `public static void imprimirOrdemAlfabetica(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimirOrdemAlfabetica`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

7. `Collections.sort(funcionarios, (f1, f2) -> f1.nome.compareTo(f2.nome));`
   - Usa o método `sort` da classe `Collections` para ordenar a lista `funcionarios` em ordem alfabética com base nos nomes dos funcionários.
   - O método `compareTo` é usado para comparar os nomes dos funcionários e determinar a ordem.

8. `System.out.println("Lista de funcionários em ordem alfabética:");`
   - Exibe uma mensagem indicando o início da impressão dos funcionários em ordem alfabética na saída padrão.

9. `for (Funcionario funcionario : funcionarios) {`
   - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

10. `System.out.println(funcionario.nome);`
    - Exibe o nome do funcionário.

11. `}`
    - Fim do loop `for-each`.

12. `}`
    - Fim da definição do método `imprimirOrdemAlfabetica`.

Esta classe `BuscarOrdemAlfabetica` é responsável por receber uma lista de objetos `Funcionario` e imprimir os nomes dos funcionários em ordem alfabética. Ela utiliza o método `Collections.sort()` para ordenar a lista com base no nome dos funcionários.

---

3.11. Total de Salários:
- Imprimi o total dos salários dos funcionários.

---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.math.BigDecimal;`
   - Importa a classe `BigDecimal` do pacote `java.math`. Essa classe é usada para manipular números decimais de alta precisão.

3. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

4. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, salário, etc.

5. `public class BuscarTotalSalarios {`
   - Começa a definição da classe `BuscarTotalSalarios`.

6. `public static void imprimirTotalSalarios(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimirTotalSalarios`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

7. `BigDecimal totalSalarios = BigDecimal.ZERO;`
   - Cria um objeto `BigDecimal` com valor zero para armazenar o total dos salários dos funcionários.

8. `for (Funcionario funcionario : funcionarios) {`
   - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

9. `totalSalarios = totalSalarios.add(funcionario.salario);`
   - Adiciona o valor do salário do funcionário ao total de salários.

10. `}`
    - Fim do loop `for-each`.

11. `System.out.println("Total dos salários dos funcionários: " + totalSalarios);`
    - Exibe o total dos salários dos funcionários.

12. `}`
    - Fim da definição do método `imprimirTotalSalarios`.

Esta classe `BuscarTotalSalarios` é responsável por receber uma lista de objetos `Funcionario` e imprimir o total dos salários dos funcionários. Ela utiliza a classe `BigDecimal` para calcular o total com alta precisão e exibe o resultado na saída padrão.

---

3.12. Salários em Salários Mínimos:
- Calculei quantos salários mínimos cada funcionário ganha, considerando R$1212.00 como salário mínimo.

---

1. `package desafio.programacao.iniflex;`
   - Declaração do pacote ao qual a classe pertence.

2. `import java.math.BigDecimal;`
   - Importa a classe `BigDecimal` do pacote `java.math`. Essa classe é usada para manipular números decimais de alta precisão.

3. `import java.math.RoundingMode;`
   - Importa a classe `RoundingMode` do pacote `java.math`. Essa classe é usada para definir o modo de arredondamento de operações com `BigDecimal`.

4. `import java.util.List;`
   - Importa a classe `List` do pacote `java.util`. Essa classe é usada para manipular listas.

5. `import desafio.programacao.interfac.Funcionario;`
   - Importa a classe `Funcionario` do pacote `desafio.programacao.interfac`. Presumivelmente, essa classe representa a interface de um funcionário com propriedades como nome, salário, etc.

6. `public class CalcularSalariosMinimos {`
   - Começa a definição da classe `CalcularSalariosMinimos`.

7. `public static void imprimirSalariosMinimos(List<Funcionario> funcionarios) {`
   - Declaração do método `imprimirSalariosMinimos`, que é público, estático e não retorna valor (`void`).
   - O método recebe como parâmetro uma lista de objetos do tipo `Funcionario` chamada `funcionarios`.

8. `BigDecimal salarioMinimo = BigDecimal.valueOf(1212.00);`
   - Cria um objeto `BigDecimal` com o valor do salário mínimo.

9. `System.out.println("Salários em termos de salários mínimos:");`
   - Exibe uma mensagem indicando o início da impressão dos salários em termos de salários mínimos na saída padrão.

10. `for (Funcionario funcionario : funcionarios) {`
    - Início de um loop `for-each` que percorre cada objeto `funcionario` na lista `funcionarios`.

11. `BigDecimal salariosMinimos = funcionario.salario.divide(salarioMinimo, 2, RoundingMode.HALF_UP);`
    - Calcula quantos salários mínimos representa o salário do funcionário. A divisão é feita com precisão de 2 casas decimais e utilizando o modo de arredondamento `HALF_UP`.

12. `System.out.println(funcionario.nome + ": " + salariosMinimos + " salários mínimos");`
    - Exibe o nome do funcionário, seguido pelo valor calculado em termos de salários mínimos.

13. `}`
    - Fim do loop `for-each`.

14. `}`
    - Fim da definição do método `imprimirSalariosMinimos`.

Esta classe `CalcularSalariosMinimos` é responsável por receber uma lista de objetos `Funcionario` e imprimir os salários dos funcionários em termos de salários mínimos. Ela utiliza a classe `BigDecimal` para realizar a divisão com alta precisão e exibe os resultados na saída padrão. O arredondamento é feito de acordo com as regras especificadas pelo modo `RoundingMode.HALF_UP`.

---