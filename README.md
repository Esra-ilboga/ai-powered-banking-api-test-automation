# 📌 Fake REST API Test Automation Project

## 🧪 Proje Açıklaması

Bu proje, **Java + Maven + Rest Assured + TestNG/JUnit** kullanılarak geliştirilmiş bir **API Test Otomasyon Framework’üdür**.

Amaç, bir **bankacılık sistemi API’si** üzerinde gerçek bir yazılım test mühendisi yaklaşımıyla **regresyon test senaryoları oluşturmak ve API davranışlarını doğrulamaktır.**

Bu kapsamda sistem:

- HTTP isteklerinin doğru çalışıp çalışmadığını kontrol eder
- API response’larının doğruluğunu doğrular
- Performans (response time) kontrolü yapar
- GET ve POST isteklerini test eder
- Test otomasyon best practice yapısını uygular

---

## 🏦 Kullanılan API

Bu proje aşağıdaki mock bankacılık API üzerinde çalışmaktadır:

👉 https://api.mockbank.io/swagger-ui.html

### 📌 API Özelliği

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

## 🚀 Test Senaryoları

### 👤 Customer Service (Müşteri Servisi)

Bu test grubu, sistemdeki müşteri listesini doğrular.

✔ Müşteri listesi başarıyla çekiliyor mu?  
✔ API doğru HTTP status code (200) dönüyor mu?  
✔ Response süresi kabul edilebilir mi?  
✔ Dönen müşteri verisi boş veya hatalı mı?

📌 Amaç:
Müşteri servisinin stabil çalıştığını ve veri döndüğünü doğrulamak.

---

### 🏦 Account Service (Hesap Servisi)

Bu testler, banka hesap bilgilerinin doğruluğunu kontrol eder.

✔ Hesap listesi başarılı şekilde geliyor mu?  
✔ Account number alanı mevcut mu?  
✔ Balance (bakiye) bilgisi doğru formatta mı?  
✔ API response başarılı mı?

📌 Amaç:
Finansal verilerin API üzerinden doğru ve tutarlı şekilde döndüğünü doğrulamak.

---

### 💸 Transaction Service (İşlem Servisi)

Bu testler finansal işlem kayıtlarını doğrular.

✔ Transaction listesi geliyor mu?  
✔ Amount (tutar) bilgisi mevcut mu?  
✔ Transaction type (debit/credit) doğru mu?  
✔ Response time performans sınırında mı?

📌 Amaç:
Bankacılık işlemlerinin API üzerinden doğru şekilde sunulduğunu test etmek.

---

### ➕ Create Customer (POST Test Senaryosu)

Bu test senaryosu, API’ye veri gönderme işlemini simüle eder.

✔ JSON request body gönderilir  
✔ POST request doğru şekilde çalışıyor mu kontrol edilir  
✔ Status code doğrulanır  
✔ Request-response akışı test edilir

📌 Önemli Not:
Bu API mock olduğu için gönderilen veriler **kalıcı olarak kaydedilmez**.  
Bu testin amacı veri oluşturmak değil, **POST request mekanizmasını test etmektir.**

---

## 📊 Doğrulama (Assertion) Mantığı

Bu projede üç temel doğrulama yapılır:

- **Status Code Validation:** API başarılı çalışıyor mu?
- **Response Body Validation:** Dönen veri doğru mu?
- **Response Time Validation:** API performansı yeterli mi?

---

## 🧠 Proje Yaklaşımı (Framework Mantığı)

Bu proje sadece test yazımı değil, aynı zamanda:

✔ Test Automation Framework tasarımı  
✔ Reusable (tekrar kullanılabilir) yapı  
✔ Clean code prensipleri  
✔ Regression test mantığı  
✔ API validation stratejisi

içermektedir.

---

## 🧪 Testleri Çalıştırma

Proje Maven üzerinden çalıştırılır:

```bash
mvn clean test