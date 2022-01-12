package jp.ac.uryukyu.ie.e215716;



public class Main{
    public static void main(String[] args) {
        var hai1 = new Hai("一萬", 1);
        var hai2 = new Hai("ニ萬", 2);
        var tehaiMy = new Tehai("南家");
        tehaiMy.getHai().add(hai1);
        tehaiMy.getHai().add(hai2);
        tehaiMy.tehaisuu();
        tehaiMy.printTehai();
    }
}