# Arquiteturas Paralelas
Computação paralela e Computação distribuída são dois conceitos diferentes, mas que igualmente tentam processar algoritmos paralelamente, possuindo os mesmos problemas de balanceamento de carga, modularidade e tolerância falhas  

## Processamento Paralelo
Certas aplicações são divididas de tal forma que possam ser executadas paralelamente, cooperando entre si (com comunicação e sincronismo), sem seguir apenas um fluxo sequencia de instruções
* ILLIAC IV - Projeto de 1971-1981 de US$ 31 mi - Passo inicial para processamento paralelo
* Algoritmos complexos e que exigem cada vez mais processamento incentivando o uso de computação paralela
* Tecnologia VLSI - Possibilitou os microprocessadores de alto desempenho - Trouxe ganho significativo de processamento com uma melhor relação custo/desempenho se comparadas aos super computadores
    * SSI - Small Scale Integration - 10 Transistores
    * MSI - Medium Scale Integration - 100
    * LSI - Large ... - 1000
    * VLSI - Very Large ... - 10.000 - 100.000
    * ULSI - Ultra Large ... - 100.000 - 1.000.000
    * SLSI - Super Large ... - 1.000.000 - 10.000.000
* Desafio para o aumento de velocidade dos processadores: Restrições físicas (dissipação de calor)
    * Ciclo de Clock = Período de Clock = 1 / Taxa de Clock
    * Para isso surgiram os dissipadores térmicos e os ventiladores - Dissipadores de calor e Coolers
* É possível configurar agrupamentos de processadores em módulos, permitindo a expansão do sistema computacional com esses módulos

> Segundo Almasi e Gottlieb - Processador Paralelo é  
> "Coleção de elementos de processamento que se comunicam e cooperam entre si e resolvem um problema mais rapidamente"

## Questões Relacionadas
* Quantos elementos de processamento?
* Qual a potência de cada elemento?
* Qual tecnologia adotada?
* Qual a qtd de memória disp.?
* Como a memória está organizada?
* Todos os elementos de processamento são iguais?
* Como eles se comunicam?
* Como é feito o sincronismo entre as tarefas?
* Como dividir um problema em várias tarefas?
* Como organizar a execução paralela visando reduzir a comunicação e ter um bom balanceamento de carga de processamento?
* Quão mais rápido?
* Quais problemas são considerados?

### Paralelismo e Concorrência
Concorrência: Quando dois ou mais processos estão sendo executados por um processador ou mais.  
Paralelismo: Ideia de execução de mais de um processo no mesmo instante de tempo, implicando o paralelismo físico, ou seja, mais de um processador.
  
Quando temos um único processador e vários processos são executados, na verdade temos uma ilusão de paralelismo, conhecido como pseudoparalelismo ou paralelismo aparente. Isso porque o processador divide o tempo de execução entre cada processo muito rapidamente, dando a impressão de que tudo está sendo executado ao mesmo tempo.  
  
Temos três estilos de programação:
* Sequencial - Execução de tarefas uma após a outra
* Concorrente - Iniciação de várias tarefas sem que as anteriores tenham terminado (um ou mais processadores)
* Paralela - Iniciação e execução das tarefas em paralelo (múltiplos processadores)

### Granulação - Nível de paralelismo
A Carga de processamento submetidas aos processadores.
* Grossa - Paralelismo em termos de processos - Geralmente presente em plataformas com poucos processadores
* Fina - Paralelismo em termos de instruções ou operações - Implica em um grande número de processadores, frequentemente dedicados para operações específicas
* Média - Paralelismo em termos de threads - Intermediário comparado aos anteriores

### Speedup e Eficiência
Duas medidas para verificação da qualidade de algoritmos paralelos