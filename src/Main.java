import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined
        int pearW, appleW, tomatoesW, bananaW, eggplantW;
        double  pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5.0, amount;

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
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

        //Amount variable set equal to sum of prices.
        amount = (pearW * pear) + (appleW * apple) + (tomatoesW * tomatoes) + (bananaW * banana) + (eggplantW * eggplant);

        //Result printed.
        System.out.print("Toplam Tutar = " + amount + "TL");
    }
}