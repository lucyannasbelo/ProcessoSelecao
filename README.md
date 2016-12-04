# ProcessoSelecao
Feito apenas para o processo de seleção da Samba Tech.

## Estrutura do projeto

O projeto foi dividido em pastas e pacotes. Os pacotes da pasta principal foram divididos em: *common* (São as classes comuns a todo o projeto), *pages* (São as classes para mapeamento das funções das páginas do site que serão testadas) e *util* (São classes de auxilio de criação de teste). Os pacotes da pasta de teste foram divididos em: *test* (São as classes dos testes em si) e *test.suite* (Classes para executar mais de um teste seguindo uma certa ordem)

## O que foi feito

* Os locators foram mapeados, assim como a maior parte do que é *string* e não é alterado durante a execução do sistema, em uma classe de constantes, para ter a facilidade de alterar as informações em um único local caso algo seja alterado no *HTML* do sistema;
* As páginas foram mapeadas no pacote *pages*, cada página terá seu próprio mapeamento, de acordo com a ação que será executada, assim como as classes de teste, pois cada página terá o seu teste de acordo com o que precisa executar;
* Os métodos do *Selenium* foram colocados na classe *util.java* para facilitar na escrita do código, visto que nas classes de mapeamento das páginas utiliza-os a todo momento, assim para não duplicar código, foram criados métodos com junções do que precisa verificar e executar;

## Testes criados de acordo com alguns dos erros encontrados

* Falha no login;
* Login feito com sucesso;
* Acesso as informações do projeto/usuário;
* Upload de arquivo com o máximo permitido;
* Ativar conteúdo pelos dropdowns.


