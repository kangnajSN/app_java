package com.ddxoft;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;


public class Test {
    public static void main(String[] args) {

         // 第一个参数是Windows窗体的窗体类，第二个参数是窗体的标题。不熟悉windows编程的需要先找一些Windows窗体数据结构的知识来看看，
        WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "QQ");
        if (hwnd == null) {
            System.out.println("QQ is not running");
        }else{
            User32.INSTANCE.ShowWindow(hwnd, 1);        // SW_RESTORE
            User32.INSTANCE.SetForegroundWindow(hwnd);   // bring to front

            //User32.INSTANCE.GetForegroundWindow() //获取现在前台窗口
            WinDef.RECT qqwin_rect = new  WinDef.RECT();
            User32.INSTANCE.GetWindowRect(hwnd, qqwin_rect);
            int qqwin_width = qqwin_rect.right-qqwin_rect.left;
            int qqwin_height = qqwin_rect.bottom-qqwin_rect.top;

            User32.INSTANCE.MoveWindow(hwnd, 0, 0, qqwin_width, qqwin_height, true);
            User32.INSTANCE.PostMessage(hwnd, WinUser.WM_CLOSE, null, null);  // can be WM_QUIT in some occasio
        }

    }


}