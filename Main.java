import java.util.Scanner;
//Patika.dev linkim -> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5, toplam;
        int kgAr, kgEl, kgDo, kgMuz, kgPat;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        kgAr = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        kgEl = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        kgDo = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        kgMuz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        kgPat = input.nextInt();

        toplam = (armut*kgAr) +(elma*kgEl) + (domates*kgDo) + (muz*kgMuz) + (patlican*kgPat);

        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}