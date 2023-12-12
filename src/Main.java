import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pearW, appleW, tomatoesW, bananaW, eggplantW;
        double  pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5.0, amount;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kac kilo ? : ");
        pearW = inp.nextInt();

        System.out.print("Elma kac kilo ? : ");
        appleW = inp.nextInt();

        System.out.print("Domates kac kilo ? : ");
        tomatoesW = inp.nextInt();

        System.out.print("Muz kac kilo ? : ");
        bananaW = inp.nextInt();

        System.out.print("Patlican kac kilo ? : ");
        eggplantW = inp.nextInt();

        amount = (pearW * pear) + (appleW * apple) + (tomatoesW * tomatoes) + (bananaW * banana) + (eggplantW * eggplant);

        System.out.print("Toplam Tutar = " + amount + "TL");
    }
}