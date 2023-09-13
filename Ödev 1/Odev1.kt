package com.example.kotlindersleri.degiskenler

fun main() {
    val city = "Kocaeli" // Şehir
    val country = "Türkiye" // Ülke
    val number = "+90 550 550 5780" // Telefon Numarası
    val postCode = "41000" // Posta Kodu
    val email = "example@example.com" // E-posta Adresi
    val job = "Yazılımcı" // Meslek
    val stockInformation = "2359" // Stok Bilgisi
    val customerName = "Mehmet" // Müşteri Adı
    val balance = "4000" // Bakiye
    val birthday = "25/05/2000" // Doğum Günü
    val salary = "10000" // Maaş
    val marialStatus = "Bekar" // Medeni Durum
    val productReview = "Kullanışlı ve güzel" // Ürün İncelemesi
    val paymentDate = "30/07/2023" // Ödeme Tarihi
    val payment = 2459.80 // Ödeme Miktarı
    val orderCount = 156 // Sipariş Sayısı
    val carBrand = "Mercedes" // Araba Markası
    val carModel = "CLA" // Araba Modeli
    val bookName = "Tutunamayanlar" // Kitap Adı
    val releaseDate = "14/5/1995" // Yayın Tarihi
    val discountAmount = "11/08/2023" // İndirim Tarihi
    val roomCount = "5" // Oda Sayısı
    val latitude = 41.8781f // Enlem
    val longitude = -87.6298f // Boylam
    val productName = "Akıllı Telefon" // Ürün Adı
    val mealPrice = 9.99 // Yemek Fiyatı
    val brand = "Samsung" // Marka
    val musicTitle = "Bu Akşam" // Müzik Adı
    val videoDuration = 180 // Video Süresi
    val productRating = 4.5 // Ürün Puanı
    val imageName = "img_0084525" // Resim Adı
    val fileFormat = "JPEG" // Dosya Formatı
    val color = "Kırmızı" // Renk
    val colorCode = "#BF5845" // Renk Kodu
    val phoneModel = "Iphone 11" // Telefon Modeli
    val aboutCompany = "Mobil Uygulama geliştirme" // Firma Hakkında
    val weight = 0.5 // Ağırlık
    val nationalDay = "29 Ekim Cumhuriyet Bayramı" // Ulusal Gün
    val holiday = "Kurban Bayramı" // Tatil Günü
    val reservationDate = "2023-09-15" // Rezervasyon Tarihi
    val snackName = "Çikolata" // Atıştırmalık Adı
    val busRoute = "33 Batı Terminali - Üniversite" // Otobüs Hattı
    val remainingMinutes = 30 // Kalan Dakika
    val trackingCode = "ABC123" // Takip Kodu
    val couponDuration = 7 // Kupon Süresi
    val couponCode = "KUPON10" // Kupon Kodu
    val billingAddress = "Emek Mahallesi Çankaya/Ankara" // Fatura Adresi

    val formatString = "%-20s: %s"
    println(String.format(formatString, "Şehir", city))
    println(String.format(formatString, "Ülke", country))
    println(String.format(formatString, "Telefon Numarası", number))
    println(String.format(formatString, "Posta Kodu", postCode))
    println(String.format(formatString, "E-posta Adresi", email))
    println(String.format(formatString, "Meslek", job))
    println(String.format(formatString, "Stok Bilgisi", stockInformation))
    println(String.format(formatString, "Müşteri Adı", customerName))
    println(String.format(formatString, "Bakiye", balance))
    println(String.format(formatString, "Doğum Günü", birthday))
    println(String.format(formatString, "Maaş", salary))
    println(String.format(formatString, "Medeni Durum", marialStatus))
    println(String.format(formatString, "Ürün İncelemesi", productReview))
    println(String.format(formatString, "Ödeme Tarihi", paymentDate))
    println(String.format(formatString, "Ödeme Miktarı", payment))
    println(String.format(formatString, "Sipariş Sayısı", orderCount))
    println(String.format(formatString, "Araba Markası", carBrand))
    println(String.format(formatString, "Araba Modeli", carModel))
    println(String.format(formatString, "Kitap Adı", bookName))
    println(String.format(formatString, "Yayın Tarihi", releaseDate))
    println(String.format(formatString, "İndirim Tarihi", discountAmount))
    println(String.format(formatString, "Oda Sayısı", roomCount))
    println(String.format(formatString, "Enlem", latitude))
    println(String.format(formatString, "Boylam", longitude))
    println(String.format(formatString, "Ürün Adı", productName))
    println(String.format(formatString, "Yemek Fiyatı", mealPrice))
    println(String.format(formatString, "Marka", brand))
    println(String.format(formatString, "Müzik Adı", musicTitle))
    println(String.format(formatString, "Video Süresi", videoDuration))
    println(String.format(formatString, "Ürün Puanı", productRating))
    println(String.format(formatString, "Resim Adı", imageName))
    println(String.format(formatString, "Dosya Formatı", fileFormat))
    println(String.format(formatString, "Renk", color))
    println(String.format(formatString, "Renk Kodu", colorCode))
    println(String.format(formatString, "Telefon Modeli", phoneModel))
    println(String.format(formatString, "Firma Hakkında", aboutCompany))
    println(String.format(formatString, "Ağırlık", weight))
    println(String.format(formatString, "Ulusal Gün", nationalDay))
    println(String.format(formatString, "Tatil Günü", holiday))
    println(String.format(formatString, "Rezervasyon Tarihi", reservationDate))
    println(String.format(formatString, "Atıştırmalık Adı", snackName))
    println(String.format(formatString, "Otobüs Hattı", busRoute))
    println(String.format(formatString, "Kalan Dakika", remainingMinutes))
    println(String.format(formatString, "Takip Kodu", trackingCode))
    println(String.format(formatString, "Kupon Süresi", couponDuration))
    println(String.format(formatString, "Kupon Kodu", couponCode))
    println(String.format(formatString, "Fatura Adresi", billingAddress))
}