package jp.ac.uryukyu.ie.e215716;


public class Main{
    public static void main(String[] args) {
        Tehai myTehai = new Tehai("私");
        myTehai.addTehai("i-wan", 1);
        myTehai.addTehai("ryan-wan", 2);
        myTehai.addTehai("san-wan", 3);
        myTehai.printTehai();
        myTehai.tehaisuu2();
        
        Syuntu syuntu = new Syuntu();
        syuntu.getHai().put("i-wan", 2);
        syuntu.getHai().put("ryan-wan", 1);
        syuntu.getHai().put("san-wan", 3);
        syuntu.getHai().put("an-wan", 4);
        syuntu.getHai().put("n-wan", 5);
        syuntu.getHai().put("-wan", 6);
        System.out.println(syuntu.getHai());
        syuntu.countMentu(syuntu.getHai());

        Kotu kotu = new Kotu();
        kotu.getHai().put("i-wan", 1);
        kotu.getHai().put("ryan-wan",1);
        kotu.getHai().put("san-wan", 1);
        kotu.getHai().put("an-wan", 1);
        kotu.getHai().put("-wan", 1);
        kotu.getHai().put("n-wan", 1);
        System.out.println(kotu.getHai());
        kotu.countMentu(kotu.getHai());

        Zyantou zyantou = new Zyantou();
        zyantou.getHai().put("i-wan", 0);
        zyantou.getHai().put("ryan-wan",0);
        zyantou.getHai().put("san-wan", 0);
        zyantou.getHai().put("an-wan", 2);
        zyantou.getHai().put("-wan", 0);
        zyantou.getHai().put("n-wan", 2);
        System.out.println(zyantou.getHai());
        zyantou.countMentu(zyantou.getHai());
    }
}