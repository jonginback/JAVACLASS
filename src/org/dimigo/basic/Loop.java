package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1.for문

        int a;
        int b;
        for(a = 2;a<=9;a++){
            for(b = 1;b<=9;b++){
                System.out.printf("%d * %d = %d\t",a,b,a*b);
            }
            System.out.printf("\n");

        }
        //for - each문
        int [] arr = {1,2,3,4,5};
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int value : arr){
            System.out.println(value);
        }

        String[] BTS = {"슈가","제이홉","남준"};
        // for-each문 써서 멤버 출력
        for(String value : BTS){
            System.out.println(value);
        }

        //3.while,do ~ while
        Scanner scanner = new Scanner(System.in);
        int menu = 0;//지역변수는 초기화 해줘야 됌
        do{
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. 빅뱅");
            System.out.println("3. 걸스데이");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");


            menu = scanner.nextInt();

            //1.입력하면 "ITZY를 선택하셨네요"
            //2.입력하면 "빅뱅을 선택하셨네요"
            //2.입력하면 "걸스데이을 선택하셨네요"
            //2.입력하면 "Bye을 선택하셨네요"
            //2.없는 메뉴 입력 시 없는 메뉴네요"
            switch (menu){
                case 1:
                    System.out.println("ITZY를 선택하셨네요");break;
                case 2:
                    System.out.println("빅뱅을 선택하셨네요");break;
                case 3:
                    System.out.println("걸스데이를 선택하셨네요");break;
                case 9:
                    System.out.println("BYE~");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴에요");break;
            }


        }while(menu != 9);
    }
}
