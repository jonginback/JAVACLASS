package org.dimgo.oop;

public class ReferTest {
    public static void main(String[] args) {
        //wrapper 클래스 : 프리미티브 타입을 객체화시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);//인티저 범위 최솟값
        System.out.println(Integer.MAX_VALUE);//인티저 범위 최댓값
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));//2진수
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        //Boxing
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1.equals(i2));

        // valueOf
        Integer i3 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);

        //unboxing
        int r1 = i3.intValue();
        double r2 = d1.doubleValue();

        // 문자열 -> primitive date type - parsexx()
        int p1 = Integer.parseInt("200");
        double p2 = Double.parseDouble("3.14");

        System.out.println(args[0]);
        System.out.println(args[1]);


        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        System.out.println(x1 + x2);

        Integer a = new Integer(1000);
        Integer b = new Integer(2000);

        System.out.println(a+b);

        Integer c = 1000;
        int d = c + 2000;

        Integer obj1 = 10;// autoboxing(1)
        Integer obj2 = obj1 + 20;
        Integer result = obj1 + obj2;


    }
}
