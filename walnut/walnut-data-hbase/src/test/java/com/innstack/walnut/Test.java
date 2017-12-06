package com.innstack.walnut;

import com.innstack.walnut.data.hbase.demo.Info;

public class Test {

    public static void main(String args[]) {
        Info<String> i1 = new Info<String>();      // 泛型类型为String
        i1.getVar();
    }
}
