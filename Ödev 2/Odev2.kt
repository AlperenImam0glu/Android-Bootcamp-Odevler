package com.example.kotlindersleri.nesne_tabanli

class Odev2 {

    fun soru1(derece: Double): Double {
        return (derece * 1.8) + 32
    }

    fun soru2(uzunKenar: Double, kısaKenar: Double): Double {
        return uzunKenar * 2 + kısaKenar * 2
    }

    fun soru3(sayi: Int): Int {
        var faktoriyel = 1
        for (i in 1..sayi) {
            faktoriyel *= i
        }
        return faktoriyel
    }

    fun soru4(kelime: String): Int {
        var adet = 0
        for (i in 0..kelime.length - 1) {
            if (kelime[i] == 'a') {
                adet++
            }
        }
        return adet
    }

    fun soru5(kenarSayisi: Int): Int {
        return if (kenarSayisi < 3) {
            0
        } else {
            (kenarSayisi - 2) * 180
        }
    }

    fun soru6(gunSayisi: Int): Int {
        return if (gunSayisi <=0) {
            0
        } else {
            //160 saat, günde 8 saat ile 20 gün yapar
            if (gunSayisi <= 20) {
                gunSayisi * 8 * 10
            } else {
                (gunSayisi - 20) * 20 * 8 + gunSayisi * 10 * 8
            }
        }
    }

    fun soru7(kota: Int): Int {

        return if (kota <= 0) {
            return 0
        } else if (kota <= 50) {
            return 100
        } else {
            return 100 + ((kota - 50) * 4)
        }
    }


}