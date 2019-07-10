package org.dimgo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //Stirng
        String str = "디미고";
        str += "2학년 ";
        str += "4반 ";
        str += "백종인";




        //StringBuilder StringBuffer
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("4반 ").append("백종인 ");
        System.out.println(sb.toString());

        compareSpeed();


    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for(int i = 0;i<10000000;i++){
            sb.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
