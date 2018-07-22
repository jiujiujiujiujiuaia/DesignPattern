package com.company.PatternDesign.builder;

public class Builder {

    public Builder(String type){
        switch (type){
            case "A":typeA();break;
            case "B":typeB();break;
            default:break;
        }
    }

    public void typeA(){
        Chicken chicken = new Chicken();
        Cock cock = new Cock();
        System.out.print("A:\n "+"name:"+chicken.name()+" price :" + chicken.price());
        System.out.print(" \n "+"name: "+cock.name()+" price " +cock.price());
    }

    public void typeB(){
        Burger burger = new Burger();
        Paisei paisei = new Paisei();
        System.out.print("B:\n "+"name:"+burger.name()+" price :" + burger.price());
        System.out.print("  \n"+"name: "+paisei.name()+" price " +paisei.price());
    }

}
