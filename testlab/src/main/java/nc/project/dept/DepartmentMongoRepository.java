package nc.project.dept;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Виктор on 03.11.2018.
 */
public interface DepartmentMongoRepository extends MongoRepository<Department,Integer> {
}
