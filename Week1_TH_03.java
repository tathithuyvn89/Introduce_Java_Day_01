import java.util.Scanner;

public class Week1_TH_03 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("a = ");
        a= sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();
        if (a!=0){
            double answer = (c-b)/a;
            System.out.printf("Phuong trinh co nghiem la %f!/n",answer);
        } else {
            if (b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }

    }
}
