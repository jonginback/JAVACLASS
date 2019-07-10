package org.dimgo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr,10); //11,12,13,14,15
        printArray(intArr);

        String[] names = {"홍길동","홍길서","홍길남","홍길북"};
        changeName(names);
        printArray(names);
    }

    private static void changeName(String[] names) {
        for(int i = 0; i<names.length;i++){
            names[i] = "감" + names[i].substring(1);

        }
    }
    private static void printArray(String[] names){
        for(String value : names){
            System.out.print(value + "|");

        }


    }

    private static void printArray(int[] intArr) {
        for(int i = 0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }

    private static void add(int[] intArr, int k) {
        for(int i = 0;i<intArr.length;i++){
            intArr[i] = intArr[i]+k;
        }
    }

}

