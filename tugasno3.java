import java.util.Scanner;
public class tugasno3 {
    public static void main(String[] args){
        Scanner bil = new Scanner(System.in);
        int n, m;
        n = bil.nextInt();
        m = bil.nextInt();
        
        System.out.println("masing masing " + n / m);
        System.out.println("sisa " + n % m);
    }
}