import java.util.Scanner;

public class TekCiftKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        if (sayi % 2 == 0) {
            System.out.println(sayi + " çifttir.");
        } else {
            System.out.println(sayi + " tektir.");
        }

        scanner.close();
    }
}

