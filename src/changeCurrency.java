import java.util.Scanner;

public class changeCurrency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap USD");
        double usd = input.nextDouble();
        final int rate = 24740;
        double vnd = usd * rate;
        System.out.println("So tien quy doi duoc: " + vnd);
    }
}
