package SpringBoot.ToDo.Project;

import SpringBoot.ToDo.Project.DataAccessLayer.memberRepository;
import SpringBoot.ToDo.Project.DataAccessLayer.todoRepository;
import SpringBoot.ToDo.Project.Models.member;
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

	@Autowired
	private memberRepository mRepository;

	@Autowired
	private todoRepository tRepository;

	@Override
	public void run(String... args) throws Exception {

		member m1 = new member("ravinder","ice");
		member m2 = new member("yash","cs");
		member m3 = new member("rishu","robotics");

		mRepository.save(m1);

		todo t1 = new todo("javascript","cool laguage",System.currentTimeMillis(),System.currentTimeMillis(),"just do simple test",Arrays.asList(m1,m2));
		todo t2= new todo("java","awesome thing",System.currentTimeMillis(),System.currentTimeMillis(),"simple test",Arrays.asList(m2,m3));





	}
}
