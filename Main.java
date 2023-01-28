import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    static void toplam() {
        Scanner input = new Scanner(in);
        int a, b, c = 0;
        out.print("Kaç adet sayı toplayacaksınız : ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            out.println(i + ". sayıyı giriniz : ");
            b = input.nextInt();
            c += b;
            out.println("Girilen sayıların toplamı : " + c);

        }

    }

    static void cikarma() {
        Scanner input = new Scanner(in);
        out.print("Kaç sayı Çıkarmak istiyorsunuz : ");
        int a, b, c = 0;
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            out.print(i + ". sayıy giriniz : ");
            b = input.nextInt();
            if (i == 1) {
                c = b;
                continue;
            }
            c = c - b;
            out.println("Çıkarma işleminin sonucu : " + c);

        }
    }

    static void carpma() {
        Scanner input = new Scanner(in);
        int a, b, c = 1;
        out.print("Kaç adet sayıyı çarpmak istiyorsunuz : ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            out.print(i + ". sayıyı giriniz : ");
            b = input.nextInt();
            c *= b;
            out.println("Girilen sayıların çarpım sonucu : " + c);

        }
    }

    static void bolme() {
        Scanner input = new Scanner(in);
        int a;
        double b, c = 0.0;
        out.print("Kaç adet sayı gireceksiniz : ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            out.print(i + ". sayıyı giriniz : ");
            b = input.nextDouble();
            if (i != 1 && b == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                c = b;
                continue;
            }
            c /= b;
            out.println("Girilen sayıların bölme saonucu : " + c);
        }
    }

    static void uslu() {
        Scanner input = new Scanner(in);
        int a, b, c = 1;
        out.print("Üssü alınacak sayıyı giriniz : ");
        a = input.nextInt();
        out.print("Üssü giriniz : ");
        b = input.nextInt();
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        out.println("Sonuç : " + c);


    }

    static void fak() {
        Scanner input = new Scanner(in);
        int a, b = 1;
        out.print("Faktöryeli alınacak sayıyı giriniz : ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        out.println(a + "'nın Faktöryelin sonucu : " + b);


    }

    static void mod() {
        Scanner input = new Scanner(in);
        int a, b, c;
        out.print("Modu alınacak sayıyı giriniz : ");
        a = input.nextInt();
        out.print("Mod kaç olacak : ");
        b = input.nextInt();
        c = a % b;
        out.println("Sonuc : " + c);


    }

    static void dik() {
        Scanner input = new Scanner(in);
        int a, b, alan, cevre;
        out.println("Dikdörtgen alan ve çevre hesabı.");
        out.print("Uzun kenarı giriniz : ");
        a = input.nextInt();
        out.print("Kısa kenarı giriniz : ");
        b = input.nextInt();
        cevre = (2 * a) + (2 * b);
        alan = a * b;
        out.println("Dikdörtgenin Çevre uzunluğu : " + cevre + " , Alanı : " + alan);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    toplam();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    uslu();
                    break;
                case 6:
                    fak();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dik();
                    break;
                case 0:
                    break;
                default:
                    out.println("Yanlış bir değer girdiniz. Lütfen tekrar deneyiniz : ");

            }
        } while (select != 0);
    }
}
