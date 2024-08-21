# Aplicação ShowBts

A Aplicação ShowBts é um projeto Spring Boot que fornece uma API REST para gerenciar shows. A aplicação utiliza MongoDB para armazenamento de dados e inclui endpoints para criar e recuperar shows.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `showBts.controller`: Contém o controlador REST para lidar com solicitações HTTP relacionadas a shows.
- `showBts.model`: Contém o modelo de dados para shows.
- `showBts.repository`: Contém a interface do repositório para interagir com o banco de dados MongoDB.

## Componentes

### ShowController

Lida com solicitações HTTP para o endpoint `/api/shows`.

- `POST /api/shows`: Cria um novo show. Espera um payload JSON no corpo da solicitação.
- `GET /api/shows`: Recupera todos os shows do banco de dados.

```java
@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show savedShow = showRepository.save(show);
        return ResponseEntity.ok(savedShow);
    }

    @GetMapping
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}
Show
Representa o modelo de dados para um show.

@Setter
@Getter
@Document(collection = "shows")
public class Show {

    @Id
    private String id;
    private int show_id;
    private String location;
    private String date;
    private int available_tickets;
}
ShowRepository
Fornece métodos para interagir com o banco de dados MongoDB.

public interface ShowRepository extends MongoRepository<Show, String> {
}
Configuração
A aplicação está configurada para conectar-se ao MongoDB usando as seguintes propriedades:

spring.application.name=demo
spring.data.mongodb.uri=mongodb+srv://root:root@showsbts.uv537og.mongodb.net/showsbts?retryWrites=true&w=majority&appName=showBts
```
# Dependências
- Spring Boot
- MongoDB
- Lombok
