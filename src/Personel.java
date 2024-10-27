// Personel sınıfı: Bir çalışanın özelliklerini ve maaş hesaplamasını içerir
public class Personel {

    // Sabitler
    private static final int GUNLUK_MAAS = 500;
    private static final int EKSTRA_GUN_PRIM = 1000;

    // Personelin çalıştığı gün sayısı
    private int calisilanGun;

    // Constructor: Yeni bir Personel nesnesi oluşturur
    public Personel(int calisilanGun) {
        this.calisilanGun = calisilanGun;
    }

    // Maaş hesaplama metodu
    public double maasHesapla() {
        // Çalışılan gün sayısı 25'ten fazla mı? Eğer fazla ise fazla günlere prim eklenir
        return calisilanGun * GUNLUK_MAAS +
                (calisilanGun > 25 ? (calisilanGun - 25) * EKSTRA_GUN_PRIM : 0);
    }

    // Çalışılan gün sayısını al
    public int getCalisilanGun() {
        return calisilanGun;
    }

    // Çalışılan gün sayısını ayarla
    public void setCalisilanGun(int calisilanGun) {
        this.calisilanGun = calisilanGun;
    }

    // Ana metot
    public static void main(String[] args) {
        // Örnek bir çalışanın çalıştığı gün sayısı ile yeni bir Personel nesnesi oluştur
        Personel personel = new Personel(28);

        // Maaşı hesapla ve sonucu ekrana yazdır
        double maas = personel.maasHesapla();
        System.out.println("Çalışanın maaşı: " + maas + " TL");
    }
}
