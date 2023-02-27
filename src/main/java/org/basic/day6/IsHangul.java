package org.basic.day6;

public class IsHangul {
    public static void main(String[] args) {
        System.out.println(isHangul('하'));
    }
    public static boolean isHangul(char c) {
        return c > '가' && c < '힣';
    }
}
