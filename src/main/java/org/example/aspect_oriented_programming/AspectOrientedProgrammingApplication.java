package org.example.aspect_oriented_programming;

import org.example.aspect_oriented_programming.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectOrientedProgrammingApplication implements CommandLineRunner {

	@Autowired
	Model model;

	public static void main(String[] args) {
		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		model.letMeDoIt("Example 1", 1024);
		try {
			model.letMeDoItWithException("Example", 0);
		} catch (IllegalAccessException e) {

		}
		model.letMeDoItWithException("Example", 1024);
	}
}
