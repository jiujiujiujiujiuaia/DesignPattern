package com.company.PatternDesign.facade_factory_strategy;


public class Facade {
    private ManageStrategy manageStrategy = new ManageStrategy();

    public void interfa(String type){
        this.manageStrategy.changeStategy(Factory.newInstance(type));
        this.manageStrategy.excute();
    }


}
