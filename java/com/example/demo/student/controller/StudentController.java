package com.example.demo.student.controller;

import com.example.demo.student.domain.BmiDTO;
import com.example.demo.student.domain.CalcDTO;
import com.example.demo.student.domain.GoogleDTO;
import com.example.demo.student.domain.GradeDTO;
import com.example.demo.student.domain.UserDTO;
import com.example.demo.student.service.StudentService;
import com.example.demo.student.service.StudentServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : StudentController
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class StudentController {
    public void execute(Scanner scanner) {

        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        StudentService service = new StudentServiceImpl();

        while(true){
            System.out.println("메뉴 선택\n0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");
            String res = "";

            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");return;
                case "1" : res = "BMI";
                    System.out.println(BmiDTO.WEBSITE+"\n이름, 키, 몸무게 입력");
                    BmiDTO b = BmiDTO.getInstance();
                    b.getInstance().setName(scanner.next());
                    b.getInstance().setHeight(scanner.nextDouble());
                    b.getInstance().setWeight(scanner.nextDouble());
                    res = service.getBmi(b);
                    break;
                case "2" : res = "CALC";
                    System.out.println(CalcDTO.CALC_CAl+"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                    break;
                case "3" : res = "GOOGLE";
                    System.out.println(GoogleDTO.WESITE +"\n검색 입력");
                    google.setSearch(scanner.next());
                    res = service.google(google);
                    break;
                case "4" : res = "GRADE";
                    System.out.println(GradeDTO.GRADE_TITLE+"\n이름, 국어, 영어, 수학");
                    GradeDTO g = GradeDTO.getInstance();
                    g.getInstance().setName(scanner.next());
                    g.getInstance().setKor(scanner.nextInt());
                    g.getInstance().setEng(scanner.nextInt());
                    g.getInstance().setMath(scanner.nextInt());
                    res = service.getGrade(g);
                    break;
                case "5" : res = "LOGIN";
                    System.out.println(UserDTO.LOGIN_TITLE +"\n아이디, 비번, 이름");
                    UserDTO u = UserDTO.getInstance();
                    u.getInstance().setId(scanner.next());
                    u.getInstance().setPw(scanner.next());
                    u.getInstance().setName(scanner.next());
                    res = service.login(u);
                    break;
                default : res = " 1 ~ 5 으로 다시 입력해주세요";break;
            }
        /*
        if (select.equals("1")) {
            res = "BMI";
        } else if (select.equals("2")) {
            res = "CALC";
        } else if (select.equals("3")) {
            res = "SEARCH";
        } else if (select.equals("4")) {
            res = "GRADE";
        } else if (select.equals("5")) {
            res = "LOGIN";
        } else {
            res = " 1 ~ 5 으로 다시 입력해주세요";
        }*/
            System.out.println(res);
        }
    }
}
