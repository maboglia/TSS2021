package relazioni;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import relazioni.entities.Book;
import relazioni.entities.Course;
import relazioni.entities.Page;
import relazioni.entities.Student;
import relazioni.repo.BookRepository;
import relazioni.repo.CourseRepository;
import relazioni.repo.PageRepository;
import relazioni.repo.StudentRepository;

@SpringBootApplication
public class Prj43SpringRelazioniDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj43SpringRelazioniDbApplication.class, args);
	}

	/* @OneToOne
	@Bean
	    public CommandLineRunner mappingDemo(UserRepo userRepository,
	                                         AddressRepo addressRepository) {
	        return args -> {

	            // create a user instance
	            User user = new User("John Doe", "john.doe@example.com", "1234abcd");

	            // create an address instance
	            Address address = new Address("Lake View 321", "Berlin", "Berlin",
	                    "95781", "DE");

	            // set child reference
	            address.setUser(user);

	            // set parent reference
	            user.setAddress(address);

	            // save the parent
	            // which will save the child (address) as well
	            userRepository.save(user);
	        };
	    }
*///fine
	
	

    @Bean
    public CommandLineRunner mappingDemo(StudentRepository studentRepository,
                                         CourseRepository courseRepository) {
        return args -> {

            // create a student
            Student student = new Student("John Doe", 15, "8th");

            // save the student
            studentRepository.save(student);

            // create three courses
            Course course1 = new Course("Machine Learning", "ML", 12, 1500);
            Course course2 = new Course("Database Systems", "DS", 8, 800);
            Course course3 = new Course("Web Basics", "WB", 10, 0);

            // save courses
            courseRepository.saveAll(Arrays.asList(course1, course2, course3));

            // add courses to the student
            student.getCourses().addAll(Arrays.asList(course1, course2, course3));

            // update the student
            studentRepository.save(student);
        };
    }	
    

    @Bean
    public CommandLineRunner mappingDemo2(BookRepository bookRepository,
                                         PageRepository pageRepository) {
        return args -> {

            // create a new book
            Book book = new Book("Java 101", "John Doe", "123456");

            // save the book
            bookRepository.save(book);

            // create and save new pages
            pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
            pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
            pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));
        };
    }
}
