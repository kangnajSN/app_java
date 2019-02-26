package com.ddxoft;

import java.util.Random;

public class Custom {

    // Custom.sleep(Custom.delay()); 添加延时 、 模拟手动点击

    /**
     * 鼠标左键点击(包含按下、放开)
     */
    public static void clickLeft(){
        DD.INSTANCE.DD_btn(1);
        sleep(delay());
        DD.INSTANCE.DD_btn(2);
        sleep(delay());
    }
    /**
     * 鼠标右键点击(包含按下、放开)
     */
    public static void clickRight(){
        DD.INSTANCE.DD_btn(4);
        sleep(delay());
        DD.INSTANCE.DD_btn(8);
        sleep(delay());
    }

    /**
     * 鼠标绝对移动
     * @param x 屏幕的x轴
     * @param y 屏幕的y轴
     */
    public static void move(int x, int y){
        DD.INSTANCE.DD_mov(x,y) ;
    }

    /**
     * 鼠标相对移动
     * @param x 屏幕的x轴
     * @param y 屏幕的y轴
     */
    public static void moveR(int x, int y){
        DD.INSTANCE.DD_movR(x,y) ;
    }

    /**
     * 模拟鼠标滚轮
     * @param around 向前滚还是向后 1:向前 2:向后
     * @param count 滚动的次数
     */
    public static void whi(int around, int count){
        for (int i = 0; i < count; i++) {
            DD.INSTANCE.DD_whl(around);
            // 添加延迟
            sleep(delay());
        }
    }

    /**
     * 键盘按键 (包含按下与松开)
     * @param key 虚拟码、参照Key类
     */
    public static void key(int key){
        DD.INSTANCE.DD_key(key, 1);
        // 添加延迟
        sleep(delay());
        DD.INSTANCE.DD_key(key, 2);
        sleep(delay());
    }

    /**
     * 连续按下键盘多个键 (包含按下与松开)
     * @param keys
     */
    public static void groupKey(int...keys){
        // 按下
        for (int i = 0; i < keys.length; i++) {
            DD.INSTANCE.DD_key(keys[i], 1);
        }
        sleep(delay());
        // 松开
        for (int i = keys.length - 1; i >= 0; i--) {
            DD.INSTANCE.DD_key(keys[i], 2);
        }
    }


    /**
     * 获取延时随机数
     * @return
     */
    public static long delay(){
        return new Random().nextInt(200) + 100;
    }

    /**
     * 延时
     * @param delay
     */
    public static void sleep(long delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ignored) {
        }
    }


}