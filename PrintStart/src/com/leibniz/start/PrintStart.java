package com.leibniz.start;

public class PrintStart {


    public static void printNormalStart() {
        int num = 10;
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = (num - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printCustomerStart(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = (num - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCustomerStart(5);
    }
}
