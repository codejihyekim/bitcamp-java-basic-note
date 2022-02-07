package com.example.demo.service;

/**
 * packageName: com.example.demo.service
 * fileName        : QuizServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] arr) {
        String s ="";
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        for (int i = 0; i< arr.length; i++) {
            if (i % 5 == 0) {s += "\n";}
            s += i +":"+arr[i]+"\t";
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        String s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요 예) 김진영, 힙, 그래프");
        String name = "김지혜";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                for (int j = 0; j < 4; j++) {
                    s += arr[i+j*5] +", ";
                    if(i == 17) {break;}
                }
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        String s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 000");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("queue")) {
                s += arr[i] +"를 담당한 사람: "+arr[i%5];
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예) 권혜민(3개), 조현국(3개)");

        int[] intArr = new int[5];

        String s = "";
        for (int i = 5; i < arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j< 5; j++) {
                if (a == j){
                    intArr[j]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            s += arr[i] +"("+intArr[i]+"), ";
        }
        System.out.println(s);
    }

    @Override
    public void quiz5(String[] arr) {
        String s = "";
        System.out.println("Q5. 입력한 과목의 인덱스를 출력하세요");
        for (int i = 0; i < arr.length;i++){
            if (arr[i].equals("queue")) {
                s += i;
            }
        }
        System.out.println(s);
    }
}
