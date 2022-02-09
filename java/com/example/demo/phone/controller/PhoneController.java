package com.example.demo.phone.controller;

import com.example.demo.phone.domain.CelPhone;
import com.example.demo.phone.domain.GelPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;
import com.example.demo.phone.service.PhoneService;
import com.example.demo.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.phone.controller
 * fileName        : PhoneController
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class PhoneController {
    public void execute(Scanner scanner) {
        while (true) {
            System.out.println("0.Exit \n" +
                    "1.은닉화(Encapsulation) \n" +
                    "2.상속(Inheritance) \n" +
                    "3.추상화(Abstraction) \n" +
                    "4.다형성(Polymorphism)");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("POJO가 은닉화다");
                    break;
                case "2" :
                    System.out.println("extends가 상속이다.");
                    Phone phone = new Phone("금성전화기","금성전자");
                    CelPhone celPhone = new CelPhone("핸드폰","블랙베리","이동중에");
                    IPhone iPhone = new IPhone("애플");
                    GelPhone gelPhone = new GelPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴]");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit");return;
                        case "1":
                            phone.setCall("여보세요. ***입니다.");
                            phoneService.usePhone(phone);
                            break;
                        case "2":
                            celPhone.setCall("안녕하세요");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3":
                            iPhone.setSearch("뉴스");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4":
                            gelPhone.setPay("삼성페이");
                            phoneService.useGelPhone(gelPhone);
                            break;
                    }
                    break;
                case "3" :
                    System.out.println("추상화");

                    break;
                case "4" :
                    System.out.println("다형성");

                    break;
                default:
                    System.out.println("Wrong Number");break;
            }
        }
    }
}
