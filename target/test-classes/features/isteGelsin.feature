@test01
  Feature:Iste gelsin login olup sepete urun ekleme
    Scenario: Iste gelsin login olup sepete urun ekleme
      Given Kullanici "url" gider
      Then Kullanici Giris yap veya Uye ol butonunun gorunur oldugunu dogrular ve butona  tiklar
      Then Kullanici hoş geldin ve sms onayi metninin gorunur oldugunu dogrular
      Then Kullanici telefon numarasi alaninin "+90 " olarak default geldigini dogrular
      Then Kullanici telefon  numarasini girer ve devam et butonuna tiklar
      Then Kullanici otp ekraninin açıldigini dogrular ve otp dogru girilir
      Then Kullanici alisverise basla butonuna tiklar
      Then Kullanici arama kutusuna istedigi bir urun ismini girer
      Then Kullanici onerilen siralamalardan fiyati artana gore secenegini secer
      And  Kullanici fiyati en dusuk olan urunu sepete ekler ve sepete ekledigini dogrular
