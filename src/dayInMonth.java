import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thang can tinh ngay: ");
        int month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang " + month +" có 31 ngày");
                break;
            case 2:
                System.out.println("thang 2 có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
        }
    }
}
