import java.util.Scanner;

public class Week1_TH_04 {
    public static void main(String[] args) {
        System.out.println("Nhap thang ma ban muon tinh so ngay");
        Scanner sr = new Scanner(System.in);
        int month = sr.nextInt();
        String daysIsMonth;
        switch (month){
            case 2:
                daysIsMonth = "28 days or 29 days";
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                daysIsMonth = "31 days";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                daysIsMonth = "30 days";
                break;
            default:
                daysIsMonth = "";
                break;
        }
        if (daysIsMonth!=""){
            System.out.printf("The month '%d' has '%s' days", month,daysIsMonth);
        } else {
            System.out.println("Invalid input");
        }
    }
}
