
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = scanner.nextInt();
        
        for(int i = 1; i <= sayi; i*=20){
            System.out.println(i);
        }
    }
}
