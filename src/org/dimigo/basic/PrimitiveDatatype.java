package org.dimigo.basic;

public class PrimitiveDatatype {
    static boolean flag;
    public static void main(String[] args) {


        System.out.println(flag ? "참입니다!":"거짓입니다.");

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.printf("%c %c %c\n",c1,c2,c3);
        System.out.println('뷁');

        String name = "백종인";
        System.out.println("My name is " + name);

        //정수형

        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d %d %d %d\n",i1,i2,i3,i4);

        byte b1 = -128;

        byte b2 = 127;

        b1--;
        b2++;

        System.out.println(b1);
        System.out.println(b2);//최댓값과 최솟값이 바뀜

        // 정수의 범위

        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

        long l = 10000000000L;

        //실수형

        float f1 = 3.14f;
        double d1 = 3.14d;

        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890d;

        System.out.println(f2);
        System.out.println(d2);


        System.out.printf("%c, %d, %.2f, %s",'a',100,12.345,"백종인");


    }
}
