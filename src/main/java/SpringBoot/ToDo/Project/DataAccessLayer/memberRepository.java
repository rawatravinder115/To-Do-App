package SpringBoot.ToDo.Project.DataAccessLayer;

import SpringBoot.ToDo.Project.Models.member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<member,Integer> {
}
