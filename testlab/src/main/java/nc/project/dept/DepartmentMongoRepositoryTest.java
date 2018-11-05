package nc.project.dept;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Виктор on 03.11.2018.
 */
public class DepartmentMongoRepositoryTest {
    @Autowired
    private DepartmentMongoRepository departmentMongoRepository;

    Department department1 = new Department(1,"Development","Samara");
    Department department2 = new Department(2,"Sales", "Moscow");
}
