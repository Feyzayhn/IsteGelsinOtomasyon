@negatifTest
Feature:Iste gelsin login olup sepete urun ekleme
  Scenario: Iste gelsin login olup sepete urun ekleme
    Given Kullanici "url" gider
    When Kullanici Giris yap veya Uye ol butonunun gorunur oldugunu dogrular ve butona  tiklar
    Then Kullanici hoş geldin ve sms onayi metninin gorunur oldugunu dogrular
    Then Kullanici telefon numarasi alaninin "+90 " olarak default geldigini dogrular
    When Kullanici gecersiz telefon numarasi girer ve devam et butonuna tiklar
    Then Kullanici "Geçersiz telefon numarası." mesajinin geldigini dogrular