package org.dimgo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 타입 배열
        // int,float,double,char,boolean,byte,long
        int[] intArr = null;
        intArr = new int[5];
        int[] intArr2 = new int[] {1,2,3,4,5};

        printArray(intArr2);
        System.out.println();
        // double 타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = new double[5];
        printArray(doubleArr);
        System.out.println();
        // 참조형 타입 배열
        String[] strArr = new String[3];
        printArray(strArr);
        System.out.println();

        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "문진호";
        printArray(strArr);

        String[] strArr2 = new String[] {"ITZY","소녀시대","걸스데이"};
        printArray(strArr2);
        System.out.println();

        //Book 타입 배열 2개짜리 생성
        //Book 객체 생성 후 출력

        Book[] bookarr = new Book[]{new Book("수학의바이블","김재영",100),
                new Book("워드마스터","전유원",200)};



        printArray(bookarr);

        //배열 사용시 주의사항
        int[] intArr3 = null;
        System.out.println(intArr3.length);






    }

    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr){
            System.out.print(value + " | ");

        }

    }

    private static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value + " | ");


        }
    }
    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value + " | ");

        }
    }
    private static void printArray(Book[] bookarr) {
        for(Book value : bookarr){
            System.out.printf(value.toStirng());
        }
    }
}
