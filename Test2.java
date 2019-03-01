package com.ddxoft;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Test2 {

    public static void main(String[] args) throws UnsupportedEncodingException {


        String str = "你号";

        System.out.println(byteArrayToInt(str.getBytes()));


    }


    public static int byteArrayToInt(byte[] bytes) {
        System.out.println(bytes.length);
        return (bytes[0]&0xff)<<24
                | (bytes[1]&0xff)<<16
                | (bytes[2]&0xff)<<8
                | (bytes[3]&0xff);
    }




}