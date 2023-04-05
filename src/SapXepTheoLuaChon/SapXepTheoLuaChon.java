package SapXepTheoLuaChon;
import java.util.Scanner;

public class SapXepTheoLuaChon {
    public static void main(String[] args) {
        // Code đầu vào
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số A: ");
        int soA = scanner.nextInt();

        System.out.print("Nhập vào số B: ");
        int soB = scanner.nextInt();

        System.out.print("Nhập vào số C: ");
        int soC = scanner.nextInt();

        System.out.print("Nhập sự lựa chọn tăng hoặc giảm (1-tăng hoặc 2-giảm): ");
        int sapXep = scanner.nextInt();
        // Code xử lý
        int temp;
        switch (sapXep) {
            case 1:
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
                break;
            case 2:
                if(soA < soB) {
                    temp = soA;
                    soA = soB;
                    soB = temp;
                }
                if(soA < soC) {
                    temp = soA;
                    soA = soC;
                    soC = temp;
                }
                if(soB < soC) {
                    temp = soB;
                    soB = soC;
                    soC = temp;
                }
                break;
            default:
                System.out.println("Cần nhập đúng điều kiện để sắp xếp số");
                break;
        }
        // Code đầu ra
        System.out.println("Thứ tự của số nhập vào là: " + soA + " " + soB + " " + soC);
    }
}
