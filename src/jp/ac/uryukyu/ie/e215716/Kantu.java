package jp.ac.uryukyu.ie.e215716;
import java.util.*;
public class Kantu implements Mentu {
    private Map<String, Integer> hai;
    private int count =0;
    private int count2 =0;
    private int countKantu = 0;

    public Map<String, Integer> getHai() {
        return hai;
    }

    public Kantu(){
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
                    if(count==4){
                        count=0;
                        count2+=1;
                        if(count2==4){
                            count2=0;
                            countKantu+=1;
                        }                        
                    }
                }
            }         
        }
        System.out.println("槓子が"+countKantu+"通りあります");
    }
}