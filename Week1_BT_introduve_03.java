import java.util.Scanner;

public class Week1_BT_introduve_03 {
    public static void main(String[] args) {
        double atVND = 23000.00;
        System.out.print("Xin hay nhap vao so tien USD ");
        double atUSD = new Scanner(System.in).nextDouble();
        System.out.printf("%f USD bang %f VND", atUSD,atUSD*atVND);
    }
}
