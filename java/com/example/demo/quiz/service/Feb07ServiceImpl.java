package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName        : Feb07ServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void dice(Scanner scanner) {
        int count = 1;
        while (true) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            System.out.println(count + "번째 시도" + "\n첫번째 주사위:" + a + "\n두번째 주사위:" + b);
            count++;
            if (a == b) {
                break;
            }
        }
    }
    @Override
    public void rps(Scanner scanner) {
        Random random = new Random();
        int com = random.nextInt(3)+1;
        int user = scanner.nextInt();
        int score = user-com;
        String[] str = { "", "주먹", "가위", "보"};
        String res = "";

        if(user>3){
            System.out.println("1~3까지의 숫자를 입력해주세요."); return;
        }else {
            if(score==0){
                res = "무승부입니다.";
            }else if(score==-1 || score==2){
                res = "이겼습니다.";
            }else {
                res = "졌습니다.";}
        }System.out.println("컴퓨터:" +str[com]+ " 유저:" +str[user]+ "\n" +res);
    }

    @Override
    public void getPrime(int num1, int num2) {
/**
 * 소수란? 약수가 1과 자기 자신뿐인 수 (1과 자기 자신만으로만 나누어지는 수)
 * # 방법 1.
 * 입력받은 수(num1) ~ 입력받은 수(num2)까지 하나라도 나누어 떨어지는가를 확인하는 작업을 반복한다.
 * 2부터 (입력받은 수 -1)까지 자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아니다.
 * 소수이면 flag = true, 소수가 아니면 flag = false
 * 소수 (flag == true) 이면 출력한다.
 * 단점 : 연산 수가 많아 오래 걸림
 * */
        System.out.println("# 방법 1.");
        String s = "";
        for (int i = num1; i <= num2; i++) {
            boolean flag = true;
            if (i == 1) {
                flag = false;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                s += i + " ";
            }
        }
        System.out.println(s);
    }

    @Override
    public void leapYear(Scanner scanner) {
        /**
         * 목표 : 특정 연도(Year)를 입력 받아 해당 연도가 윤년인지 평년인지 판별
         * 윤년이란 2월을 29일로 둬 4년 마다 1번씩 돌아오는 해이다. (4로 나눠 떨어지는 해는 윤년, 그밖의 해는 평년으로한다)
         *
         * [규칙]
         * 1. 4의 배수인 해는 윤년으로 한다.
         * 2. 100의 배수인 해는 윤년으로 하지 않는다.(=평년)
         * 3. 하지만 400의 배수인 해는 윤년으로 한다.
         *
         * [윤년 및 평년 구하는 조건]
         * 1. 연도가 4로 나누어 떨어지면 윤년 (year % 4 == 0)
         *      ex) 2020년, 2024년, 2028년, ...
         * 2. 1의 조건을 만족 하는 것 중, 연도가 100으로 나누어 떨어지면 평년  (year % 100 == 0)
         *      ex) 2100년, 2200년, 2300년, ...
         * 3. 2의 조건을 만족 하는 것 중, 400으로 나누어 떨어지면 윤년 (year % 400 == 0)
         *      ex) 2000년, 2400년, 2800년, ...
         *
         * [구하는 방법]
         * 1. if-else loop를 사용하여 조건이 참인 경우 윤년, 거짓인 경우에는 평년이라는 문구를 출력하도록한다.
         * (참고) && 는 and의 연산자, ||는 or의 연산자이다.
         *    (&&는 &&를 기준으로 좌항과 우항이 참이 되어야 출력이 가능하다.
         *    ||은 ||은 기준으로 좌항과 우항 중 하나라도 참이면 전체가 참이 되어 값이 출력된다.)
         * 2. 윤년 및 평년 구하는 조건을 토대로 다음에 부합하는 if-else loop를 생성한다.
         * [년도를 4로 나눈 나머지가 0]이면서(and),[년도를 100으로 나눈 것이 0이 아니거나][400으로 나눈 나머지가 0인것]
         * [기본값] = 평년
         *
         * */
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("연도를 입력하시오 : ");
        int year = scanner1.nextInt();
        if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println(year + " 년은 윤년입니다.");
        } else {
            System.out.println(year + " 년은 평년입니다.");
        }
    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("숫자 맞추기");
        int answer = (int) (Math.random() * 100) + 1;
        int count = 0;

        String s = "";
        while (true) {
            count++;

            System.out.println("1과 100 사이의 값을 입력하세요: ");
            int input = scanner.nextInt();

            if (input == answer) {
                System.out.println("정답입니다." + count  + "번째 만에 맞히셨습니다.");
                break;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
