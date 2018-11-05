package nc.project.Emp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Виктор on 03.11.2018.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMongoRepositoryTest {
    @Autowired
    private EmployeeMongoRepository employeeMongoRepository;

    @Before
    public void setUp() throws Exception {

        Employee employee1 = new Employee(1,"Diman", 21);
        Employee employee2 = new Employee(2,"Gaydar", 21);
        Employee employee3 = new Employee(3,"Leshka", 47);
        this.employeeMongoRepository.save(employee1);
        this.employeeMongoRepository.save(employee2);
        this.employeeMongoRepository.save(employee3);
        assertNotNull(employee1.getId());
        assertNotNull(employee2.getId());
        assertNotNull(employee3.getId());
    }

    @Test
    public void testFetchData(){
        Employee employeeA = employeeMongoRepository.findByName("Diman");
        Employee employeeB = employeeMongoRepository.findByName("Leshka");
        System.out.println(employeeB);
    }
    /*@After
    public void tearDown() throws Exception {
        this.employeeMongoRepository.deleteAll();
    }*/


}
