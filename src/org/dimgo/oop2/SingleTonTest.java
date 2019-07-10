package org.dimgo.oop2;

public class SingleTonTest {
    public static void main(String[] args) {
    //    SingleTone s = new SingleTone()
    //    SingleTon s = new SingleTon();
        System.out.println(SingleTon.getInstance2());
        System.out.println(SingleTon.getInstance2());
        System.out.println(SingleTon.getInstance2());
    }
}
