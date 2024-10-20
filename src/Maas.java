public class Maas {

    // Personelin bir günlük maaşı (örneğin 500 TL olarak belirlenmiş)
    static final int GUNLUK_MAAS = 500;

    // Fazladan gün başına verilen prim (1000 TL)
    static final int EKSTRA_GUN_PRIM = 1000;

    // Maaş hesaplama metodu (üçlü operatör ile)
    public static double maasHesapla(int calisilanGun) {
        // Çalışılan gün sayısı 25'ten fazla mı? Eğer fazla ise fazla günlere prim eklenir
        return calisilanGun * GUNLUK_MAAS +
                (calisilanGun > 25 ? (calisilanGun - 25) * EKSTRA_GUN_PRIM : 0);
    }

    public static void main(String[] args) {
        // Örnek bir çalışanın çalıştığı gün sayısı
        int calisilanGun = 28;

        // Maaşı hesapla ve sonucu ekrana yazdır
        double maas = maasHesapla(calisilanGun);
        System.out.println("Çalışanın maaşı: " + maas + " TL");
    }
}
