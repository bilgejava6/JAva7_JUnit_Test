package com.muhammet;

import com.muhammet.enums.Cinsiyet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Test006_Parametre_Girilebilir_test {

    /**
     * Bir test işleminde paremetreler ihtiyaç duyulabilir.
     * bunları elle girebilir ya da belli dökümanlardan temin ederek
     * işleyebiliriz.
     * Buralarda girilen değerler bir dizi şeklinde ilgili method a geçilir ve
     * test işlemi girilen her bir değer için ayrı ayrı çalıştırılır.
     * @param username
     */

    @ParameterizedTest
    @ValueSource(strings = {"Muhammet"})
    void parametreli_Test1_Login_Page(String username){
        System.out.println("Parametreli Test 1....: "+ username );
    }

    @ParameterizedTest
    @ValueSource(strings = {"Muhammet","Ahmet","Mehmet","Ali","Veli"})
    void parametreli_Test1_Coklu_Parametreler(String username){
        System.out.println("Parametreli Test 1....: "+ username );
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void integer_Parameters(int sayi){
        Assertions.assertTrue(sayi % 2 == 1,"Sayı çift sayı olamaz");

    }

    @ParameterizedTest
    @EnumSource(names = {"ERKEK","KADIN"})
    void cinsiyet_Enum_Test(Cinsiyet cinsiyet){
        Assertions.assertTrue(cinsiyet == Cinsiyet.KADIN,"Cinsiyet Kadın Olmalıdır");
    }
    @ParameterizedTest
    @CsvSource({
            "Admin, 12345",
            "Muhammet, root",
            "Deniz, 5353"
    })
    void test_Login(String username, String password){
        Assertions.assertTrue(username.equals("Admin") && password.equals("12345"),
                "Kullanıcı adı ya da şifre hatalıdır");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/login.csv")
    void test_Login_File(String username, String password){
        Assertions.assertTrue(username.equals("root") && password.equals("root"),
                "Kullanıcı adı ya da şifre hatalıdır");
    }




}
