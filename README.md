### Dependências projeto
* Spring Web
* Spring Validations
* Spring data JPA
* Spring Security
* Lombok
* PostgreSQL
* Swagger 3

Antes de trabalhar/executar no projeto

* Baixar plugin do lombok acessando `File/Setting`. Na nova janela use a pesquisa e busque pela palavra `plugins`. Na consulta de plugins digite `lombok`. No resultado da pesquisa clique em `Install`.

## Banco de dados

Para subir o docker do banco de dados basta acessar o diretório do projeto e executar o comando `docker-compose up`. Para usar o banco de dados desta maneira, o `docker` e o `docker compose` são uma dependência.
Também é possível subir uma instalação própria do banco de dados sem utilizar `docker`. Neste caso, observe as configurações de porta e nome do banco no arquivo de configuração `application.yml`.

### Acessando o Swagger
* http://localhost:8080/swagger-ui/index.html

### Usuário e senha
* usuário: teste
* senha: teste