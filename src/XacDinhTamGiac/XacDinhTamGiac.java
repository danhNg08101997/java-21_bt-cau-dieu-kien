package XacDinhTamGiac;

import java.util.Scanner;

public class XacDinhTamGiac {
    public static void main(String[] args) {
        // Input
        final String TEXT_CHUOI_1 = "Nhập số thứ nhất: ";
        final String TEXT_CHUOI_2 = "Nhập số thứ hai: ";
        final String TEXT_CHUOI_3 = "Nhập số thứ ba: ";
        final String TEXT_TAM_GIAC_DEU = "Tam giác đều";
        final String TEXT_TAM_GIAC_VUONG = "Tam giác vuông";
        final String TEXT_TAM_GIAC_CAN = "Tam giác cân";
        final String TEXT_TAM_GIAC_THUONG = "Tam giác thường";
        double canh1, canh2, canh3;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print(TEXT_CHUOI_1);
         canh1 = scanner.nextInt();
        System.out.print(TEXT_CHUOI_2);
         canh2 = scanner.nextInt();
        System.out.print(TEXT_CHUOI_3);
        canh3 = scanner.nextInt();
        // Process
        if(canh1 == canh2 && canh2 == canh3){
            ketQua = TEXT_TAM_GIAC_DEU;
        } else if(canh1 == canh2 || canh1 == canh3 || canh2 == canh3){
            ketQua = TEXT_TAM_GIAC_CAN;
        }else if (Math.pow(canh1,2) == Math.pow(canh2,2) + Math.pow(canh3,2)
                || Math.pow(canh2,2) == Math.pow(canh1,2) + Math.pow(canh3,2)
            || Math.pow(canh3,2) == Math.pow(canh1,2) + Math.pow(canh2,2)){
            ketQua = TEXT_TAM_GIAC_VUONG;
        }else {
            ketQua = TEXT_TAM_GIAC_THUONG;
        }
        // Output
        System.out.println(ketQua);
    }
}
