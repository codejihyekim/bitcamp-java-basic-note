package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName        : StudentServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class StudentServiceImpl implements StudentService{
    @Override
    public String getBmi(BmiDTO param) {
        String s = "";
        double bmi = param.getWeight() / (param.getHeight() * param.getHeight()* 10000);
        if (bmi < 18.5) {
            s = "저체중";
        } else if (bmi <22.9){
            s = "정상";
        } else if (bmi >= 23 && bmi <= 24.9) {
            s = "과체중";
        } else if (bmi >= 25 && bmi <= 29.9) {
            s = "경도 비만 (1단계 비만)";
        } else if (bmi >= 30 && bmi <= 34.9) {
            s = "중(重)도 비만 (2단계 비만)";
        } else {
            s = "고도 비만";
        }
        return s;
    }

    @Override
    public String calc(CalcDTO calc) {
        int result = 0;

        /*
        if(calc.getOpcode().equals("+")){
            result = calc.getNum1() + calc.getNum2();
        } else if(calc.getOpcode().equals("-")){
            result = calc.getNum1() - calc.getNum2();
        } else if(calc.getOpcode().equals("*")){
            result = calc.getNum1() * calc.getNum2();
        } else if(calc.getOpcode().equals("/")){
            result = calc.getNum1() / calc.getNum2();
        }
        */

        switch (calc.getOpcode()){
            case "+" : result = calc.getNum1() + calc.getNum2(); break;
            case "-" : result = calc.getNum1() - calc.getNum2(); break;
            case "*" : result = calc.getNum1() * calc.getNum2(); break;
            case "/" : result = calc.getNum1() / calc.getNum2(); break;
        }

        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(),result);
    }

    @Override
    public String google(GoogleDTO google) {
        return String.format("%s 을 검색한 결과입니다.",google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";
        return String.format(" * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점 \n" +
                        " * > 영어: %d점 \n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점 \n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",GradeDTO.GRADE_TITLE,grade.getName(),grade.getKor(),
                grade.getEng(),grade.getMath(),total,avg,pass);
    }

    @Override
    public String login(LoginDTO login) {
        /*
        String result = "";
        if(login.getPw().equals(login.PASSWORD)) {
            result = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getId(), login.getPw());
        } else {
            result = String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",login.getId(),login.getPw());
        }
         return result;
        */
        /*
        String result = "";
        switch (login.getPw()) {
            case "abc":
                result = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getName(), login.getPw());
                break;
            default:
                result = String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", login.getId(), login.getPw());
                break;
        }
        return result;
        */

        return (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getName(), login.getPw())
                : String.format(" %s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",login.getId(),login.getPw());
    }
}
