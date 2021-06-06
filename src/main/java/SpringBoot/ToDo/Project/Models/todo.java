package SpringBoot.ToDo.Project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Column(name = "To Do ")
public class todo {

    @Id
    private int id;
    @Column(name = "Project")
    private String name;
    




}
