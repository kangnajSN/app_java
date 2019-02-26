package com.ddxoft;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        /*Custom.moveR(200, 200);
        Custom.sleep(Custom.delay());
        Custom.moveR(-100, -100);

        Custom.groupKey(Key.win, Key.k_d);*/


        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://www.baidu.com");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}