import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao nam muon kiem tra: ");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Năm " + year + " la nam nhuan");
        }else {
            System.out.println("Năm " + year + " Khong phai nam nhuan");
        }
    }
}
