package nc.project;

import nc.project.Emp.Employee;
import nc.project.Emp.EmployeeMongoRepository;
import nc.project.dept.Department;
import nc.project.dept.DepartmentMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller1 {
    private static List<Employee> employees =new ArrayList<Employee>();

    private DepartmentMongoRepository departmentMongoRepository;
    @Autowired
    private EmployeeMongoRepository employeeMongoRepository;
    /*static {
        employees.add(new Employee(4,"qwe",332));
    }*/
    @RequestMapping(value = {"/","index"},method = RequestMethod.GET)
    public String index(Model model){
        String message = " Hello";
        model.addAttribute("message",message);
        return "index";
    }
    @RequestMapping(value = {"/"},method = RequestMethod.GET)
    public String StartWindow(){
        return "Hello";
    }
    @RequestMapping(value = {"/EmployeeList"},method = RequestMethod.GET)
    public List<Employee> viewEmployeeList(Model model){
        return employeeMongoRepository.findAll();
    }
    @RequestMapping(value={"/DepartmentList"},method = RequestMethod.GET)
    public List<Department> viewDepartmentList(){
        return departmentMongoRepository.findAll();
    }
    @GetMapping("/EmployeeList/{id}")
    public Employee viewEmployee(@PathVariable int id) {
        return employeeMongoRepository.findById(id);

    }
    @PostMapping("/EmployeeList/create")
    public void postEmployee(@RequestBody Employee emp) {
        employeeMongoRepository.save(new Employee(emp.getId(),emp.getName(),emp.getAge()));
    }
    @PutMapping("/EmployeeList/changeName")
        public void changeName(@RequestBody Employee emp){
        Employee emp1 = employeeMongoRepository.findById(emp.getId());
        emp1.setAge(emp.getAge());
        emp1.setName(emp.getName());
        employeeMongoRepository.save(emp1);
    }

    @DeleteMapping("/EmployeeList/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeMongoRepository.deleteById(id);
    }
    @Autowired
    public void setDepartmentMongoRepository(DepartmentMongoRepository departmentMongoRepository) {
        this.departmentMongoRepository = departmentMongoRepository;
    }

    @Autowired
    public void setEmployeeMongoRepository(EmployeeMongoRepository employeeMongoRepository) {
        this.employeeMongoRepository = employeeMongoRepository;
    }
}