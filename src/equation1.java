import java.util.Scanner;

public class equation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao A");
        float a = input.nextFloat();
        System.out.println("Nhap vao B");
        float b = input.nextFloat();
        System.out.println("Nhap vao C");
        float c = input.nextFloat();
        if (a != 0) {
            float x = (c - b) / a;
            System.out.println("Phuong trinh co 1 nghiem can tim la: " + x);
        } else {
            if (b == c && a != 0) {
                System.out.println("Phuong trinh co nghiem voi moi x");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
