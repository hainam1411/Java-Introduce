import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu cao (m)");
        double height = input.nextDouble();
        System.out.println("Nhap can nang (Kg)");
        double weight = input.nextDouble();
        double BMI = weight/(height*height);
        if (BMI > 23){
            System.out.println("Ban beo vl!");
        } else if ( BMI <22.9) {
            System.out.println("Can nang binh thuong");
        }else if (BMI <18.5){
            System.out.println("Ban qua gay, an them vao");
        }else {
            System.out.println("Nah, u r dead");
        }
    }
}
