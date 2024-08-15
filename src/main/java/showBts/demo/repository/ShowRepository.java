package showBts.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import showBts.demo.model.Show;

@Repository
public interface ShowRepository extends MongoRepository<Show, Integer> {

}
