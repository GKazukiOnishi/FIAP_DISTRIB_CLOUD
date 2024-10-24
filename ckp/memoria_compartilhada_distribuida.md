# Checkpoint - Memória Compartilhada Distribuída
Professor: **Sérgio Ricardo Rota**.  
Alunos:
* **Gabriel Kazuki Onishi. RM 87182.**
* **Breno de Souza Silva. RM 88332.**
* **Felipe Otto da Silva. RM 89108.**
* **Pedro Martins Procopio Argentati. RM 88246.**
* **Rafael Tannous. RM 87486.**

## Questões
1. (4,0 pontos) A memória compartilhada permite que vários processos leiam e gravem dados do mesmo local (na mesma posição de memória). A passagem de mensagens é outra forma através da qual dois ou mais processos podem se comunicar, cada processo pode enviar/receber mensagens para/de outros processos. Sobre as características abaixo, assinale DSM para aquelas se aplicam à memória compartilhada e MSG para aquelas que se aplicam à passagem de mensagens.  
* (MSG) As variáveis precisam ser organizadas para serem compartilhadas. 
* (MSG) Alto custo computacional para a comunicação entre os processos. 
* (DSM) Os processos podem causar erros uns aos outros alterando, indevidamente, dados na memória. 
* (DSM) Baixo custo computacional para a comunicação entre os processos. 
* (MSG) Os processos são protegidos uns dos outros por estarem em execução em espaços de endereçamento privados. 
* (DSM) As variáveis são diretamente compartilhadas. 
* (DSM) Os processos podem ser executados de forma assíncrona. 
* (MSG) Os processos devem ser executados de forma síncrona.

2. (3,0 pontos) Considere que o movimento de entrada ou saída de uma palavra de 64 bits na interface de rede leve 20 ns (nanossegundo, 1x10^(-9) s) e que a rede opere a 10 Gbps (10^9 bit/s). Qual seria o atraso de um pacote de 256 bytes que está sendo enviado da origem para o destino se o tempo de cópia for ignorado? E se o tempo de cópia for considerado? 

3. (3,0 pontos) Além dos exemplos apresentados em aula, considerando-se aplicações práticas (que nós utilizamos no dia a dia) forneça: dois exemplos de algoritmo leitura simples / escrita simples (SRSW), dois exemplos de algoritmo leitura múltipla / escrita simples (MRSW) e dois exemplos de algoritmo leitura múltipla / escrita múltipla (MRMW).