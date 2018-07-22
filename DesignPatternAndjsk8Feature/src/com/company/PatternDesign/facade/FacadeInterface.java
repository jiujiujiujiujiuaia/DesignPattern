package com.company.PatternDesign.facade;

import sun.misc.FDBigInteger;

public class FacadeInterface {
    private FacadeOp facadeOp = new FacadeOp();

    public void doAction(){
        System.out.print("走进医院\n");
        this.facadeOp.guahao();
    }
}
