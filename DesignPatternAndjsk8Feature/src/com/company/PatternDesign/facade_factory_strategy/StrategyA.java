package com.company.PatternDesign.facade_factory_strategy;

public class StrategyA implements Strategy {
    @Override
    public void doAction(){
            System.out.println("this is a A strategy");
    }
}
