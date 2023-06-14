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
        this.setTitle("三国杀");

        // 添加菜单栏
        this.menuBar = new JMenuBar();
        this.gameMenu = new JMenu("游戏");
        this.menuBar.add(this.gameMenu);
        this.newGameMenuItem = new JMenuItem("新游戏");
        this.gameMenu.add(this.newGameMenuItem);
        this.setJMenuBar(this.menuBar);

        // 添加角色信息和卡牌展示
        this.hpLabel = new JLabel("血量：10/10");
        this.handCardsLabel = new JLabel("手牌：");
        this.equipCardsLabel = new JLabel("装备区：");
        this.handCardsPanel = new JPanel();
        this.equipCardsPanel = new JPanel();
        this.add(this.hpLabel, BorderLayout.NORTH);
        this.add(this.handCardsLabel, BorderLayout.WEST);
        this.add(this.equipCardsLabel, BorderLayout.EAST);
        this.add(this.handCardsPanel, BorderLayout.CENTER);
        this.add(this.equipCardsPanel, BorderLayout.SOUTH);

        // 添加操作按钮
        this.attackButton = new JButton("攻击");
        this.useCardButton = new JButton("出牌");
        this.endTurnButton = new JButton("结束回合");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.attackButton);
        buttonPanel.add(this.useCardButton);
        buttonPanel.add(this.endTurnButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // 显示窗口
        this.setVisible(true);
    }
}
