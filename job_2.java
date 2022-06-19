import java.util.Scanner;
public class job_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("type in number: ");
        int x = iScanner.nextInt();
        iScanner.close();

        int Sum = 0;

        while (x>10) {
            Sum = Sum + x%10;
            x/=10;
        }
        System.out.println(Sum);

        if (x%Sum == 0) {
            System.out.println(x%Sum);
            System.out.println("can be divided");
        }
        else {
            System.out.println("cannot be devided");
        }
    }
}
