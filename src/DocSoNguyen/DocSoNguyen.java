package DocSoNguyen;
import java.util.Scanner;

public class DocSoNguyen {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số nguyên có 2 chữ số là: ");
        int soNguyen = scanner.nextInt();
        // Process
        int soHangChuc, soHangDV;
        soHangDV = soNguyen % 10;
        soHangChuc = (soNguyen-soHangDV)/10;

        String hangChuc = "", hangDV = "";
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
            case 5: hangDV = "lăm";
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
            case 1: hangChuc = "Mười ";
            break;
            case 2: hangChuc = "Hai mươi ";
            break;
            case 3: hangChuc = "Ba mươi ";
            break;
            case 4: hangChuc = "Bốn mươi ";
            break;
            case 5: hangChuc = "Năm mươi ";
            break;
            case 6: hangChuc = "Sáu mươi ";
            break;
            case 7: hangChuc = "Bảy mươi ";
            break;
            case 8: hangChuc = "Tám mươi ";
            break;
            case 9: hangChuc = "Chín mươi ";
            break;
        }
        // Output
        System.out.println("Số " + hangChuc + hangDV);
    }
}
