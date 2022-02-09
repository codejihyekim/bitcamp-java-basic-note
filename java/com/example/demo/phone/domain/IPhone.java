package com.example.demo.phone.domain;

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
public class IPhone extends CelPhone{
    private final static String KIND = "아이폰";
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "IPhone{" + KIND +
                "search='" + search + '\'' +
                '}';
    }
}
