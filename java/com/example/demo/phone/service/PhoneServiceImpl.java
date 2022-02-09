package com.example.demo.phone.service;

import com.example.demo.phone.domain.CelPhone;
import com.example.demo.phone.domain.GelPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;

/**
 * packageName: com.example.demo.phone.service
 * fileName        : PhoneServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         codejihyekim      최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone celPhone ) {
        System.out.println(celPhone.toString());
    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());
    }

    @Override
    public void useGelPhone(GelPhone gelPhone) {
        System.out.println(gelPhone.toString());
    }

}
