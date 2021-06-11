package SpringBoot.ToDo.Project.Models;

import javax.persistence.*;

@Entity
public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Mid;

    @Column(name = "Name")
    private String name;

    @Column(name = "Department")
    private String dept;

    @ManyToOne(fetch =FetchType.LAZY,cascade = CascadeType.ALL)
    private todo todo;

    public member() {
    }

    public member(String name, String dept, SpringBoot.ToDo.Project.Models.todo todo) {
        this.name = name;
        this.dept = dept;
        this.todo = todo;
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

    public SpringBoot.ToDo.Project.Models.todo getTodo() {
        return todo;
    }

    public void setTodo(SpringBoot.ToDo.Project.Models.todo todo) {
        this.todo = todo;
    }
}
