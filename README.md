# BILHETERIA DE CINEMA
### OBJETIVO :

* Composta por cinco endpoints responsáveis por listar ,
  salvar , alterar e deletar um filme específico com um determinado tipo de gênero e uma determinada produtora.

### TECNOLOGIAS :

* Java : versão 17
* Framework : Spring-boot versão 2.3.4
* SQL : Imagem docker desenvolvimento local para testes dos endpoints.

### Utilização da tecnologia no projeto:

* Desenvolvida em Java na versão 17,
  praticas de programação orientada
  a objetos , ultilizando o  spring boot como framework
  na versão 2.3.4 . Usando imagem do docker
  com postgresql como banco para desenvolvimento local
  e o Postman para realização de testes dos endpoints.

### Exemplo de requisição  para o endpoint de save Filme.

* Por meio da classe controller, no método POST o usuário
  poderá mandar um requisição através do método save( ) ,
  que faz a chamada do método da classe FilmeService. Após isso o método
  faz a verificação se o filme passado pelo usuário consta
  no banco de dados, se sim exibe uma mensagem reportando
  que o filme encontra-se cadastrado, caso contrario ele salva
  novo filme.

### Exemplo de resposta do endpoint de save filme.

* As respostas que pode ser obtida são :


  Status : 200 ok ( filme salvo com sucesso )

  Status : 500 internal Server Error 