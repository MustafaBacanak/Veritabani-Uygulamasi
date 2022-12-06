package ogrenci_veritabani_uygulamasi;

import java.util.Scanner;

public class OgrenciPojo {

 private String isim;
 private String soyIsim;
 private String yil;
 private String ogrenciNo;
 private String dersler;
 private int toplamBorc;
 private int dersUcreti ;

 public OgrenciPojo() {

  Scanner input = new Scanner(System.in);
  System.out.print("Adınızı giriniz");
  this.isim = input.nextLine();

  System.out.print("Soyisminizi giriniz");
  this.soyIsim =input.nextLine();

  System.out.print("Kaçıncı sınıftasınız");
  this.yil = input.next();

 }


}
