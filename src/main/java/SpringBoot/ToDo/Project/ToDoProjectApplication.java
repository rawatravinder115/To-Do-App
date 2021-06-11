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

		todo t1 = new todo("javascript","cool laguage",System.currentTimeMillis(),System.currentTimeMillis(),"just do simple test");
		todo t2= new todo("java","awesome thing",System.currentTimeMillis(),System.currentTimeMillis(),"simple test");




//		tRepository.save(t1);
//		tRepository.save(t2);

		member m1 = new member("ravinder","ice");
		member m2 = new member("yash","cs");
		member m3 = new member("rishu","robotics");

		m1.setTodo(t1);
		m2.setTodo(t2);
		m3.setTodo(t1);

		t1.getMember().add(m1);
		t1.getMember().add(m3);
		t2.getMember().add(m2);


//		mRepository.save(m1);
//		mRepository.save(m2);
//		mRepository.save(m3);


//		m1.setTodo(t1);
//		m2.setTodo(t2);

//		t1.setMember(Arrays.asList(m1,m2,m3));
//		t1.setMember(new member(m2));
//		t1.setMember(m3);
//
//		t2.setMember(Arrays.asList(m2,m3));
//		t2.setMember(m2);
//		t2.setMember(m3);
//
		mRepository.save(m1);
		mRepository.save(m2);
		mRepository.save(m3);
		tRepository.save(t1);
		tRepository.save(t2);



	}
}
