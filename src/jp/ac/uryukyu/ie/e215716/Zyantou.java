package jp.ac.uryukyu.ie.e215716;

import java.util.*;
public class Zyantou implements Mentu {
    private Map<String, Integer> hai;
    private int count =0;
    private int count2 =0;
    private int countZyantou = 0;

    public Map<String, Integer> getHai() {
        return hai;
    }

    public Zyantou(){
        hai = new HashMap<>();
    }

    @Override
    public void countMentu(Map<String,Integer> hai){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : hai.values()){
            list.add(i);
        }
        for(int j: list){
            count=0;
            for(int k=0;k<list.size();k++){
                if(j==list.get(k)){
                    count +=1;
                    if(count==2){
                        
                        count2+=1;
                        if(count2==2){
                            count2=0;
                            countZyantou+=1;
                        }                        
                    }
                }
            }         
        }
        System.out.println("雀頭が"+countZyantou+"通りあります");
    }
}