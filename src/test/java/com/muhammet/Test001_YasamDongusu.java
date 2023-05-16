package com.muhammet;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test001_YasamDongusu {

    @BeforeAll
    void initAll(){
        System.out.println("BeforeAll -> Bu kısım tüm herşeyden önce çalışacak kısımdır. Aslında constructor gibi düşünülebilir. ve 1 kere çalışır.");
    }

    @BeforeEach
    void init(){
        System.out.println("BeforeEach -> Bu kısım her test işleminden önce çalışacak kısımdır.");
    }

    @Test
    void testDemo(){
        System.out.println("Test demo");
    }

    @Test
    void testIslem(){
        int sayi1,sayi2;
        sayi1 = 6434;
        sayi2= 5;
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);
    }

    @Test
    void basarisizTestOrnegi(){
        Assertions.fail("Burada işlem başarısız olacak");
        System.out.println("başarısız işlemden sonra çalışacak kod var mı? ");
    }
    @Test
    @Disabled("kapatmak işstediğimiz tsetleri pasif hale getiriyoruz.")
    void testBellibirDurumicinKapatmak(){
        System.out.println("Bazen testleri tek tek işlemek istemeyebiliriz. tüm sistemi test etmek isteriz" +
                "ancak bazı test işlemlerinin bu işlem sırasında çalışmamasını isteyebiliriz. Bunun için test işleminin " +
                "kapatılması gerekebilir. Bunun için kullanılır. @Disabled");
    }
    @AfterEach
    void after(){
        System.out.println("AfterEach -> Her bir test işleminin çalışmasından sonra çalışacak olan methodtur.");
    }

    @AfterAll
    void afterAll(){
        System.out.println("AfterAll -> Tüm test işlemleri bittikten sonra çalışacak olan methodtur. 1 defa çalışır");
    }
}
