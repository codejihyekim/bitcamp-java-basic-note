package com.example.demo;

import com.example.demo.phone.controller.PhoneController;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.student.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		StudentController studentController = new StudentController();
		PhoneController phoneController  = new PhoneController();
		QuizController quizController = new QuizController();

		while (true){
			System.out.println("0.Exit 1.Auth 2.폰 3.퀴즈 4.알고리즘");
			switch (scanner.next()){
				case "0":
					System.out.println("Exit");return;
				case "1":
					System.out.println("회원");
					studentController.execute(scanner);break;
				case "2":
					System.out.println("폰");
					phoneController.execute(scanner);break;
				case "3":
					System.out.println("퀴즈");
					quizController.execute(scanner);break;
				case "4":
					System.out.println("알고리즘");break;

				default:
					System.out.println(" Wrong Number ");break;
			}
		}
	}

}
