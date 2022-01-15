package jp.ac.uryukyu.ie.e215716;
import java.util.*;
public class Kotu implements Mentu {
    private Map<String, Integer> hai;
    private int count =0;
    private int count2 =0;
    private int countKotu = 0;

    public Map<String, Integer> getHai() {
        return hai;
    }

    public Kotu(){
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
                    if(count==3){
                        count2+=1;
                        if(count2==3){
                            count2=0;
                            countKotu+=1;
                        }                        
                    }
                }
            }         
        }
        System.out.println("刻子が"+countKotu+"通りあります");
    }
}
