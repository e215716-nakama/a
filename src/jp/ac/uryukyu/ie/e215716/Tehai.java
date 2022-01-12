package jp.ac.uryukyu.ie.e215716;

import java.util.ArrayList;

public class Tehai {
    private String name;
    private ArrayList<Hai> hai;

    public String getName() {
        return name;
    }
    
    public ArrayList<Hai> getHai() {
        return hai;
    }

    public Tehai(String name){
        this.name = name;
        hai = new ArrayList<>();
    }

    public void tehaisuu(){
        if(hai.size()==14){
            System.out.println("手牌の数は正しいです");
        }else{
            System.out.println("手配の数が正しくありません");
        }
    }

    public void printTehai(){
        for(var m : hai){
            System.out.print(m.getName() + ",");
        }
    }
}
