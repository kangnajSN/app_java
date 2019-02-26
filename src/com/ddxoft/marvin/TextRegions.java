package com.ddxoft.marvin;

import java.awt.Color;
import java.util.List;

import marvin.image.MarvinImage;
import marvin.image.MarvinSegment;
import marvin.io.MarvinImageIO;

import static marvin.MarvinPluginCollection.*;

public class TextRegions{

    public TextRegions(){
        MarvinImage image = MarvinImageIO.loadImage("./res/passport.png");
        image = findText(image, 15, 8, 30, 150);
        MarvinImageIO.saveImage(image, "./res/passport_out.png");
        image = MarvinImageIO.loadImage("./res/road_sign2.jpg");
        image = findText(image, 10, 20, 70, 200);
        MarvinImageIO.saveImage(image, "./res/road_sign2_out.png");
    }

    public MarvinImage findText(MarvinImage image, int maxWhiteSpace, int maxFontLineWidth, int minTextWidth, int grayScaleThreshold){
        List<MarvinSegment> segments = findTextRegions(image, maxWhiteSpace, maxFontLineWidth, minTextWidth, grayScaleThreshold);
        for(MarvinSegment s:segments){
            if(s.height >= 5){
                s.y1-=5;
                s.y2+=5;
                image.drawRect(s.x1, s.y1, s.x2-s.x1, s.y2-s.y1, Color.red);
                image.drawRect(s.x1+1, s.y1+1, (s.x2-s.x1)-2, (s.y2-s.y1)-2, Color.red);
            }
        }
        return image;
    }

    public static void main(String[] args) {
        new TextRegions();
    }
}
