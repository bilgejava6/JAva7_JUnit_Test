package com.muhammet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Test002_DisplayName {

    @Test
    @DisplayName("Tüm Kullanıcıları kısıt olmadan getir.")
    void findAll(){
        System.out.println("Tüm Kullanıcıları getir. standart kullanıcı");
    }
    @Test
    @DisplayName("Tipine göre tüm kullanıcıları getir.")
    void findAll(String userType){
        System.out.println("Tüm Kullanıcıları getir. kullanıcı tipine göre ");
    }

    @Test
    @DisplayName("😱")
    void EmojiTest(){
        System.out.println("Emoji Test");
    }

    @Nested
    class IcClassOrnek{

        @Test
        @DisplayName("Ic Sinif Method Denemesi")
        void icMethod(){
            System.out.println("Nested Class içindeki method");
        }
    }

}
