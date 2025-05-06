package bankaMatikProjesi;

import java.util.Scanner;

public class bankaMatikProjesi {

    public static void main(String[] args) {
        /*
        1- Hesap Bakiyesi Göster
            2- Para Çek
            3- Para Yatır
            4- Şifre Değiştirme
            5- Çıkış
            Kullanıcının USD ve EUR hesapları da olsun,
            Hesap Bakiyesi gösterme, para yatırma, para çekme
            menülerindeki işlemleri bu hesapları da bağlayacak şekilde düzenleyiniz

         */

        System.out.println("==================================== WISEBANK ATM ====================================");
        System.out.println("WiseBanK ATM'sine Hoşgeldiniz. Lütfen Aşğaıdaki Menünden Yapacağınız İşlemi Seçiniz\n");
        System.out.println("============== MENU =============");
        System.out.println("\t1- Hesap Bakiyesi Göster\n\t2- Para Çek\n\t3- Para Yatır\n\t4- Şifre Değiştirme\n\t5- Çıkış ");
        System.out.print("İşlem Numaranız: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 4 haneli şifrenizi giriniz: ");
        String sifre = scanner.next();

        // sifre ve kullanici tanimlama
        String sifre1 = "1111";
        String sifre2 = "2222";
        String sifre3 = "3333";
        String kullanici1 = "ali demir";
        String kullanici2 = "ahmet celik";
        String kullanici3 = "mehmet bakir";

        // bakkiye sekmesi
        double kullanici1BakiyeTL = 100;
        double kullanici1BakiyeUSD = 140;
        double kullanici1BakiyeEUR = 100;

        double kullanici2BakiyeTL = 123;
        double kullanici2BakiyeUSD = 321;
        double kullanici2BakiyeEUR = 456;

        double kullanici3BakiyeTL = 678;
        double kullanici3BakiyeUSD = 879;
        double kullanici3BakiyeEUR = 122;

        // sifre kontrolu
        boolean girisBasarili = false;
        String aktifKullanici = "";
        double aktifBakiyeTL = 0;
        double aktifBakiyeUSD = 0;
        double aktifBakiyeEUR = 0;

        if (sifre.equals(sifre1)) {  // şifreye göre kullanıcı bilgilerini aktif hale getirir
            System.out.println("Sayın " + kullanici1 + ", WiseBank'a hoş geldiniz");
            girisBasarili = true;
            aktifKullanici = kullanici1;
            aktifBakiyeTL = kullanici1BakiyeTL;
            aktifBakiyeUSD = kullanici1BakiyeUSD;
            aktifBakiyeEUR = kullanici1BakiyeEUR;
        } else if (sifre.equals(sifre2)) {
            System.out.println("Sayın " + kullanici2 + ", bankamıza hoş geldiniz");
            girisBasarili = true;
            aktifKullanici = kullanici2;
            aktifBakiyeTL = kullanici2BakiyeTL;
            aktifBakiyeUSD = kullanici2BakiyeUSD;
            aktifBakiyeEUR = kullanici2BakiyeEUR;
        } else if (sifre.equals(sifre3)) {
            System.out.println("Sayın " + kullanici3 + ", bankamıza hoş geldiniz");
            girisBasarili = true;
            aktifKullanici = kullanici3;
            aktifBakiyeTL = kullanici3BakiyeTL;
            aktifBakiyeUSD = kullanici3BakiyeUSD;
            aktifBakiyeEUR = kullanici3BakiyeEUR;
        } else {
            System.out.println("\nGirdiğiniz yeni şifreler birbiriyle uyuşmuyor." +
                    "\nGüvenlik nedeniyle işlem durduruldu.");
            return;
        }

        // if-else sonunda kullanıcı işlem yapabilir hale geldi.
        // şifre yanlış girilirse program durdurlur.


        // giriş menüsü
        if (girisBasarili) {
            System.out.println("\n============== MENU =============");
            System.out.println("\t1- Hesap Bakiyesi Göster");
            System.out.println("\t2- Para Çek");
            System.out.println("\t3- Para Yatır");
            System.out.println("\t4- Şifre Değiştirme");
            System.out.println("\t5- Çıkış");
            int secim = scanner.nextInt();

            // kullanici  seçim menusu

            switch (secim) {
                case 1:
                    // bakiye menüsü
                    System.out.println("\nLütfen bakiye türünü seçiniz:");
                    System.out.println("\t1- TL Bakiyesi");
                    System.out.println("\t2- USD Bakiyesi");
                    System.out.println("\t3- EUR Bakiyesi");
                    System.out.println("\t4- Tüm Hesaplar");
                    int bakiyeSecim = scanner.nextInt();

                    switch (bakiyeSecim) {
                        case 1:
                            System.out.println("TL Bakiyeniz: " + aktifBakiyeTL + " TL");
                            break;
                        case 2:
                            System.out.println("USD Bakiyeniz: " + aktifBakiyeUSD + " USD");
                            break;
                        case 3:
                            System.out.println("EUR Bakiyeniz: " + aktifBakiyeEUR + " EUR");
                            break;
                        case 4:
                            System.out.println("Tüm Hesaplar:");
                            System.out.println("TL: " + aktifBakiyeTL + " TL");
                            System.out.println("USD: " + aktifBakiyeUSD + " USD");
                            System.out.println("EUR: " + aktifBakiyeEUR + " EUR");
                            break;
                        default:
                            System.out.println("Geçersiz seçim");
                    }
                    break;
                case 2:
                    // para cekme menüüssü
                    System.out.println("\nLütfen para çekme ijin para birimini seçiniz:");
                    System.out.println("\t1- TL");
                    System.out.println("\t2- USD");
                    System.out.println("\t3- EUR");
                    int cekmeSecim = scanner.nextInt();

                    switch (cekmeSecim) {
                        case 1:
                            System.out.println("Çekmek istediğiniz TL miktarını giriniz:");
                            double cekilenTL = scanner.nextDouble();
                            if (cekilenTL <= aktifBakiyeTL) {
                                aktifBakiyeTL -= cekilenTL;
                                System.out.println("yeeni TL bakiyeniz: " + aktifBakiyeTL + " TL");
                            } else {
                                System.out.println("Yetersiz TL bakiyesi");
                            }
                            break;
                        case 2:
                            System.out.println("cekmek istediğiniz USD miktarını giriniz:");
                            double cekilenUSD = scanner.nextDouble();
                            if (cekilenUSD <= aktifBakiyeUSD) {
                                aktifBakiyeUSD -= cekilenUSD;
                                System.out.println("Yeni USD bakiyeniz: " + aktifBakiyeUSD + " USD");
                            } else {
                                System.out.println("Yetersiz USD bakiyesi");
                            }
                            break;
                        case 3:
                            System.out.println("Çekmek istediğiniz EUR miktarını giriniz:");
                            double cekilenEUR = scanner.nextDouble();
                            if (cekilenEUR <= aktifBakiyeEUR) {
                                aktifBakiyeEUR -= cekilenEUR;
                                System.out.println("Yeni EUR bakiyeniz: " + aktifBakiyeEUR + " EUR");
                            } else {
                                System.out.println("Yetersiz EUR bakiyesi");
                            }
                            break;
                        default:
                            System.out.println("Geçersiz para birimi seçimi");
                    }
                    break;
                case 3:
                    // para cekme menüssü
                    System.out.println("\nLütfen para yatırma için para birimini seçiniz:");
                    System.out.println("\t1- TL");
                    System.out.println("\t2- USD");
                    System.out.println("\t3- EUR");
                    int yatirmaSecim = scanner.nextInt();

                    switch (yatirmaSecim) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz TL miktarını giriniz:");
                            double yatirilanTL = scanner.nextDouble();
                            if (yatirilanTL > 0) {
                                aktifBakiyeTL += yatirilanTL;
                                System.out.println("Yeni TL bakiyeniz: " + aktifBakiyeTL + " TL");
                            } else {
                                System.out.println("Geçersiz TL miktarı");
                            }
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz USD miktarını giriniz:");
                            double yatirilanUSD = scanner.nextDouble();
                            if (yatirilanUSD > 0) {
                                aktifBakiyeUSD += yatirilanUSD;
                                System.out.println("Yeni USD bakiyeniz: " + aktifBakiyeUSD + " USD");
                            } else {
                                System.out.println("Geçersiz USD miktarı");
                            }
                            break;
                        case 3:
                            System.out.println("Yatırmak istediğiniz EUR miktarını giriniz:");
                            double yatirilanEUR = scanner.nextDouble();
                            if (yatirilanEUR > 0) {
                                aktifBakiyeEUR += yatirilanEUR;
                                System.out.println("Yeni EUR bakiyeniz: " + aktifBakiyeEUR + " EUR");
                            } else { // yatirmaya - tutar girerse.[ buraya  çok yüksek kisitlamasi ? ( sonra ilgilen) ]
                                System.out.println("Geçersiz EUR miktarı");
                            }
                            break;
                        default:
                            System.out.println("Geçersiz para birimi seçimi");
                    }
                    break;
                case 4:
                    // sifre menüsüsü
                    System.out.println("Yeni şifre belirleme ekranına hoş geldiniz.\nYeni Şifrenizi Giriniz");
                    System.out.print("\n\tYeni Şifreniz: ");
                    String yeniSifre1 = scanner.next();
                    System.out.print("\tYeni Şifrenizi Tekrar Giriniz: ");
                    String yeniSifre2 = scanner.next();
                    if (yeniSifre1.equals(yeniSifre2)) {  // scan edilen sifre degerini degistirmek icin
                        if (sifre.equals(sifre1)) {
                            sifre1 = yeniSifre1;
                        } else if (sifre.equals(sifre2)) {
                            sifre2 = yeniSifre1;
                        } else if (sifre.equals(sifre3)) {
                            sifre3 = yeniSifre1;
                        }
                        System.out.println("\nŞifreniz başarıyla değiştirildi");
                    } else {
                        System.out.println("\nGirdiğiniz yeni şifreler birbiriyle uyuşmuyor." +
                                "\nGüvenlik nedeniyle işlem durduruldu.");
                    }
                    break;
                case 5:
                    // kullanixi islem yapmak istemezse
                    System.out.println("Çıkış Yapılıyor");
                    System.exit(0);
                default: // menude olamayan tus secerse
                    System.out.println("Yanlış bir seçim yaptınız. İşlem Durduruldu.");
            }
        }


    }
}