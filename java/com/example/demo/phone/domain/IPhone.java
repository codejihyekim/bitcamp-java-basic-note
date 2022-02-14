package com.example.demo.phone.domain;

import com.example.demo.student.domain.CalcDTO;

/**
 * packageName: com.example.demo.phone.domain
 * fileName        : IPhone
 * author          : codejihyekim
 * date            : 2022-02-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         codejihyekim      최초 생성
 */
public class IPhone extends CelPhone {
    protected final static String KIND = "아이폰";
    protected String search;

    public IPhone(String company) {
        super(KIND, company,"이동중");
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s 에서 만든 %s을 사용해서 %s에 %s를 검색한다.",super.getCompany(),KIND,super.getMove(),search);
    }
}
