package TimSoLonNhat;
import java.util.Scanner;

public class TimSoLonNhat {
    public static void main(String[] args) {
        // Code đầu vào
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên M: ");
        int soM = scanner.nextInt();

        System.out.println("Nhập vào số nguyên N: ");
        int soN = scanner.nextInt();

        // Code xử lý
        int max;
        max = soM;
        if(max < soN) {
            max = soN;
        }

        // Code đầu ra
        System.out.println("Số lớn nhất là: " + max);
    }
}

