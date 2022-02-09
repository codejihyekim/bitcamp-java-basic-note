package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb08ServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] comNumbers = new int[6];
        int[] userNumbers = new int[6];
        int count = 0;

        System.out.println("1~45까지의 숫자 6개를 입력하세요.");
        for (int i=0; i<userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("추첨번호");
        for (int i=0; i<comNumbers.length; i++) {
            comNumbers[i] = (int)(Math.random()*45)+1;
            System.out.print("[" +comNumbers[i]+ "] ");
        }

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (comNumbers[i]==userNumbers[j]) {
                    count++;
                }
            }
        }
        switch (count) {
            case 6:
                System.out.print(" 1등에 당첨되었습니다.");
                break;
            case 5:
                System.out.print(" 2등에 당첨되었습니다.");
                break;
            case 4:
                System.out.print(" 3등에 당첨되었습니다.");
                break;
            default:
                System.out.print(" 당첨되지 않았습니다."); break;
        }
    }
    @Override
    public void baseball(Scanner scanner) {
        int[] com = new int[3];
        int[] user = new int[3];
        int strike = 0;
        int ball = 0;
        int num = 0;
        boolean duplicate; // 컴퓨터 난수의 중복 여부 확인
        String s = "";
        // 컴퓨터 난수 생성
        for (int i = 0; i < 3; i++) {
            duplicate = true;
            while (duplicate) {
                num = (int)(Math.random() * 9) + 1;
                duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (com[j] == num) {
                        duplicate = true;
                        break;
                    }
                }
            }
            com[i] = num;
        }

        for (int chance = 1; chance <= 5; chance++) {
            strike = 0;
            ball = 0;
            s = "";

            if (chance == 5) {
                System.out.println("마지막 도전입니다.");
            } else {
                System.out.println(chance + "번째 도전입니다.");
            }

            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + "번째 수를 입력하세요 : (1 ~ 9 사이의 수) *단, 중복은 허용하지 않습니다.*");
                user[i] = scanner.nextInt();
            }

            if (user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) {
                System.out.println("중복된 숫자는 입력할 수 없습니다.");
                continue;
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            if (strike == 3) {
                System.out.println("정답입니다! 게임을 종료합니다.");
                break;
            } else if (strike == 0 && ball == 0) {
                s += "아웃입니다.";
            } else {
                s += strike + "S " + ball + "B 입니다.";
            }
            System.out.println(s);

            if (chance == 5) {
                String answer = "아쉬워요. 정답은 ";
                for (int i = 0; i < com.length; i++) {
                    answer += com[i] + " ";
                }
                answer += "입니다.";
                System.out.println(answer);
            }
        }
    }

    @Override
    public void reservation(Scanner scanner) {
        System.out.println("좌석예약시스템");
        final int size = 10;//좌석 10자리
        int[] seats = new int[size];

        while (true) {
            System.out.println("-----------------");
            for (int i = 0; i < size; i++) {
                System.out.print((i+1)+" ");//극장좌석번호 출력
            }
            System.out.println("\n-----------------");
            for (int i =0; i < size; i++) {
                System.out.print(seats[i]+" ");
            }
            System.out.println("\n-----------------");
            System.out.println("원하시는 좌석번호 입력(종료 -1): ");
            int s = scanner.nextInt();

            if (s == -1) {
                break;
            } else if (seats[s-1]==0){  //예약이 안된 경우 0으로 표기
                seats[s-1] = 1;         //예약된 좌석은 1로 바뀜
                System.out.println("예약되었습니다.");
            } else { //예약이 된 경우
                System.out.println("이미 예약 된 자리입니다.");
            }
        }
    }

    @Override
    public void bank(Scanner scanner) {
        int money;
        int totalmoney = 0;

        while (true) {

            System.out.println("1)입금 2)출금 3)잔고 4)종료");
            System.out.println("선택 : ");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("예금액 :");
                    money = scanner.nextInt();
                    totalmoney = totalmoney + money;
                    break;

                case 2:
                    System.out.print("출금액 :");
                    money = scanner.nextInt();
                    totalmoney = totalmoney - money;
                    break;

                case 3:
                    System.out.print("잔고액 :");
                    System.out.println(totalmoney);
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("다시 입력해주세요");
                    break;

            }
        }
    }

    @Override
    public void gugudan(Scanner scanner) {
        while (true) {
            System.out.println("단을 입력하세요.[종료 버튼:1]");
            int count = scanner.nextInt();
            if (count == 1) {
                break;
            }
            if (count > 9) {
                System.out.println("오류! 2~9까지 입력하세요");
                continue;
            }
            for (int i = 2; i < 10; i++) {
                if (count == i) {
                    System.out.println(count + "단");
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + "X" + j + "=" + i * j);
                    }
                }
            }
        }
    }

}
