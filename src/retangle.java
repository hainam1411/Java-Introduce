import java.util.Scanner;

public class retangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
       float width = input.nextFloat();
        System.out.println("Nhap chieu dai");
        float height = input.nextFloat();
        float S = width * height;
        System.out.println("Dien tich hinh chu nhat can tim: " + S);
    }
}
