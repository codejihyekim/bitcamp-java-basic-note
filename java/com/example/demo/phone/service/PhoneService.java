package com.example.demo.phone.service;

import com.example.demo.phone.domain.CelPhone;
import com.example.demo.phone.domain.GelPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;

/**
 * packageName: com.example.demo.phone.service
 * fileName        : PhoneService
 * author          : codejihyekim
 * date            : 2022-02-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         codejihyekim      최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone );
    void useIPhone(IPhone iPhone);
    void useGelPhone(GelPhone gelPhone);
}
