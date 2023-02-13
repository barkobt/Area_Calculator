import java.util.Scanner;
/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
Yatay Kenarın uzunluğunu iste
Dikey Kenarın uzunluğunu iste
Yatayın karesiyle dikeyin karesini topla ve hipotenüs diye bir şey tanımlayıp hipotenüs kareye eşitle
hipotenüs yatay ve dikeyi topla 2 ye böl u

 */

public class Hipotenus_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin Yatay Uzunluğunu giriniz:");
        double yatay = input.nextInt();
        System.out.println("Üçgenin Dikey Uzunluğunu giriniz:");
        double dikey = input.nextInt();

        double hipotenus = Math.sqrt((yatay)*yatay + (dikey)*dikey);
        System.out.println("Hipotenüs:"+hipotenus);

        double u = (hipotenus + dikey + yatay)/2;
        double alan = Math.sqrt(u * (u-yatay) * (u-dikey) * (u-hipotenus));







        System.out.println("Üçgenin Alanı:"+alan);





    }
}
