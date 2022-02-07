package com.example.demo.domain;

/**
 * packageName: com.example.demo.domain
 * fileName        : BmiDTO
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class BmiDTO {
    public static String WEBSITE = "BMI 구하기";
    private  String name;
    private  double height;
    private  double weight;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
