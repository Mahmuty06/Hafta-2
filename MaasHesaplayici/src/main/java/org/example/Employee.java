package org.example;

public class Employee {
    // Nitelikler
     String isim ;
     double maas ;
    double calismaSaati ;
    int isebaslangicyil ;
    //Parametreler
    public Employee (String isim , double maas , double calismaSaati, int isebaslangicyil ) {

        this.isim = isim ;
        this.maas = maas ;
        this.calismaSaati = calismaSaati ;
        this.isebaslangicyil = isebaslangicyil ;
    }
    //Eğer nesneye girilen maaş değeri 1000'in üstündeyse %3 kesinti yapıyoruz
    double tax () {
        double vergi = 0.0;

        if (this.maas < 1000) {
            return vergi;
        } else  {
            vergi = (this.maas * 3) / 100;
            return vergi;
        }
    }
    //Eğer nesneye girilen çalışma saati 40'ın üstündeyse, çalıştığı her saat başına 30 TL bonus alıyor
    double bonus () {
        double bonus = 0.0 ;
        if (this.calismaSaati <= 40 ) {
            return  bonus  ;
        } else {
            bonus = (this.calismaSaati - 40) * 30 ;
            return  bonus ;
        }
    }
    double raiseSalary () {
        int nowyear = 2021 ;
        double maasArtisi =0.0 ;
        int calistigiYilSayisi = (nowyear - this.isebaslangicyil) ;

        if (calistigiYilSayisi  < 10 ) {
            maasArtisi = maasArtisi + (this.maas * 5)/100 ;
        } else if (9 < calistigiYilSayisi && 20 >calistigiYilSayisi ) {
            maasArtisi = maasArtisi + ( this.maas * 10 ) / 100 ;

        } else if (19 <calistigiYilSayisi) {
            maasArtisi = maasArtisi + ( this.maas* 15 ) / 100 ;
        }
        return maasArtisi;
    }
    public String toString () {
        double vergi =  tax () ;
        double mesaiParasi = bonus () ;
        double zam = raiseSalary() ;
        double vergiBonus =  (this.maas + (mesaiParasi - vergi )) ;
        double toplammaas = (vergiBonus + zam ) ;

        return  "Adı: " + this.isim+
                "\nMaaşı: " + this.maas+
                "\nÇalışma Saati: " + this.calismaSaati+
                "\nBaşlangıç Yılı: " + this.isebaslangicyil+
                "\nVergi:  " + vergi +
                "\nBonus: " +  mesaiParasi +
                "\nMaaş Artışı: " + zam+
                "\nVergi ve Bonuslarla birlikte maaş: " + vergiBonus+
                "\nToplam Maaş: " + toplammaas;
    }
}



