import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        int C = obj.nextInt();
        double F=(C*9.0/5.0)+32;
        F=Math.round(F*100.0)/100.0;
        System.out.println(F);
    }
}