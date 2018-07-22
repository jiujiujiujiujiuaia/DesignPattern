package com.company.PatternDesign.facade_factory_strategy;

public class ManageStrategy {
    private Strategy strategy;

    public void changeStategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void excute(){
        this.strategy.doAction();
    }
}
