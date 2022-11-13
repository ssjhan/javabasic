package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class idolDancer extends Dancer {


    public idolDancer(String crew, Grade grade, String myName) {
        super(crew, grade, myName); // super은 생성자 구문의 첫번째로 와야 함.
    }
    @Override
    public void dance(){
//        super.dance();
        System.out.println("윙크를 갈깁니다~");
    }
}
