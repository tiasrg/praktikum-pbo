import java.util.Scanner;
public class tugasno4 {
    public static void main(String[] args){
        Scanner tia = new Scanner(System.in);
        double a, t, l;
        a = tia.nextDouble();
        t = tia.nextDouble();
        l = a * t / 2;
        System.out.printf("%.2f", l);
    }
}