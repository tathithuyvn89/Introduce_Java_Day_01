import java.util.Scanner;

public class Wee1_TH_05 {
    public static void main(String[] args) {
        System.out.println("Enter a Year : ");
        int year = new Scanner(System.in).nextInt();
        if (year%400==0){
            System.out.printf("%d is a leap year", year);
        } else if (year%100==0){
            System.out.printf("%d is Not leap year", year);
        } else if (year%4==0){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is Not leap year", year);
        }
    }
}

