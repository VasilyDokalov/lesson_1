import java.util.Scanner;
public class job_1 {
    public static void main(String[] args) {
    
        Scanner iScanner = new Scanner(System.in);

        System.out.println("type in n: ");

        int n = iScanner.nextInt();

        iScanner.close();

        int Tn = 0;

        if (n==1) {
            Tn = 1;
            System.out.println(Tn);
            }

        else if (n>1) {
            Tn = ((n*(n+1)))/2;
            System.out.println(Tn);
            }
        }

}
    

