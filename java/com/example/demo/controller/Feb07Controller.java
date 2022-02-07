package com.example.demo.controller;

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;
import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;
import org.springframework.jmx.support.MBeanRegistrationSupport;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : Feb07Controller
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class Feb07Controller {
    /**
     * 1. 주사위 dice
     * 2. 가위바위보 Rps
     * 3. 입력하는 두 수 사이의 소수 구하기 getPrime
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear
     * 5. 임의로 입력받은 숫자 맞추기 numberGolf
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();

        while (true) {
            System.out.println("메뉴선택: 0.Exit 1.dice 2.Rps 3.getPrime 4.leapYear 5.numberGolf");
            String res = "";

            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("dice");
                    service.dice(scanner);
                    break;
                case "2" :
                    System.out.println("Rps");
                    service.rps(scanner);
                    break;
                case "3" :
                    System.out.println("두 수를 입력해주세요.");
                    service.getPrime(scanner.nextInt(),scanner.nextInt());
                    break;
                case "4" :
                    System.out.println("leapYear");
                    service.leapYear(scanner);
                    break;
                case "5" :
                    System.out.println("numberGolf");
                    res = service.numberGolf();
                    System.out.println(res);
                    break;
            }
        }
    }
}
