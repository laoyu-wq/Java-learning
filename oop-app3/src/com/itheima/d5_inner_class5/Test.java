package com.itheima.d5_inner_class5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        // GUI编程
        // 1、创建窗口
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        win.add(btn);

//        // 给按钮绑定单击事件监听器
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(win,"登陆一下");
//            }
//        });
        // 最终简化
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"登陆一下"));

        win.setSize(400,400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);


    }
}
