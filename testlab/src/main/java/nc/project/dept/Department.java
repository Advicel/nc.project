package nc.project.dept;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Виктор on 03.11.2018.
 */

@Document(collection = "Department")
public class Department {
    @Id
    private int id;
    private String dname;
    private String city;

    public Department(int id,String dname,String city){
        this.id = id;
        this.dname = dname;
        this.city = city;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getDname() {
        return dname;
    }

    public String getCity() {
        return city;
    }

    public String toString(){
        return "User{"+id+
                " , name = '" + dname + '\'' +
                ", Age = "+city +
                '}';
    }
}
