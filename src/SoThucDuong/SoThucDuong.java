package SoThucDuong;

import java.util.Scanner;

public class SoThucDuong {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        double so1, so2, so3;
        System.out.print("Nhập vào số 1: ");
        so1 = scanner.nextDouble();
        System.out.print("Nhập vào số 2: ");
        so2 = scanner.nextDouble();
        System.out.print("Nhập vào số 3: ");
        so3 = scanner.nextDouble();
        // Process
        if(so1 < 0) {
            so1 = Math.abs(so1);
        }
        if(so2 < 0) {
            so2 = Math.abs(so2);
        }
        if(so3 < 0) {
            so3 = Math.abs(so3);
        }
        // OutPut
        System.out.printf("Kết quả: %f, %f, %f",so1,so2,so3);
    }
}
