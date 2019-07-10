package org.Interfaces;
//인터페이스 하나의 표준/규약/명세
public interface IAnimal {
    //추상메소드만 선언 가능

    //field
    //상수처리 (public static final 자동 붙임)
    public static String  FARM_NAME = "디미 동물농장";


    default void eat(){
        System.out.println("냠냠");
    }
    void bark();
}
