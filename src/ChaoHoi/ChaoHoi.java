package ChaoHoi;

import java.util.Scanner;

public class ChaoHoi {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Xin chào! Ai là người đang dùng máy? - ");
        char nguoiDung = scanner.next().charAt(0);
        // Process
        String loiChao;
        switch (nguoiDung){
            case 'B':
                loiChao = "Xin chào Ba";
                break;
            case 'M':
                loiChao = "Xin chào Mẹ";
                break;
            case 'A':
                loiChao = "Xin chào Anh trai";
                break;
            case 'E':
                loiChao = "Xin chào Em gái";
                break;
            default:
                loiChao = "Xin lỗi, tôi không thể giúp người lạ truy cập";
                break;
        }
        // Output
        System.out.println(loiChao);
    }
}
