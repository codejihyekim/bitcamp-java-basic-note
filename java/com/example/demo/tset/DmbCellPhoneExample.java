package com.example.demo.tset;

/**
 * packageName: com.example.demo.tset
 * fileName        : StrudentExample
 * author          : codejihyekim
 * date            : 2022-02-23
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-23         codejihyekim      최초 생성
 */
public class DmbCellPhoneExample {
  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

    System.out.println("모델: "+dmbCellPhone.model);
    System.out.println("색상: "+dmbCellPhone.color);
    System.out.println("채널: "+dmbCellPhone.channel);

    dmbCellPhone.powerOn();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("여보세요");
    dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
    dmbCellPhone.sendVoice("아! 반갑습니다. ");
    dmbCellPhone.hangUP();
    dmbCellPhone.turnONDmb();
    dmbCellPhone.changeChannelDmb(12);
    dmbCellPhone.turnOffDmb();
  }
}
