package com.tkf.framework;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private List<Card> cardPool;
    private int currentPlayerIndex;
    private int turn;

    public Game() {
        // 初始化游戏
        this.init();
    }

    private void init() {
        // 初始化玩家
        this.players = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Player player = new Player();
            player.setHp(4);
            player.setMaxHp(4);
            player.setArmor(0);
            player.setAttackRange(1);
            player.setDead(false);
            player.setHandCards(new ArrayList<>());
            player.setEquipCards(new ArrayList<>());
            this.players.add(player);
        }

        // 初始化卡牌池
        this.cardPool = new ArrayList<>();
        // TODO: 添加卡牌

        // 初始化当前玩家和回合数
        this.currentPlayerIndex = 0;
        this.turn = 1;

        // 开始游戏
        this.start();
    }

    private void start() {
        while (!this.isGameOver()) {
            Player currentPlayer = this.players.get(this.currentPlayerIndex);

            // 发牌
            this.drawCard(currentPlayer, 2);

            // 玩家行动
            currentPlayer.action();

            // 结束回合
            this.endTurn();
        }

        // 游戏结束
        // TODO: 显示游戏结果
    }

    private void drawCard(Player player, int num) {
        // 从卡牌池中抽取num张卡牌，加入玩家手牌
        for (int i = 0; i < num; i++) {
            Card card = this.cardPool.get(0);
            this.cardPool.remove(0);
            player.getHandCards().add(card);
        }
    }

    private void endTurn() {
        // 从当前玩家后面开始，找到下一个未死亡的玩家
        int nextPlayerIndex = (this.currentPlayerIndex + 1) % this.players.size();
        while (nextPlayerIndex != this.currentPlayerIndex && this.players.get(nextPlayerIndex).isDead()) {
            nextPlayerIndex = (nextPlayerIndex + 1) % this.players.size();
        }

        // 如果没有未死亡的玩家，游戏结束
        if (nextPlayerIndex == this.currentPlayerIndex) {
            this.gameOver();
            return;
        }

        // 切换当前玩家
        this.currentPlayerIndex = nextPlayerIndex;
        this.turn++;
    }

    private void gameOver() {
        // TODO: 实现游戏结束
    }

    private boolean isGameOver() {
        // TODO: 判断游戏是否结束，例如只有一个玩家存活等条件
        return false;
    }
}