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
 *gugudan 수정
 */

 /** author       : 하진희 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] comNumbers = new int[6];
        int[] userNumbers = new int[6];
        int count = 0;

        System.out.println("1~45까지의 숫자 6개를 입력하세요.");
        for (int i=0; i<userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();   //스캐너로 사용자 선택 번호 6개 입력 받기
        }
        System.out.println("내가 선택한 번호");
        for (int i=0; i<userNumbers.length; i++){
            System.out.print("[" +userNumbers[i]+ "] ");
        }

        System.out.println("\n추첨번호");
        for (int i=0; i<comNumbers.length; i++) {   //랜덤함수 이용하여 1~45까지의 정수 중 6개 뽑기
            comNumbers[i] = (int)(Math.random()*45)+1;
            for (int j=0; j<i; j++){               //뽑은 6개 숫자 중 중복 숫자 제거
                if (comNumbers[i]==comNumbers[j]){
                    i--; break;
                }
            }
        }
        for (int i=0; i< comNumbers.length-1; i++){   //랜덤으로 뽑힌 숫자 오름차순으로 정렬
            for (int j=i+1; j< comNumbers.length; j++){
                if (comNumbers[i]>comNumbers[j]){
                    int temp = comNumbers[i];
                    comNumbers[i] = comNumbers[j];
                    comNumbers[j] = temp;
                }
            }
        }
        for (int i=0; i<comNumbers.length; i++){
            System.out.print("[" +comNumbers[i]+ "] ");
        }

        for (int i=0; i<6; i++) {         //내가 입력한 숫자와 컴퓨터가 랜덤으로 뽑은 숫자가 일치하면 count++
            for (int j=0; j<6; j++) {
                if (comNumbers[i]==userNumbers[j]) {
                    count++;
                }
            }
        }
        switch (count) {
            case 6:
                System.out.print(count+"개 맞았습니다. 1등에 당첨되었습니다.");
                break;
            case 5:
                System.out.print(count+"개 맞았습니다. 2등에 당첨되었습니다.");
                break;
            case 4:
                System.out.print(count+"개 맞았습니다. 3등에 당첨되었습니다.");
                break;
            default:
                System.out.print(count+"개 맞았습니다. 당첨되지 않았습니다."); break;
        }
    }
    /** author      : 최은아
     * 사용되는 숫자는 1에서 9까지 서로 다른 숫자이다.
     * 숫자는 맞지만 위치가 틀렸을 때는 볼.
     * 숫자와 위치가 전부 맞으면 스트라이크.
     * 숫자와 위치가 전부 틀리면 아웃.
     * 무엇이 볼이고 스트라이크인지는 알려주지 않는다.
     * 두 숫자가 중복되면 경우의 수가 많아지므로 중복 숫자는 사용하지 않는다.
     * 참고) https://velog.io/@suzu11/%EC%9E%90%EB%B0%94%EB%A1%9C-%EC%88%AB%EC%9E%90%EC%95%BC%EA%B5%AC-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
     * */
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
    /**
     * author      : 김지혜
     * 배열을 이용하여 좌석 10자를 만든다.
     * 좌석 번호를 for문으로 출력해준다. 이떄 좌석은 1부터 있도록 한다.
     * 순서대로 배열의 값을 출력한다.
     * 사용자가 값을 입력하고 값이 -1일 때는 종료한다.
     * 값이 배열의 값이 0일 경우 1로 바꾸면서 예약되었다고 출력한다.
     * 값이 1인 경우 이미 예약된 자리라고 출력한다.
     */
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
     /**
      * author : 심민혜
      * desc : 은행 입출금
      *
      * 목표 : 입금액과 출금액을 각각 기재 후 잔고가 출력되도록 한다.
      *
      * 계좌 입출금을 하기 위해 '돈을 입출금하는 사람'과
      * '그 돈이 입출금되는 은행 계좌' 두가지 클래스를 생성해야하는데
      * 2가지 클래스를 생성해 연결시키는 부분이 어려워 입출금 금액을 입력 후 잔고가 출력되는 방법으로 코딩했습니다.
      * (출처 : https://bmy1320.tistory.com/35
      *        https://a-legendary-xcom.tistory.com/3)
      * */
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
    /** author      : 권솔이
     ★구구단
     2~4단 5~9단을 두단으로 출력하는 책받침용 구구단이다.
     i는 줄이 바뀔때  6단 부터를 시작하기 위해  i값이 4증가라는 조건을 입력한다.
     j는 곱해지는 값이며 j가 0이t rue일때 ?단을 출력하고, false 일때 구구단 값을 출력한다.
     k는 2~5단을 나타내주기 위해 5번 반복하라는 조건을 준다.
     곱해지는 값이 9가 끝나면 줄을 바꾼다.
     ex)2~4단을 2까지만 두단으로 나타낸다고 가정해보자.
     i=2, i2<6, 2씩 증가
     j=0, 0<3, 1씩 증가
     k=0, k<2, 1씩 증가
     if(j==0) true (2+0)단을 출력한다.
     다시 내부 for문으로 돌아가 j=1,k=0 false값 (2+0)X1=(2+0)*1(탭)을 출력한다.
     j=1, k=1 false 값 (2+1)X1=(2+1)*1(탭)을 출력한다.
     j=1, k =2 조건에 불만족하여 for문을 빠져나온다.
     j=2, k=0 false 값 (2+0)X2=(2+0)*2(탭)
     J=2, K=1 false 값 (2+1)X2=(2+1)*2(탭)
     j=2, k=2로 조건에 불만족하여 for문을 빠져나온다.
     j=3으로 조건에 불만족하여 for 문을 줄을 바꾼 뒤 빠져나온다.
     i 값이 2 증가하여 i=4, j=0, k=0 이며 j==0 if 조건이 true이므로 (4+0)단을 출력한다.
     j=1,k=0 false 값 (4+0)X1=(4+0)*1(탭)을 출력한다.
     j=1,k=1 false 값 (4+1)X1=(4+1)*1(탭)을 출력한다.
     k=2로 조건에 불만족하여 for문을 빠져나온다.
     j=2,k=0 false 값 (4+0)X2=(4+0)*2(탭)을 출력한다.
     J=2,k=1 flase 값 (4+1)X2=(4+1)*2(탭)을 출력한다.
     k=2로 조건에 불만족하여 for문을 빠져나온다.
     i=6으로 조건에 불만족하여 줄바꿈을 한다. 끝.
     */
    @Override
    public void gugudan(Scanner scanner) {
        System.out.println("    ###구구단을 외워보자!###");
        for (int i = 2; i < 10; i+=4) {
            for (int j = 0; j < 10; j++) {
                for(int k = 0; k<4; k++){
                    if (j==0){
                        System.out.print(" "+(i+k)+"단\t");
                    }else {
                        System.out.print((i + k) + "X" + j + "=" + ((i + k) * j) + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
