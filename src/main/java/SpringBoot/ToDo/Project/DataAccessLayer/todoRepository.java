package SpringBoot.ToDo.Project.DataAccessLayer;

import SpringBoot.ToDo.Project.Models.todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepository extends JpaRepository<todo, Integer> {

}
