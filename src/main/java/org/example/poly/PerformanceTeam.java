package org.example.poly;


import java.util.ArrayList;
import java.util.List;

import org.example.encap.Dancer;


//공연팀
public class PerformanceTeam {

    private List<Dancer> dancers = new ArrayList<>(); // shift + f6


    public void addDancer(Dancer dancer){
        dancers.add(dancer);
        System.out.println(dancer + "가 추가됨");
    }



}
