package com.tkf.framework;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JMenuBar menuBar;
    private JMenu gameMenu;
    private JMenuItem newGameMenuItem;

    private JLabel hpLabel;
    private JLabel handCardsLabel;
    private JLabel equipCardsLabel;
    private JPanel handCardsPanel;
    private JPanel equipCardsPanel;

    private JButton attackButton;
    private JButton useCardButton;
    private JButton endTurnButton;

    public MainFrame() {
        // 初始化主界面
        this.init();
    }

    public void init() {
        // 设置窗口大小，标题等
        this.setSize(800, 600);
        this.setTitle("Three Kingdoms Fight");

        // 添加菜单栏
        this.menuBar = new JMenuBar();
        this.gameMenu = new JMenu("Game");
        this.menuBar.add(this.gameMenu);
        this.newGameMenuItem = new JMenuItem("New Game");
        this.gameMenu.add(this.newGameMenuItem);
        this.setJMenuBar(this.menuBar);

        // 添加角色信息和卡牌展示
        this.hpLabel = new JLabel("HP: 10/10");
        this.handCardsLabel = new JLabel("Hand Cards: ");
        this.equipCardsLabel = new JLabel("Equipment Area: ");
        this.handCardsPanel = new JPanel();
        this.equipCardsPanel = new JPanel();
        this.add(this.hpLabel, BorderLayout.NORTH);
        this.add(this.handCardsLabel, BorderLayout.WEST);
        this.add(this.equipCardsLabel, BorderLayout.EAST);
        this.add(this.handCardsPanel, BorderLayout.CENTER);
        this.add(this.equipCardsPanel, BorderLayout.SOUTH);

        // 添加操作按钮
        this.attackButton = new JButton("Attack");
        this.useCardButton = new JButton("Use Cards");
        this.endTurnButton = new JButton("End Turn");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.attackButton);
        buttonPanel.add(this.useCardButton);
        buttonPanel.add(this.endTurnButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // 显示窗口
        this.setVisible(true);
    }
}
