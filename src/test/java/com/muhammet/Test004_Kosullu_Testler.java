package com.muhammet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;

import static  org.junit.jupiter.api.condition.OS.*;
public class Test004_Kosullu_Testler {
    /**
     * Belli bir koşulun olduğu durumlarda çalışması istenilen kodlar.
     */
    @Test
    @EnabledOnOs(MAC)
    void OS_turune_gore_Test_MAC(){
        System.out.println("OS_turune_gore_Test MacOS");
    }
    @Test
    @EnabledOnOs(WINDOWS)
    void OS_turune_gore_Test_Windows(){
        System.out.println("OS_turune_gore_Test_Windows");
    }

    /**
     * Burada kullanılan işletim sistemini ve aynı zamanda işlemci mimarisini belirterek verebiliriz.
     */
    @Test
    @EnabledOnOs(architectures = {"amd64","x86_64"}, value = LINUX)
    void islemci_Mimarisi(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void java_Surumune_Gore_Test_17(){
        System.out.println("java_Surumune_Gore_Test_17");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_20)
    void java_Surumune_Gore_Test_20(){
        System.out.println("java_Surumune_Gore_Test_20");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_17,JRE.JAVA_20})
    void java_Surumune_Gore_Test_17_20(){
        System.out.println("java_Surumune_Gore_Test_17_20");
    }


}
