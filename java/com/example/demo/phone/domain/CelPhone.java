package com.example.demo.phone.domain;

/**
 * packageName: com.example.demo.phone.domain
 * fileName        : CelPhone
 * author          : codejihyekim
 * date            : 2022-02-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         codejihyekim      최초 생성
 */
public class CelPhone extends Phone{

    private boolean portable;
    protected String move;

    public CelPhone(String kind,String company,String move){
        super(kind,company);
        this.move = move;
    }

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    @Override
    public String toString() {
        return String.format("%s 인 %s 제품을 사용해서 %S 라고 %s 통화한다.",super.getKind(),super.getCompany(),super.getCall(),move);
    }
}
