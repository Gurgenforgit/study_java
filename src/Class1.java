import java.util.Scanner;
public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a four digit number");
        int a = sc.nextInt();
        sc.close();
        System.out.println(a / 1000);
        System.out.println((a % 1000)/100);
        System.out.println(((a % 1000)/10) % 10);
        System.out.println((a % 100) % 10);
    }
}
