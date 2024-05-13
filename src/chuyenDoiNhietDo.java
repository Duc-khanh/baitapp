import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("F to C");
            System.out.println("C to F");
            System.out.println("0. Thoat");
            System.out.println("Nhap vao day");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("Nhập độ F");
                    F = sc.nextDouble();
                    System.out.println("F to C: " + FtoC(F));
                    break;

                case 2:
                    System.out.println("Nhập độ C");
                    C = sc.nextDouble();
                    System.out.println("C to F: " + CtoF(C));
                    break;
                case 0:
                    System.exit(0);
            }

        }
        while (chon != 0);
    }

    public static double FtoC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static double CtoF(double C) {
        double F = (9.0 / 5) * (C + 32);
        return F;
    }
}