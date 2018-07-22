package com.company.PatternDesign.builder;

class Chicken implements Food{
    @Override
    public String name(){
        return "炸鸡";
    }
    @Override
    public int price(){
        return 2;
    }
}

class Burger implements  Food{
    @Override
    public String name(){
        return "巨无霸汉堡";
    }
    public int price(){
        return 1;
    }
}


public interface Food {

    public String name();

    public int price();

}
