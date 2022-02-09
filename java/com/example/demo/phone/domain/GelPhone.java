package com.example.demo.phone.domain;

/**
 * packageName: com.example.demo.phone.domain
 * fileName        : GelPhone
 * author          : codejihyekim
 * date            : 2022-02-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         codejihyekim      최초 생성
 * 삼성은 신형 폰은 절대 아이폰이 아니라고 했다.
 * 갤럭시라고 하고, 신형폰은 페이 기능을 지원한다고 했다.
 *
 */
public class GelPhone extends IPhone{
    public final static String KIND = "갤럭시";
    private String pay;

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "GelPhone{" + KIND +
                "pay='" + pay + '\'' +
                '}';
    }
}
