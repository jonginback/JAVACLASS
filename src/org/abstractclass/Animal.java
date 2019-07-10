package org.abstractclass;

public abstract class Animal {
    public void eat(){
        System.out.println("냠냠");
    }
    //추상메소드 : 자식클래스에서 반드시 오버라이딩해라
    public abstract void bark();
}
