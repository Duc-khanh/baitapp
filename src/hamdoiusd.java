import java.util.Scanner;

public class hamdoiusd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập usd cần đổi");
        double usd = scanner.nextDouble();
        double vnd;
        vnd=  doiusd(usd);
        System.out.println(vnd);

    }
    public static double doiusd (double usd){
        return usd * 23000;
    }

}
