import java.util.Scanner;

public class Week1_BT_introduce_02 {
    public static String find (int x) {
        String a ="";
        switch (x) {
            case 0:
                a = "";
                break;
            case 1:
                a = "One";
                break;

            case 2:
                a = "Twen";
                break;
            case 3:
                a = "Thrir";
                break;
            case 4:
                a = "Four";
                break;
            case 5:
                a = "Five";
                break;
            case 6:
                a = "Six";
                break;
            case 7:
                a = "Seven";
                break;
            case 8:
                a = "Eigh";
                break;
            case 9:
                a = "Nigh";
                break;
        }
        return a;
    }
        public static String find2 (int x) {
            String a ="";
            switch (x) {
                case 0:
                    a = "Zero";
                    break;
                case 1:
                    a = "One";
                    break;

                case 2:
                    a = "Two";
                    break;
                case 3:
                    a = "Three";
                    break;
                case 4:
                    a = "Four";
                    break;
                case 5:
                    a = "Five";
                    break;
                case 6:
                    a = "Six";
                    break;
                case 7:
                    a = "Seven";
                    break;
                case 8:
                    a = "Eigh";
                    break;
                case 9:
                    a = "Nigh";
                    break;
            }
            return a;
        }

    public static void main(String[] args) {
        int number= new Scanner(System.in).nextInt();
        int findM      = (number%100-number%100%10)/10;
        int findHundred = (number - number%100)/100;
        int findDozen = (number-number%10)/10;
        int findUnit = number%10;
        if (number>=0&&number<10){
            System.out.println(find2(number));
        } else if(number>=10&&number<20){
            if (number==11){
                System.out.println("elevent");
            } else if (number==12){
                System.out.println("twelve");
            } else if (number==10) {
                System.out.println("ten");
            } else {
                System.out.println(find(findUnit)+"teen");
            }

        } else if (number>=20&&number<100){
            if (findUnit==0){
                System.out.println(find(findDozen)+"ty");
            } else {
                System.out.println(find(findDozen)+"ty"+find2(findUnit));
            }

        } else if (number >=100&&number<1000){
            if ( number%100==0){
                System.out.println(find2(findHundred)+"hunderous");

            } else {
                if (number%10==0 && number%100!=10){
                    System.out.println(find2(findHundred)+"hunderous and "+find(findM)+"ty");
                } else {
                    if (number%100==11){
                        System.out.println(find2(findHundred)+"hunderous and  Elevent");
                    } else if (number%100==12){
                        System.out.println(find2(findHundred)+"hunderous and  Twelve");
                    } else if (number%100==10){
                        System.out.println(find2(findHundred)+"hunderous and Ten");
                    } else if (number%100<10) {
                        System.out.println(find2(findHundred)+"hunderous and "+find2(findUnit));
                    } else {
                        System.out.println(find2(findHundred)+"hunderous and "+find(findM)+"ty"+find2(findUnit));
                    }

                }
            }

        } else {
            System.out.println("Invalid our system");
        }
    }
}
