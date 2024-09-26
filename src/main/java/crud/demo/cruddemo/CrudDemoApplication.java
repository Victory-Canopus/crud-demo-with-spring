package crud.demo.crupdemo;

import crud.demo.crupdemo.entity.Student;
import crud.demo.crupdemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner->{
			createStudent(studentDAO);
			findStudent(studentDAO,1);
		};
	}

	private void findStudent(StudentDAO studentDAO, int i) {
		System.out.println("Found Student:"+studentDAO.read(i));
	}

	//inject DAO
	private void createStudent(StudentDAO studentDAO) {
		//creating student...
		Student student1=new Student("Draco","Malfoy","Draco@Malfoy");
		//saving student
		studentDAO.save(student1);
		//getting id of saved student
		System.out.println("Student Id: "+student1.getId());
		//creating student...
		Student student2=new Student("Hermoine","Granger","Hermoine@Granger");
		//saving student
		studentDAO.save(student2);
		//getting id of saved student
		System.out.println("Student Id: "+student2.getId());
		//creating student...
		Student student3=new Student("Ron","Weasly","Ron@Weasly");
		//saving student
		studentDAO.save(student3);
		//getting id of saved student
		System.out.println("Student Id: "+student3.getId());
	}

}
