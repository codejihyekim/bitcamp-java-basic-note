package com.example.demo.phone.service;

import com.example.demo.phone.domain.CelPhone;
import com.example.demo.phone.domain.GelPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.phone.service
 * fileName        : PhoneServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-08
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         codejihyekim      최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void userPhone(Scanner scanner) {
        Phone phone = new Phone();


    }

    @Override
    public void userCelPhone(Scanner scanner) {
        CelPhone phone = new CelPhone();

    }

    @Override
    public void userIPhone(Scanner scanner) {
        IPhone phone = new IPhone();

    }

    @Override
    public void userGalPhone(Scanner scanner) {
        GelPhone phone = new GelPhone();

    }
}
