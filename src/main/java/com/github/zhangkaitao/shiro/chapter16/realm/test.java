package com.github.zhangkaitao.shiro.chapter16.realm;

/**
 * Created by dllo on 17/12/1.
 */
public class test{
    private int i = getValue();
    private int j = 10;
    int getValue(){
        return j;
    }

    public static void main(String[] args){
        System.out.print(new test().i);
    }
}
