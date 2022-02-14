package com.example.demo.student.domain;

/**
 * packageName: com.example.demo.domain
 * fileName        : GradeDTO
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class GradeDTO {
    public static String GRADE_TITLE = "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

    private final static GradeDTO gradeDTO = new GradeDTO();
    private GradeDTO(){}
    public static GradeDTO getInstance(){return gradeDTO;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public String toString(){
        return String.format("name %s kor %d eng %d math %d",name,kor,eng,math);
    }
}
