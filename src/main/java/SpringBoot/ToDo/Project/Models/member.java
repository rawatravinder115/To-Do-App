package SpringBoot.ToDo.Project.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Mid;

    private String name;

    private 

}
