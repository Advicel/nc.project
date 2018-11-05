package nc.project.Emp;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Виктор on 03.11.2018.
 */
@Document(collection = "Emp")
public class Employee {
    @Id
    private int id;
    private String name;
    private int age;

    public Employee() {
        this.id=7;
        this.name="Andrey";
        this.age = 26;
    }


    public Employee(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
