package XuatTenVaNamSinh;

import java.util.Scanner;

public class TenVaNamSinh {
    public static void main(String[] args) {
        // Input
        final String TEXT_TEN_SV = "Nhập vào tên của sinh viên ";
        final String TEXT_NAM_SINH_SV = "Nhập vào năm sinh của sinh viên ";
        String tenSV1, tenSV2, tenSV3;
        int namSinhSV1, namSinhSV2, namSinhSV3, temp;
        String ketQua;

        Scanner scanner = new Scanner(System.in);
        System.out.print(TEXT_TEN_SV + "1: ");
        tenSV1 = scanner.nextLine();
        System.out.print(TEXT_NAM_SINH_SV + "1: ");
        namSinhSV1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(TEXT_TEN_SV + "2: ");
        tenSV2 = scanner.nextLine();
        System.out.print(TEXT_NAM_SINH_SV + "2: ");
        namSinhSV2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(TEXT_TEN_SV + "3: ");
        tenSV3 = scanner.nextLine();
        System.out.print(TEXT_NAM_SINH_SV + "3: ");
        namSinhSV3 = scanner.nextInt();
        // Process
        temp = namSinhSV1;
        if(namSinhSV1 > namSinhSV2 && namSinhSV1 > namSinhSV3){
            temp = namSinhSV1;
            ketQua = "Sinh viên " + tenSV1 + " sinh năm " + temp + " là sinh viên trẻ nhất";
        }else if (namSinhSV2 > namSinhSV1 && namSinhSV2 > namSinhSV3){
            temp = namSinhSV2;
            ketQua = "Sinh viên " + tenSV2 + " sinh năm " + temp + " là sinh viên trẻ nhất";
        }else if(namSinhSV3 > namSinhSV1 && namSinhSV3 > namSinhSV2){
            temp = namSinhSV3;
            ketQua = "Sinh viên " + tenSV3 + " sinh năm " + temp + " là sinh viên trẻ nhất";
        }else if(namSinhSV1 == namSinhSV2 && namSinhSV1 > namSinhSV3){
            temp = namSinhSV1;
            ketQua = "Sinh viên " + tenSV1 + " và " + tenSV2 + " sinh năm " + temp + " là sinh viên trẻ nhất";
        }else if (namSinhSV1 == namSinhSV3 && namSinhSV1 > namSinhSV2){
            temp = namSinhSV1;
            ketQua = "Sinh viên " + tenSV1 + " và " + tenSV3 + " sinh năm " + temp + " là sinh viên trẻ nhất";
        }else if(namSinhSV2 == namSinhSV3 && namSinhSV2 > namSinhSV1){
            temp = namSinhSV2;
            ketQua = "Sinh viên " + tenSV2 + " và " + tenSV3 + " sinh năm " + temp + " là sinh viên trẻ nhất";
        }else {
            temp = namSinhSV1;
            ketQua = "Cả 3 sinh viên đều sinh năm: " + temp;
        }
        // Output
        System.out.println(ketQua);
    }
}
