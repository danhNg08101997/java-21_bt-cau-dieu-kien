package SapXepTuNhoDenLon;
import java.util.Scanner;

public class XepSoTuNhoDenLon {
    public static void main(String[] args) {
        // Code đầu vào
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số A: ");
        int soA = scanner.nextInt();

        System.out.println("Nhập vào số B: ");
        int soB = scanner.nextInt();

        System.out.println("Nhập vào số C: ");
        int soC = scanner.nextInt();

        // Code xử lý
        int temp;
        if(soA > soB) {
            temp = soA;
            soA = soB;
            soB = temp;
        }
        if(soA > soC) {
            temp = soA;
            soA = soC;
            soC = temp;
        }
        if(soB > soC) {
            temp = soB;
            soB = soC;
            soC = temp;
        }

        // Code đầu ra
        System.out.print("Các số tăng từ nhỏ đến lớn là: " + soA + " " + soB + " " + soC);
    }
}
