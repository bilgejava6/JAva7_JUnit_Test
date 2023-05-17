package com.muhammet;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test005_Sirali_Test {

    @Test
    @Order(1)
    void siraliTest2(){
        System.out.println("Sirali Test 2");
    }

    @Test
    @Order(2)
    void siraliTest3(){
        System.out.println("Sirali Test 3");
    }

    @Test
    @Order(3)
    void siraliTest1(){
        System.out.println("Sirali Test 1");
    }

}
