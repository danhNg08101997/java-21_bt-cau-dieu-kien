package DocSoNguyenBaChuSo;

import java.util.Scanner;

public class DocSoNguyenBaChuSo {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số nguyên có 3 chữ số là: ");
        int soNguyen = scanner.nextInt();
        // Process
        int soHangTram, soHangChuc, soHangDV;
        soHangDV = soNguyen % 10;
        soHangChuc = ((soNguyen % 100) - soHangDV)/10;
        soHangTram = (soNguyen - soHangChuc - soHangDV) / 100;

        String hangTram = "", hangChuc = "", hangDV = "";

        switch (soHangDV){
            case 1:
                if(soHangChuc == 1){
                    hangDV = "một";
                }else {
                    hangDV = "mốt";
                }
                break;
            case 2: hangDV = "hai";
                break;
            case 3: hangDV = "ba";
                break;
            case 4: hangDV = "bốn";
                break;
            case 5:
                if(soHangChuc == 0){
                    hangDV = "năm";
                }else {
                    hangDV = "lăm";
                }
                break;
            case 6: hangDV = "sáu";
                break;
            case 7: hangDV = "bảy";
                break;
            case 8: hangDV = "tám";
                break;
            case 9: hangDV = "chín";
                break;
        }
        switch (soHangChuc){
            case 0:
                if(soHangDV == 0){
                    hangChuc = "";
                }else {
                    hangChuc = "lẻ ";
                }
                break;
            case 1: hangChuc = "mười ";
                break;
            case 2: hangChuc = "hai mươi ";
                break;
            case 3: hangChuc = "ba mươi ";
                break;
            case 4: hangChuc = "bốn mươi ";
                break;
            case 5: hangChuc = "năm mươi ";
                break;
            case 6: hangChuc = "sáu mươi ";
                break;
            case 7: hangChuc = "bảy mươi ";
                break;
            case 8: hangChuc = "tám mươi ";
                break;
            case 9: hangChuc = "chín mươi ";
                break;
        }
        switch (soHangTram) {
            case 1: hangTram = "một trăm ";
            break;
            case 2: hangTram = "hai trăm ";
            break;
            case 3: hangTram = "ba trăm ";
            break;
            case 4: hangTram = "bốn trăm ";
            break;
            case 5: hangTram = "năm trăm ";
            break;
            case 6: hangTram = "sáu trăm ";
            break;
            case 7: hangTram = "bảy trăm ";
            break;
            case 8: hangTram = "tám trăm ";
            break;
            case 9: hangTram = "chín trăm ";
            break;
        }
        // Output
        System.out.println("Số " + hangTram + hangChuc + hangDV);
    }
}
