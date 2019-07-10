package org.dimgo.oop;
import java.util.Arrays;

public class ArrarysTest {
    public static void main(String[] args) {
        String[] src = {"서울","대전","경기도광주","부산"};

        System.out.println(Arrays.toString(src));

        //배열 복사
        Arrays.copyOf(src,src.length);
        String[]dest = Arrays.copyOf(src,src.length);
        System.out.println(Arrays.toString(dest));

        System.out.println(src == dest);
        System.out.println(Arrays.equals(src,dest));

        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //배열 검색
        System.out.println(Arrays.binarySearch(dest,"부산"));

    }
}
