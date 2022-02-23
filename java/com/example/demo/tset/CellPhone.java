package com.example.demo.tset;

/**
 * packageName: com.example.demo.tset
 * fileName        : CellPhone
 * author          : codejihyekim
 * date            : 2022-02-23
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-23         codejihyekim      최초 생성
 */
public class CellPhone {
    String model;
    String color;

    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    void bell(){
        System.out.println("벨이 울립니다.");
    }
    void sendVoice(String message){
        System.out.println("자기: "+message);
    }
    void receiveVoice(String message){
        System.out.println("상대방: "+message);
    }
    void hangUP(){
        System.out.println("전화를 끊습니다.");
    }
}
