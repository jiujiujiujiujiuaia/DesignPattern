package com.company.PatternDesign.builder;

class Cock implements Drink{
    @Override
    public String name(){
        return "可口可乐" ;
    }
    @Override
    public int price(){
        return 1;
    }
}
class Paisei implements Drink{
    @Override
    public String name(){
        return "百事";
    }
    @Override
    public int price(){
        return 2;
    }

}



public interface Drink {

    public String name();

    public int price();
}
