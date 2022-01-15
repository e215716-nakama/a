package jp.ac.uryukyu.ie.e215716;
import java.util.*;

public class Syuntu implements Mentu {
    private Map<String, Integer> hai;
    private int countSyuntu =0;

    public Map<String, Integer> getHai() {
        return hai;
    }

    public Syuntu(){
        hai = new HashMap<>();
    }

    @Override
    public void countMentu(Map<String,Integer> hai){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : hai.values()){
            list.add(i);
        }
        for(int j: list){
            for(int k=0;k<list.size();k++){
                if(j+1==list.get(k)){
                    for(int l=0;l<list.size();l++){
                        if(j+2==list.get(l)){
                            countSyuntu+=1;                           
                        }
                    }
                }
            }
        }
        System.out.println("順子が"+countSyuntu+"通りあります");
    }
}

