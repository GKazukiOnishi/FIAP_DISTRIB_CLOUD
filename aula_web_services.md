# Web Services
Interfaces que permitem a comunicação pela web, como um uso simples do navegador.  
Mais flexível do que com o CORBA. Requisições HTTP enviando arquivos leves e mais diretos ao ponto (GET, POST, PUT, DELETE).
* Aplicações, Segurança ...
* Serviços e WSDL
* SOAP
* URIs, XML, HTTP e outros protocolos
Semelhantemente ao Corba temos uma interface, mas também informamos a codificação, protocolo de comunicação etc.  
Hoje temos a Cloud Computing e Grid Computing, que utilizam como Middleware esses serviços Web.  

## Arquitetura Orientada a Serviços
Conjunto de princípios a partir dos quais vamos desenvolver os sistemas e trabalhar para que os sistemas se tornem um conjunto de web services e se comuniquem.  

### SOA - Service Oriented Architecture
* Practice - Aplicar melhores práticas do mercado
* Platform - Eficiência operacional
* People - Pessoas tomando decisões
* Process - Alinhar com operações de negócios
Construir a infraestrutura computacional como serviços (não apenas Web, mas principalmente eles).  
B2B - Integração de Empresa para empresa - Favorece muito a interoperabilidade entre as empresas diferentes.  
Hoje podemos sair conectando com serviços já feitos para montar coisas melhores elaboradas, com suporte, documentação etc.  
Exemplo de mashup (novo serviço que funciona através de outro conjunto de serviços conectados):
* Trivago - Utiliza serviços que disponibilizam hotéis à aplicação

### Grid Computing
Middleware para compartilhamento de recursos: arquivos, computadores, software, dados e sensores, em escala grande, possibilitando resolver problemas mais complexos e pesados.
* World Community Grid
* Física nuclear
* Física de partículas
* World Wide Telescope (informações de todo o espectro eletromagnético (óptico, raios X, radio) em várias áreas, todos os dias)
* ...
* Auxilia muito nas áres que precisam de forte capacidade de processamento
Temos vários organizações trabalhando com linguagens de programação diferentes, arquiteturas, aplicações etc., mas conectando usando esse Middleware.
* Dados são coletados e reunidos por meio de instrumentos científicos
* Grande quantidade de dados armazenadas em diferentes locais conectados
* Imensa quantidade de dados que são resumidas em visões mais simplificadas disponibilizadas aos usuários (não tem como deixar alguém baixar tudo via FTP)
> Ideia de super computador Virtual  

### Cloud Computing
Surge então a computação em núvem, porque não trazer essa computação toda para o mercado?  
Transformaram então a computação em uma commodity, um serviço público.  
* Uma estrutura de servidores conectados à internet que poderiam armazenar e fornecer poder de computação aos clientes (Salesforce, AWS foram uma das primeiras)
* Núvem - Conjunto de serviços de aplicações, armazenamento e computação baseados na internet, capazes de suportar as necessidades da maioria dos usuários.
> Passamos a ver o hardware como um software que usamos na internet  
* Uso de Cluster de Computadores para fornecer um único recurso de computação de alto desempenho
* Mesma ideia de Grid Computing, mas essa tende a ser considerada precursora
* Hoje temos várias empresas: AWS, Google, Microsoft, Oracle etc.
