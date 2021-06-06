package SpringBoot.ToDo.Project;

import SpringBoot.ToDo.Project.DataAccessLayer.todoRepository;
import SpringBoot.ToDo.Project.Models.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ToDoProjectApplication implements CommandLineRunner {

	@Autowired
	private todoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		todo t = new todo("java","this is very great language","most amazing",""/*new ArrayList<String>(Arrays.asList("ravinder", "yash"*/)));
		todo t1=new todo("javascript","this is very cool language","pretty good",""/*new ArrayList<String>(Arrays.asList("yash"))*/);

		repository.save(t);
		repository.save(t1);

	}
}
