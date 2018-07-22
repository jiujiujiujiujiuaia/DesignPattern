package com.company;

import com.company.PatternDesign.builder.Builder;
import com.company.PatternDesign.facade.FacadeInterface;
import com.company.PatternDesign.facade_factory_strategy.Facade;
import com.sun.prism.impl.BaseMesh;

public class Main {

    public static void main(String[] args) {


//----------------builder---------------
//        Builder builder = new Builder("A");
//        System.out.print("\n");
//        Builder builder1 = new Builder("B");

//----------------facade----------------
//        FacadeInterface facadeInterface = new FacadeInterface();
//        facadeInterface.doAction();

//---------------facade-factory-strategy------------
        Facade facade = new Facade();
        facade.interfa("B");
        facade.interfa("A");

    }
}
