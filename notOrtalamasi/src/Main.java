import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat ,fizik, kimya, turkce, tarih, muzik;
        int gecerNot = 60;
        int dersSayisi;

        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        boolean sonuc0 = mat >= gecerNot;
        String str =(sonuc0) ? "Gectiniz!" : "Kaldiniz!";
        System.out.println(str);

        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        boolean sonuc1 = fizik >= gecerNot;
        String str1 =(sonuc1) ? "Gectiniz!" : "Kaldiniz!";
        System.out.println(str1);

        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        boolean sonuc2 = kimya >= gecerNot;
        String str2 =(sonuc2) ? "Gectiniz!" : "Kaldiniz!";
        System.out.println(str2);

        System.out.print("Türkce notunuzu giriniz :");
        turkce = input.nextInt();
        boolean sonuc3 = turkce >= gecerNot;
        String str3 =(sonuc3) ? "Gectiniz!" : "Kaldiniz!";
        System.out.println(str3);

        System.out.print("Tarih notunuzu giriniz :");
        tarih = input.nextInt();
        boolean sonuc4 = tarih >= gecerNot;
        String str4 =(sonuc4) ? "Gectiniz!" : "Kaldiniz!";
        System.out.println(str4);

        System.out.print("Muzik notunuzu giriniz :");
        muzik = input.nextInt();
        boolean sonuc5 = muzik >= gecerNot;
        String str5 =(sonuc5) ? "Gectiniz!" : "Kaldiniz!";

        System.out.println(str5);
        int derslerToplami = ( mat +fizik +kimya +turkce +tarih +muzik );
        System.out.println("Toplam ders sayiniz kactir? Dogru yaziniz!:");
        dersSayisi = input.nextInt();
        int toplamDersOrtalamasi = derslerToplami / dersSayisi;

        System.out.println("Not ortalamaniz asagidadir");
        System.out.println(toplamDersOrtalamasi);
        boolean sonuc6 = toplamDersOrtalamasi >= gecerNot;

        String str6 =(sonuc6) ? "Sinifi gectiniz.Tebrikler!" : "Kaldiniz!";
        System.out.println(str6);

    }
}
