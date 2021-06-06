package SpringBoot.ToDo.Project.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = " ")
public class todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Project")
    private String name;

    @Lob
    @Column(name = "Description",columnDefinition = "text")
    private String desc;

    @Lob
    @Column(name = "Activity",columnDefinition = "text")
    private String Act;

    @Column(name = "Member")
    private List<String> member= new ArrayList<>();


    public todo() {
    }

    public todo(String name, String desc, String act, List<String> member) {
        this.name = name;
        this.desc = desc;
        Act = act;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAct() {
        return Act;
    }

    public void setAct(String act) {
        Act = act;
    }

    public List<String> getMember() {
        return member;
    }

    public void setMember(List<String> member) {
        this.member = member;
    }
}
