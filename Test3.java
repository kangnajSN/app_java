package com.ddxoft;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import com.ddxoft.utils.Custom;
import com.ddxoft.utils.Key;
import com.ddxoft.utils.Point;
import com.xnx3.microsoft.Com;
import com.xnx3.microsoft.Window;
import com.xnx3.robot.Robot;
import com.xnx3.robot.support.CoordBean;


public class Test3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*Point point = Custom.findImg("./res/subImg.PNG");

        Custom.move(point.getX(), point.getY());*/

        Custom.run("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        Custom.sleep(Custom.delay(500, 1000));
        Custom.setSystemClipboard("Https:www.baidu.com", true);
        Custom.sleep(Custom.delay(500, 1000));
        Custom.key(Key.enter);
        Custom.sleep(Custom.delay(500, 1000));
        Custom.setSystemClipboard("Java 真是好好滴", true);
        Custom.sleep(Custom.delay());
        Custom.key(Key.enter);
        Custom.sleep(Custom.delay(500, 1000));
        Point point = Custom.findImg("./res/test.PNG");
        Custom.move(point.getX(), point.getY());
        Custom.sleep(Custom.delay());
        Custom.clickLeft();

    }





}