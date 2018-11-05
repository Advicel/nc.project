package nc.project.Time;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Виктор on 03.11.2018.
 */
public interface TimeMongoRepository extends MongoRepository<Time,Integer> {
    Time findById(int time);
}
