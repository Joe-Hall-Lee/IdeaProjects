package com.xyq.jicheng;

public class Test {
    public static void main(String[] args) {

        HeiXiongGuai hx = new HeiXiongGuai();
        hx.name = "大黑熊";
        System.out.println(hx.name);

        hx.chiRen();
        hx.tou();
        // hx.pasi(); // 私有的内容是不能继承的
    }
}