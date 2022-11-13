package org.example.encap;

import org.example.inter.Danceable;

import static java.lang.System.*;

public abstract class Dancer implements Danceable {

    private String crew; // 팀의 이름

    Grade grade; //실력
    String myName; // 내 이름

    private double height; //키

//    public Dancer(){
//    }

    //싀프트 두번 생성자
    public Dancer(String crew, Grade grade, String myName) {
        this.crew = crew;
        this.grade = grade;
        this.myName = myName;
    }

    //스트레칭
    private void stretch(){
        out.println(myName + "이 몸을 풉니다.");
    }

    //유연성 연습
    private void moreFlexible(){
        out.println(myName + " 이 다리를 찢습니다.");
    }



    public void setHeight(double height) {
        if(height <=130 || height >= 250){
            this.height = 160;
            return;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "crew='" + crew + '\'' +
                ", grade=" + grade +
                ", myName='" + myName + '\'' +
                ", height=" + height +
                '}';
    }
}
