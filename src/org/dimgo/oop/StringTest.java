package org.dimgo.oop;

public class StringTest {
    public static void main(String[] args) {
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        //new 객체 생성방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "야옹이");

        String id = null;
        //id가 admin 이면 관리자를 출력하고 아니면 곤리자 아님을 출력
        if("admin".equals(id)){
            System.out.println("관리자");
        }
        else {
            System.out.println("관리자 아님");

        }

        testString();

    }

    private static void testString() {
        //  01234567890123
        String s = "abcdefgABCDEFG";


        System.out.println(s.length());//14
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));//def// /가 하나씩 사이에 있다고 생각하자
        System.out.println(s.indexOf("C"));//C->9
        System.out.println(s.charAt(9));//9->C
        System.out.println(s.concat("ABC"));//뒤에 추가
        System.out.println("    ABC        ".trim());//[ABC]
        System.out.println(s.toUpperCase());//다 대문자
        System.out.println(s.toLowerCase());//다 소문자
        System.out.println(s.replace('a','A'));
        System.out.println(s.startsWith("abc"));//에비씨로 시작하면 트루 출력
        System.out.println(s.endsWith("FG"));


    }
}

