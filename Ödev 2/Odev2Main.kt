package com.example.kotlindersleri.nesne_tabanli

fun main() {
    val odev2 = Odev2()

    // Soru 1
    val derece = 30.0
    val fahrenheit = odev2.soru1(derece)
    println("Soru 1: $derece derece : $fahrenheit Fahrenheit")

    // Soru 2
    val uzunKenar = 5.0
    val kisaKenar = 3.0
    val cevre = odev2.soru2(uzunKenar, kisaKenar)
    println("Soru 2: Dikdörtgenin Uzun Kenar : $uzunKenar, Kısa Kenar : $kisaKenar ise Çevresi : $cevre")

    // Soru 3
    val sayi = 5
    val faktoriyel = odev2.soru3(sayi)
    println("Soru 3: $sayi faktoriyel : $faktoriyel")

    // Soru 4
    val kelime = "merhaba"
    val adetA = odev2.soru4(kelime)
    println("Soru 4: '$kelime' kelimesinde 'a' harfi sayısı : $adetA")

    // Soru 5
    val kenarSayisi = 6
    val aciToplami = odev2.soru5(kenarSayisi)
    println("Soru 5: $kenarSayisi kenarlı bir çokgenin iç açılarının toplamı : $aciToplami derecedir")

    // Soru 6
    val gunSayisi = 25
    val toplamSaat = odev2.soru6(gunSayisi)
    println("Soru 6: $gunSayisi gün için toplam ücret : $toplamSaat TL")

    // Soru 7
    val kota = 70
    val ucret = odev2.soru7(kota)
    println("Soru 7: $kota GB internet kullanım ücreti : $ucret TL")
}
