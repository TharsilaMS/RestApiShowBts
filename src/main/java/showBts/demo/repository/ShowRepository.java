package showBts.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import showBts.demo.model.Show;

public interface ShowRepository extends MongoRepository<Show, String> {
}
