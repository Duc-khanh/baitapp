import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm của bạn");
//        int diemm ;
        int diemm = scanner.nextInt();

        switch (diemm){
            case 1:
                System.out.println("1 điểm");

                break;
            case 2:
                System.out.println("đi2ểm");

                break;
            case 3:
                System.out.println("3 điểm");
                break;
            default:

                System.out.println("o điêm");
                break;
        }


    }
}
