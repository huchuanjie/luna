package com.example.demo;

import java.awt.Frame;

public class FrameTest {
    public static void main(String[] args) {

        Frame frame = new Frame("测试窗口");
        /*frame.setBackground();
        frame.setExtendedState();
        frame.setIconImage();
        frame.setMaximizedBounds();
        frame.setMenuBar();
        frame.setOpacity();
        frame.setResizable();
        frame.setShape();
        frame.setState();
        frame.setTitle();
        frame.setUndecorated();
        frame.setAlwaysOnTop();
        frame.setAutoRequestFocus();
        frame.setBounds();
        frame.setComponentOrientation();
        frame.setComponentZOrder();
        frame.setCursor();
        frame.setDropTarget();
        frame.setEnabled();
        frame.setFocusable();
        frame.setFocusableWindowState();
        frame.setFocusCycleRoot();
        frame.setFocusTraversalKeys();
        frame.setFocusTraversalKeysEnabled();
        frame.setFocusTraversalPolicy();
        frame.setFocusTraversalPolicyProvider();
        frame.setFont();
        frame.setForeground();
        frame.setIconImages();
        frame.setIgnoreRepaint();
        frame.setLayout();
        frame.setLocale();
        frame.setLocationByPlatform();
        frame.setLocationRelativeTo();
        frame.setMaximumSize();
        frame.setMinimumSize();
        frame.setModalExclusionType();
        frame.setName();
        frame.setPreferredSize();
        frame.setType();*/
        //设置窗口的位置
        frame.setLocation(30, 30);
        //设置窗口的大小
        frame.setSize(250, 200);
        //将窗口显示出来（默认隐藏）
        frame.setVisible(true);
    }
}
