package com.company.PatternDesign.facade_factory_strategy;

public class Factory {

    public static Strategy newInstance(String type){

        switch(type)
        {
            case "A":return new StrategyA();
            case "B":return new StrategyB();
            case "C":return new StrategyC();
            default:return null;
        }
    }

}
