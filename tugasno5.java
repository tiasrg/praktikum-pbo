import java.util.Scanner;
public class tugasno5 {
    public static void main(String[] args){
        Scanner bilangan = new Scanner (System.in);
        int p, q;
        int baris = 3;
        int kolom = 3;
        int array[][] = new int[baris][kolom];

        for(p=0; p<baris; p++){
            for(q=0; q<kolom; q++){
                array[p][q] = bilangan.nextInt();
            }
        }

        for(p=0; p<kolom; p++){
            for(q=0; q<baris; q++){
                System.out.print(array[q][p]+" ");
            }
            System.out.println();
        }
    }
}