package ogrenci_veritabani_uygulamasi;

public class Main {

    public static void main(String[] args) {
        OgrenciPojo ogr = new OgrenciPojo();
        ogr.ogrenciNoBelirle();
        ogr.dersKaydi();
        ogr.odemeMitari();
        System.out.println(OgrenciPojo.ANSI_YELLOW + "--------------------------");
        System.out.println(OgrenciPojo.ANSI_GREEN + OgrenciPojo.ANSI_BOLD + "Kaydınız başarılı bir şekilde tamamlanmıştır."
                + "\nDerslerinizi sorumlu danışmanınıza onaylatınız.");

    }


}