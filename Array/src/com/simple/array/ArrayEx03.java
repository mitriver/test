package com.simple.array;

public class ArrayEx03 {

    public static void main(String[] args) {

        // 정수 배열 초기화
        int[] scores = {10, 20, 50, 60, 78};

        for (int i : scores) {
            System.out.print(i + " ");
        } // ← 이 중괄호가 빠져 있었음

        System.out.println();

        // 문자열 배열 초기화
        String[] topping = {"버섯", "양파", "소시지", "베이컨", "토마토"};

        for (String str : topping) {
            System.out.print(" " + str);
        }

        // 문자열 배열로 다루기
        String str = "Hello Java!";

        System.out.println("\n" + str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));

        // 주민번호 문자열 처리
        String jumin = "051105-3255417";

        int year = 2000 + 5
                Integer.parseInt(jumin.substring(0, 2));

        System.out.println("\n" + jumin);
        System.out.println(jumin.substring(0, 5));
    }
}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	