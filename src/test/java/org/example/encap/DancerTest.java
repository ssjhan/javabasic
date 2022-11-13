package org.example.encap;

import org.example.inherit.idolDancer;
import org.example.inherit.streetDancer;
import org.example.poly.PerformanceTeam;
import org.junit.jupiter.api.Test;

import java.sql.DatabaseMetaData;

import static org.junit.jupiter.api.Assertions.*;

class DancerTest {

    @Test
    void danceTest(){

//        Dancer dancer = new Dancer("서울짱크루", Grade.HIGH, "춤신춘왕");
        //싀프트 두번 생성자, ctrl + p 위에 생성자 매겨변수 값
        //ctrl + alt + v


//        dancer.dance();
////
////        dancer.setHeight(999);
////
////        System.out.println("dancer = " + dancer);

    }

    @Test
    void idolTest()
    {

        idolDancer idolDancer = new idolDancer("BTS",Grade.HIGH , "정국");

        idolDancer.dance();

       streetDancer d =  new streetDancer("울지로크루", Grade.MIDDLE, " 박춤꾼");
        d.dance();

        System.out.println();
    }

    @Test
    void teamTest(){
        PerformanceTeam team = new PerformanceTeam();

        idolDancer kim = new idolDancer("동방신기", Grade.HIGH, "영웅채중");

        streetDancer mokma = new streetDancer("말발굽",Grade.HIGH,"김목마");

        team.addDancer(kim);
        team.addDancer(mokma);


    }



}