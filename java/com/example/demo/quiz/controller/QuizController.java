package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

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
    public void execute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();


        while (true) {
            System.out.println("[서브메뉴]\n 0)Exit 1)2월6일 2)2월7일 3)2월8일 4)2월10일");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    String[] arr = {"김지혜","최은아","심민혜","하진희","권솔이",
                            "bfs","stack","hash","greedy","heap",
                            "dfs","graph","dp","binsearch","bruteforce",
                            "sort","queue"};
                    System.out.println("[소메뉴]\n0.Exit \n1.팀별 과제 \n02.팀장이 맡은  \n3.큐를 담당한 사람 \n4.팀원별 과제 수");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("### 1.팀별 과제 ###");
                            feb06Service.quiz1(arr);break;
                        case "2":
                            System.out.println("### 2.팀장이 맡은 과제 ###");
                            feb06Service.quiz2(arr);break;
                        case "3" :
                            System.out.println("### 3.큐를 담당한 사람 ###");
                            feb06Service.quiz3(arr);break;
                        case "4":
                            System.out.println("### 4.팀원별 과제 수");
                            feb06Service.quiz4(arr);break;
                    }
                    break;
                case "2" :
                    System.out.println("[소메뉴]\n0.Exit \n1.dice \n02.rps  \n3.getPrime \n4.leapYear \n5.numberGolf");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("dice");
                            feb07Service.dice(scanner);break;
                        case "2":
                            System.out.println("숫자를 입력하세요.\n1.주먹 2.가위 3.보");
                            feb07Service.rps(scanner);break;
                        case "3":
                            System.out.println("getPrime");
                            feb07Service.getPrime(scanner);break;
                        case "4":
                            System.out.println("leapYear");
                            feb07Service.leapYear(scanner);break;
                        case "5":
                            System.out.println("숫자를 입력하세요");
                            feb07Service.numberGolf(scanner);break;
                    }
                    break;
                case "3":
                    System.out.println("[소메뉴]\n0.Exit \n1.lotto \n2.baseball  \n3.reservation \n4.bank \n5.gugudan");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("lotto");
                            feb08Service.lotto(scanner);
                            break;
                        case "2":
                            System.out.println("baseball");
                            feb08Service.baseball(scanner);
                            break;
                        case "3":
                            System.out.println("좌석예약시스템");
                            feb08Service.reservation(scanner);
                            break;
                        case "4":
                            System.out.println("bank");
                            feb08Service.bank(scanner);
                            break;
                        case "5":
                            System.out.println("gugudan");
                            feb08Service.gugudan(scanner);
                            break;
                    }
                    break;

                case "4" :
                    System.out.println("\n[소메뉴]\n0.Exit \n1.bubbleSort \n2.insertionSort  \n3.selectionSort \n4.quickSort \n5.mergeSort \n6.magicSquare \n7.zigzag \n8.rectangleStarPrint \n9.triangleStarPrint" );
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("bubbleSort");
                            feb10Service.bubbleSort();
                            break;
                        case "2":
                            System.out.println("insertionSort");
                            feb10Service.insertionSort();
                            break;
                        case "3":
                            System.out.println("selectionSort");
                            feb10Service.selectionSort();
                            break;
                        case "4":
                            System.out.println("quickSort");
                            int[] array = new int[10];
                            for (int i=0; i<array.length; i++) {
                                array[i]= (int)(Math.random()*100)+1;
                                for (int j=0; j<i; j++) {
                                    if (array[i]==array[j]) {
                                        i--; break;
                                    }
                                }
                            }
                            System.out.print("퀵 정렬 전 데이터 : ");
                            for (int i = 0; i < array.length; i++) {
                                System.out.print(array[i] + " ");
                            }
                            System.out.println();
                            array = feb10Service.quickSort(array, 0, array.length - 1);
                            System.out.print("퀵 정렬 후 데이터 : ");
                            for (int i = 0; i < array.length; i++) {
                                System.out.print(array[i] + " ");
                            }
                            break;

                        case "5":
                            System.out.println("mergeSort");
                            feb10Service.mergeSort();
                            break;
                        case "6":
                            System.out.println("magicSquare");
                            feb10Service.magicSquare();
                            break;
                        case "7":
                            System.out.println("zigzag ");
                            feb10Service.zigzag();
                            break;
                        case "8":
                            System.out.println("rectangleStarPrint ");
                            feb10Service.rectangleStarPrint(scanner);
                            break;
                        case "9":
                            System.out.println("triangleStarPrint ");
                            feb10Service.triangleStarPrint(scanner);
                            break;
                        default:
                            System.out.println("Wrong number");
                            break;
                    }
                    ;break;
                case "5" :
                    break;
                default:
                    System.out.println(" Wrong Number ");break;

            }
        }
    }
}
