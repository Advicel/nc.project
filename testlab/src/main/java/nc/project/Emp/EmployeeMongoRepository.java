package nc.project.Emp;

import nc.project.Emp.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Виктор on 03.11.2018.
 */
public interface EmployeeMongoRepository extends MongoRepository<Employee,Integer> {
    Employee findByName(String name);
    Employee findById(int id);
    Employee deleteById(int id);

}
