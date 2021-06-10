package SpringBoot.ToDo.Project.Models;

import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = " ")
public class todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tdid;

    @Column(name = "Project")
    private String name;

    @Lob
    @Column(name = "Description",columnDefinition = "text")
    private String desc;

//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate",nullable = false)
    private long createdDt;

//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UpdatedAt")
    @LastModifiedDate
    private long lastupdate;



    @Lob
    @Column(name = "Activity",columnDefinition = "text")
    private String Act;

    @Column(name = "Member")
    @JoinTable(name = "to_mem",
                joinColumns ={@JoinColumn(name ="todo_")},
                inverseJoinColumns = {@JoinColumn(name = "member")}
    )
    @OneToMany(cascade = { CascadeType.ALL})
    private List<member> member= new ArrayList<>();


    public todo() {
    }

    public todo(String name, String desc, long createdDt, long lastupdate, String act, List<SpringBoot.ToDo.Project.Models.member> member) {
        this.name = name;
        this.desc = desc;
        this.createdDt = createdDt;
        this.lastupdate = lastupdate;
        Act = act;
        this.member = member;
    }

    public todo(String name, String desc, long createdDt, long lastupdate, String act) {
        this.name = name;
        this.desc = desc;
        this.createdDt = createdDt;
        this.lastupdate = lastupdate;
        Act = act;
    }

    public int getId() {
        return tdid;
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


    public List<SpringBoot.ToDo.Project.Models.member> getMember() {
        return member;
    }

    public void setMember(List<SpringBoot.ToDo.Project.Models.member> member) {

//        for(member m : member){
//            member.add(m);
//        }
        this.member = member;
    }

    public void addmember(member m){
        member.add(m);
        member.setMember();
    }

    public void setCreatedDt(long createdDt) {
        this.createdDt = createdDt;
    }

    public void setLastupdate(long lastupdate) {
        this.lastupdate = lastupdate;
    }
}
