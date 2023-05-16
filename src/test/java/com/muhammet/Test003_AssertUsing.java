package com.muhammet;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
public class Test003_AssertUsing {

    private final static Islemler islemler = new Islemler();
    @Test
    void standartAssertionsMethodsUsing(){
        /**
         * Herhangi aynı türdeki iki değerin eşit olup olmadığını kontrol eder.
         */
        assertEquals(15,islemler.topla(6,9));
        assertEquals(9,islemler.topla(6,3),
                "İki sayının toplanmasın ile ilgili sonuçları karşılaştırır. Burada hata olursa bu mesaj görüntülenir.");
        assertTrue(islemler.topla(5,6) == 11);
        assertTrue(islemler.topla(5,6) == 11, ()-> "Buraya birşeyler yazmak istedim.");
    }

    @Test
    void groupedAssertions(){
        /**
         * Bir grup assertion'ı tek bir assertion olarak çalıştırır.
         */
        assertAll("İşlemler",
                ()-> assertEquals(15,islemler.topla(6,9)),
                ()-> assertEquals(9,islemler.topla(6,3)),
                ()-> assertTrue(islemler.topla(5,6) == 11),
                ()-> assertTrue(islemler.topla(5,6) == 11, ()-> "Buraya birşeyler yazmak istedim.")
        );
    }

    @Test
    void timeoutTest(){
        assertTimeout(Duration.ofSeconds(1),()->{
            System.out.println("İşlem Başladı");
            Thread.sleep(980);
            System.out.println("İşlem Bitti");
        });
    }
}
