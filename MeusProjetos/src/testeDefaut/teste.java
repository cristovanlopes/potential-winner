package testeDefaut;

import java.util.Locale;
import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double n = sc.nextDouble();
        int[] notes = { 100, 50, 20, 10, 5, 2 };
        int[] coins = { 50, 25, 10, 5, 1 };
        String[] noteNames = { "nota(s) de R$ 100.00", "nota(s) de R$ 50.00", "nota(s) de R$ 20.00", "nota(s) de R$ 10.00", "nota(s) de R$ 5.00", "nota(s) de R$ 2.00" };
        String[] coinNames = { "moeda(s) de R$ 0.50", "moeda(s) de R$ 0.25", "moeda(s) de R$ 0.10", "moeda(s) de R$ 0.05", "moeda(s) de R$ 0.01" };

        int noteCount, coinCount;
        double coinValue = n - (int)n;
        coinValue *= 100;

        System.out.println("NOTAS:");
        for (int i = 0; i < notes.length; i++) {
            noteCount = (int)n / notes[i];
            n -= noteCount * notes[i];
            System.out.println(noteCount + " " + noteNames[i]);
        }

        System.out.println("MOEDAS:");
        System.out.println((int)n + " moeda(s) de R$ 1.00");
        for (int i = 0; i < coins.length; i++) {
            coinCount = (int)coinValue / coins[i];
            coinValue -= coinCount * coins[i];
            System.out.println(coinCount + " " + coinNames[i]);
		}
        
		sc.close();
	}
}
