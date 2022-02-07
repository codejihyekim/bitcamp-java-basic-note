package com.example.demo.controller;

import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : QuizController
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class QuizController {
    public static void main(String[] args) {

        String[] arr = {"김지혜","최은아","심민혜","하진희","권솔이",
                "bfs","stack","hash","greedy","heap",
                "dfs","graph","dp","binsearch","bruteforce",
                "sort","queue"};

        Scanner scanner = new Scanner(System.in);
        QuizService service = new QuizServiceImpl();

        while (true) {
            System.out.println("메뉴선택\n 0.Exit 1.quiz1 2.quiz2 3.quiz3 4.quiz4 5.quiz5");
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" : res = "1.quiz1";
                    service.quiz1(arr);break;
                case "2" : res = "2.quiz2";
                    service.quiz2(arr);break;
                case "3" : res = "3.quiz3";
                    service.quiz3(arr);break;
                case "4" : res = "4.quiz4";
                    service.quiz4(arr);break;
                case "5" : res = "5.quiz5";
                    service.quiz5(arr);break;
            }
        }
    }
}
