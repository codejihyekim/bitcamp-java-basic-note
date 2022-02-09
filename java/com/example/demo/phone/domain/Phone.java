package com.example.demo.phone.domain;

import org.springframework.scheduling.support.SimpleTriggerContext;

/**
 * packageName: com.example.demo.phone.domain
 * fileName        : Phone
 * author          : codejihyekim
 * date            : 2022-02-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         codejihyekim      최초 생성
 */
public class Phone {
    private String kind;
    private String company;
    private String call;


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "집전화기{" +
                "kind='" + kind + '\'' +
                ", company='" + company + '\'' +
                ", call='" + call + '\'' +
                '}';
    }
}
