package com.example.demo.phone.controller;

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

        PhoneService phoneService = new PhoneServiceImpl();
        while (true) {
            System.out.println("0.Exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("집전화");
                    phoneService.userPhone(scanner);
                    break;
                case "2" :
                    System.out.println("휴대폰");
                    phoneService.userCelPhone(scanner);
                    break;
                case "3" :
                    System.out.println("아이폰");
                    phoneService.userIPhone(scanner);
                    break;
                case "4" :
                    System.out.println("갤럭시노트");
                    phoneService.userGalPhone(scanner);
                    break;
                default:
                    System.out.println("Wrong Number");break;
            }
        }
    }
}
