package praktikum2;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        main x = new main();
        x.pilih();
    }

    public void pilih() {

        ArrayList<MesinKopi_topping> kopi = new ArrayList<>();
        ArrayList<Topping> toping = new ArrayList<>();

        MesinKopi_topping arabica = new MesinKopi_topping();
        MesinKopi_topping robusta = new MesinKopi_topping();
        MesinKopi_topping flora = new MesinKopi_topping();
        Topping cream = new Topping();
        Topping milk = new Topping();
        Topping brown = new Topping();
        Scanner keyboard = new Scanner(System.in);

        arabica.setnamakopi("Arabica");
        arabica.setasalkopi("Timur Tengah");
        arabica.setstokkopi(50);
        kopi.add(arabica);
        robusta.setnamakopi("Robusta");
        robusta.setasalkopi("Eropa");
        robusta.setstokkopi(50);
        kopi.add(robusta);

        flora.setnamakopi("Flora");
        flora.setasalkopi("Asia");
        flora.setstokkopi(20);
        kopi.add(flora);

        milk.setnamatoping("Milk");
        milk.setstoktoping(50);
        toping.add(milk);
        cream.setnamatoping("Cream");
        cream.setstoktoping(50);
        toping.add(cream);

        brown.setnamatoping("Brown Sugar");

        brown.setstoktoping(20);
        toping.add(brown);
        System.out.println("Menu kopi adalah :");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            System.out.println("\t" + j + " " + kopi.get(i).getnamakopi());
        }
        System.out.println("Menu Toping adalah ");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            System.out.println("\t" + j + " " + toping.get(i).getnamatoping());
        }
        try {
            kopi.size();
            toping.size();
            System.out.println("Masukan kopi yang mau dipilih ");
            System.out.print("Masukkan Pilihan :");
            int pilihanKopi = keyboard.nextInt() - 1;
            System.out.println("--------------------------------------");
            System.out.println("Masukan Topping yang mau dipilih ");
            System.out.print("Masukkan Pilihan :");
            int pilihanTopping = keyboard.nextInt() - 1;
            System.out.println("--------------------------------------");
            System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihanKopi).getnamakopi() + " yang berasal dari " + kopi.get(pilihanKopi).getasalkopi());
            System.out.println("Sisa Stock " + kopi.get(pilihanKopi).getstokkopi());
        } catch (Exception e) {
            System.out.println("\nInputan Anda Salah");
            System.out.println(e + "\n");
            pilih();
        }
    }
}
