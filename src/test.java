import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tháng bạn muốn hiển thị");
        int thang = scanner.nextInt();
        String sothang = "";
        switch (thang){
            case 1:
                sothang= "thang 1";
                break;
            case 2:
                sothang =" tháng  2";
                break;
            default:
                sothang ="số tháng không hợp lệ";
                break;

        }
        System.out.println(sothang);
    }
}
