package SpringBoot.ToDo.Project.Models;

import javax.persistence.*;

@Entity
public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Mid;

    @Column(name = "Name")
    private String name;

    @Column(name = "Department")
    private String dept;

    @ManyToOne()
    private todo todo;

    public member() {
    }

    public member(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
