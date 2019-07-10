package org.dimgo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        intArr[0][2] = 1;
        intArr[1][1] = 2;
        printArray(intArr);
        System.out.println();

        String[][] StringArr = new String[2][];
        StringArr[0] = new String[3];
        StringArr[1] = new String[2];

        StringArr[0][0] = "c";
        StringArr[0][1] = "java";
        StringArr[0][2] = "php";
        StringArr[1][0] = "c#";
        StringArr[1][1] = "python";
        printArray(StringArr);


        String[][] strArr2 = {
                {"c","java","php"},
                {"c#","python"}
        };
        String[][] strArr3 = {
                new String[] {"c","java","php"},
                new String[] {"c#","python"}
        };



    }

    private static void printArray(int[][] intArr) {
        //이중 포문 출력
        for(int i = 0; i<intArr.length;i++){

            for(int j = 0;j<intArr[i].length;j++){

                System.out.print(intArr[i][j] + "|");

            }
        }
        System.out.println();

        for(int[] arr : intArr){
            for(int value : arr){
                System.out.print(value + "|");
            }

        }
    }
    private static void printArray(String[][] intArr) {
        //이중 포문 출력
        for(int i = 0; i<intArr.length;i++){

            for(int j = 0;j<intArr[i].length;j++){

                System.out.print(intArr[i][j] + "|");

            }
        }
        System.out.println();
        for(String[] arr : intArr){
            for(String value : arr){
                System.out.print(value + "|");
            }

        }
    }

}
