package SpringBoot.ToDo.Project.DataAccessLayer;

import SpringBoot.ToDo.Project.Models.member;
import SpringBoot.ToDo.Project.Models.todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface memberRepository extends JpaRepository<member,Integer> {

}
