# 📌 AI-Supported Fake REST API Test Automation Project

##  Proje Açıklaması

Bu proje, **Java + Maven + Rest Assured + TestNG/JUnit** kullanılarak geliştirilmiş bir **API Test Otomasyon Framework’üdür**.

Amaç, bir **bankacılık sistemi API’si** üzerinde gerçek bir yazılım test mühendisi yaklaşımıyla **regresyon test senaryoları oluşturmak ve API davranışlarını doğrulamaktır.**

Bu kapsamda sistem:

- HTTP isteklerinin doğru çalışıp çalışmadığını kontrol eder
- API response’larının doğruluğunu doğrular
- Performans (response time) kontrolü yapar
- GET ve POST isteklerini test eder
- Test otomasyon best practice yapısını uygular

---

## 🤖 Yapay Zeka Destekli Geliştirme Yaklaşımı

Bu projede test senaryolarının tasarlanması ve geliştirilmesi sürecinde **yapay zeka destekli yazılım geliştirme yaklaşımı** kullanılmıştır.

Bu kapsamda:

- Test senaryolarının tasarımında API davranış analizi için AI destekli fikir üretimi kullanılmıştır
- Assertion (doğrulama) noktalarının belirlenmesinde test kapsamı genişletilmiştir
- Edge-case (negatif senaryolar) analizi yapılırken yapay zeka destekli önerilerden faydalanılmıştır
- REST API test yazımı ve framework mimarisi best practice’leri için rehberlik alınmıştır

Bu yaklaşım, test mühendisliği sürecini hızlandırmak ve daha kapsamlı bir test kapsama alanı oluşturmak için kullanılmıştır.

---

## Kullanılan API

Bu proje aşağıdaki mock bankacılık API üzerinde çalışmaktadır:

👉 https://api.mockbank.io/swagger-ui.html

###  API Özelliği

Bu API:

- Gerçek bir production database’e bağlı değildir
- Test ve demo amaçlı çalışır
- Bazı POST işlemleri veri tabanına kalıcı kayıt yapmaz
- Sadece API davranışlarını simüle eder

Bu nedenle proje, **gerçek sistem testinden ziyade API test otomasyonu pratiği** amacıyla tasarlanmıştır.

---

## ⚙️ Kullanılan Teknolojiler

- Java 17
- Maven
- Rest Assured 5.4.0
- TestNG / JUnit 5
- Jackson Databind
- SLF4J Logging
- Hamcrest Matchers

---

## 📁 Proje Mimarisi

Proje, yeniden kullanılabilir ve ölçeklenebilir bir test otomasyon framework yapısında tasarlanmıştır:

- **base layer:** Ortak test yapılandırmaları
- **specifications:** Request configuration (base URL, header vb.)
- **tests:** API test senaryoları
- **utils (opsiyonel):** Test data üretimi ve yardımcı sınıflar

Bu yapı sayesinde:

- Kod tekrarları azaltılmıştır
- Testler merkezi şekilde yönetilebilir hale getirilmiştir
- Framework büyümeye uygun hale getirilmiştir

---

## Test Senaryoları

### 👤 Customer Service (Müşteri Servisi)

✔ Müşteri listesi başarıyla çekiliyor mu?  
✔ HTTP status code doğru mu (200)?  
✔ Response time kabul edilebilir mi?  
✔ Veri bütünlüğü kontrol ediliyor mu?

---

### 🏦 Account Service (Hesap Servisi)

✔ Hesap listesi doğru şekilde geliyor mu?  
✔ Account number alanı mevcut mu?  
✔ Balance bilgisi doğru formatta mı?  
✔ API response başarılı mı?

---

### 💸 Transaction Service (İşlem Servisi)

✔ Transaction listesi geliyor mu?  
✔ Amount bilgisi doğru mu?  
✔ Transaction type doğru mu?  
✔ Response time performans sınırında mı?

---

### ➕ Create Customer (POST Test Senaryosu)

✔ JSON request body gönderimi test edilir  
✔ POST request doğru çalışıyor mu kontrol edilir  
✔ Status code doğrulanır  
✔ API request-response akışı test edilir  

📌 Not: API mock olduğu için veriler kalıcı değildir.

---

## 📊 Doğrulama (Assertion) Mantığı

- Status Code Validation → API doğru çalışıyor mu?
- Response Body Validation → Veri doğru mu geliyor?
- Response Time Validation → Performans uygun mu?

---

## Proje Yaklaşımı (Framework Mantığı)

Bu proje sadece test yazımı değil, aynı zamanda:

✔ Test Automation Framework tasarımı  
✔ Reusable (tekrar kullanılabilir) yapı  
✔ Clean code prensipleri  
✔ Regression test mantığı  
✔ API validation stratejisi  

içermektedir.

---

