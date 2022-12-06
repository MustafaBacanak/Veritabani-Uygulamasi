package ogrenci_veritabani_uygulamasi;

import java.util.Scanner;

public class OgrenciPojo {

    private String isim;
    private String soyIsim;
    private int yil;
    private String ogrenciNo;
    private String dersler = "";
    private int toplamBorc;
    private int dersUcreti = 600;
    private static int id = 1000;

    // Constructor: İsim, soyisim ve yıl bilgisini al
    public OgrenciPojo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        this.isim = input.nextLine();

        System.out.print("Soyisminizi giriniz: ");
        this.soyIsim = input.nextLine();

        System.out.print("Kaçıncı sınıftasınız: ");
        this.yil = input.nextInt();
    }


    // Öğrenci no oluştur
    public void ogrenciNoBelirle() {
        id++;
        this.ogrenciNo = id +""+ yil;
        System.out.println(ogrenciNo);
    }

    // Derse kayıt ol
    public void dersKaydi() {

        boolean flag = true;

        System.out.println("\n\tDERS SEÇİM EKRANINA HOŞGELDİNİZ");
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tDERS LİSTESİ\n " +
                " \n Tarih - 101 " +
                " \n Matematik - 103 " +
                " \n İngilizce - 105 " +
                " \n Kimya - 107 " +
                " \n Bilgisayar Bilimleri - 109\n ");
        do {
            System.out.println("Seçmek istediğiniz dersin kodunu giriniz. ( Çıkış için X'e basınız ) ");
            String ders = input.next().toUpperCase();
            switch (ders) {
                case "101":
                    dersler = dersler + "Tarih ";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    toplamBorc = toplamBorc + dersUcreti;
                    System.out.println("Toplam Borcunuz: \n" + toplamBorc+" $");
                    break;
                case "103":
                    dersler = dersler + "Matematik ";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    toplamBorc = toplamBorc + dersUcreti;
                    System.out.println("Toplam Borcunuz: " + toplamBorc+" $");
                    break;
                case "105":
                    dersler = dersler + "İngilizce ";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    toplamBorc = toplamBorc + dersUcreti;
                    System.out.println("Toplam Borcunuz: \n" + toplamBorc+" $");
                    break;
                case "107":
                    dersler = dersler + "Kimya ";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    toplamBorc = toplamBorc + dersUcreti;
                    System.out.println("Toplam Borcunuz: \n" + toplamBorc+" $");
                    break;
                case "109":
                    dersler = dersler + "Bilgisayar Bilimleri ";
                    System.out.println("Seçilen Dersler: \n" + dersler);
                    toplamBorc = toplamBorc + dersUcreti;
                    System.out.println("Toplam Borcunuz: \n" + toplamBorc+" $");
                    break;
                case "X":
                    System.out.println("Çıkış yaptınız. İyi Günler..");
                    flag =false;
                    break;
                default:
                    System.out.println("Geçersiz işlem yaptınız.");
            }
        }
        while (flag);
        System.out.println("Seçilen Dersler: " + dersler);
        System.out.println("Toplam Borcunuz: " + toplamBorc);
    }


}



