package com.ddxoft;

public class DDTest {
	 public static void main(String[] args) {
		 System.out.println("测试开始");
		 
		 //DD.INSTANCE.DD_mov(500, 500);   //绝对移动
		 DD.INSTANCE.DD_movR(100, 100); //相对移动
		 //DD.INSTANCE.DD_btn(4);DD.INSTANCE.DD_btn(8); //鼠标右键
		 //DD.INSTANCE.DD_key(601, 1);DD.INSTANCE.DD_key(601, 2); //键盘win
		 //DD.INSTANCE.DD_str("123@AbC"); //字符串
	 }
	 
}
