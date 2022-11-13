package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class streetDancer extends Dancer {

    public streetDancer(String crew, Grade grade, String myName) {
        super(crew, grade, myName); // super은 생성자 구문의 첫번째로 와야 함.
    }

    @Override
    public void dance() {
        System.out.println("빙글빙글 돌면서 춤을 춥니다.");
    }
}
