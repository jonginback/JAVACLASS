package org.dimgo.oop2;

public class SingleTon {
    private  SingleTon(){

    }
private static SingleTon instance;


    public static SingleTon getInstance(){
        return instance;
    }
    public static synchronized SingleTon getInstance2() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}


