package com.company.PatternDesign.facade;

public class FacadeOp {

    public void guahao(){

        System.out.print("挂号\n");
        keshi();
    }
    public void keshi(){

        System.out.print("找到就诊科室\n");
        jiaofei();
    }
    public void jiaofei(){

        System.out.print("缴费\n");
        quyao();
    }
    public void quyao(){
        System.out.print("取药\n");
    }
}
