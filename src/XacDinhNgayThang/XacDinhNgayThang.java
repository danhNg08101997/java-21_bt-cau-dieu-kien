package XacDinhNgayThang;

import java.util.Scanner;

public class XacDinhNgayThang {
    public static void main(String[] args) {
        // Input
        final String NHAP_THANG = "Vui lòng nhập tháng vào đây: ";
        final String NHAP_NAM = "Vui lòng nhập năm vào đây: ";
        final String TEXT_31_NGAY = " có 31 ngày";
        final String TEXT_30_NGAY = " có 30 ngày";
        final String TEXT_29_NGAY = " có 29 ngày";
        final String TEXT_28_NGAY = " có 28 ngày";
        final String TEXT_THANG_KHONG_HOP_LE = "Tháng không hợp lệ";
        int thang, nam;
        String ketQua;

        Scanner scanner = new Scanner(System.in);

        System.out.print(NHAP_THANG);
        thang = scanner.nextInt();

        // Process
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ketQua = "Tháng " + thang + TEXT_31_NGAY;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ketQua = "Tháng " + thang + TEXT_30_NGAY;
                break;
            case 2:
                System.out.print(NHAP_NAM);
                nam = scanner.nextInt();
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                    ketQua = "Tháng " + thang + TEXT_29_NGAY;
                }else {
                    ketQua = "Tháng " + thang + TEXT_28_NGAY;
                }
                break;
            default: ketQua = TEXT_THANG_KHONG_HOP_LE;
            break;
        }
        // Output
        System.out.println(ketQua);
    }
}
