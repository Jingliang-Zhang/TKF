package com.tkf.framework;

import java.util.List;

public class Player {
    private int hp;
    private int maxHp;
    private int armor;
    private int attackRange;
    private boolean isDead;
    private List<Card> handCards;
    private List<Card> equipCards;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public List<Card> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<Card> handCards) {
        this.handCards = handCards;
    }

    public List<Card> getEquipCards() {
        return equipCards;
    }

    public void setEquipCards(List<Card> equipCards) {
        this.equipCards = equipCards;
    }

    public List<Card> getCardPool() {
        return cardPool;
    }

    public void setCardPool(List<Card> cardPool) {
        this.cardPool = cardPool;
    }

    private List<Card> cardPool;

    // 玩家的行动：出牌、使用技能、摸牌等
    public void action() {
        // 玩家的行动包括：出牌、使用技能、摸牌等
        while (true) {
            // 显示玩家手牌和可使用的技能
            this.displayActionOptions();

            // 等待玩家操作
            int option = this.waitPlayerAction();

            // 处理玩家操作
            switch (option) {
                case 1:
                    // 出牌
                    this.playCard();
                    break;
                case 2:
                    // 使用技能
                    this.useSkill();
                    break;
                case 3:
                    // 摸牌
                    this.drawCard(2);
                    break;
                case 4:
                    // 结束行动
                    return;
                default:
                    // 无效操作
                    break;
            }
        }
    }

    // 玩家受到伤害，扣除血量
    public void takeDamage(int damage) {
        // TODO: 实现玩家扣血方法
    }

    // 玩家装备卡牌
    public void equipCard(Card card) {
        // TODO: 实现玩家装备卡牌的方法
    }

    // 玩家使用卡牌
    public void useCard(Card card) {
        // TODO: 实现玩家使用卡牌的方法
    }

    // 玩家选择目标角色
    public Player chooseTarget() {
        // TODO: 实现玩家选择目标角色的方法
        return null;
    }



    private void displayActionOptions() {
        // 显示出牌选项
        System.out.println("请选择行动：");
        System.out.println("1. 出牌");
        System.out.println("2. 使用技能");
        System.out.println("3. 摸牌");
        System.out.println("4. 结束行动");
    }

    private int waitPlayerAction() {
        // TODO: 等待玩家操作，例如使用Scanner获取控制台输入
        return 0;
    }

    private void playCard() {
        // 显示手牌
        System.out.println("请选择出牌：");
        for (int i = 0; i < this.handCards.size(); i++) {
            System.out.println((i + 1) + ". " + this.handCards.get(i).getName());
        }

        // 等待玩家选择出牌
        int index = this.waitPlayerAction();
        if (index < 1 || index > this.handCards.size()) {
            // 无效选择
            return;
        }

        // 出牌
        Card card = this.handCards.get(index - 1);
        this.handCards.remove(card);
        card.effect();
    }

    private void useSkill() {
        // TODO: 使用技能的代码
    }

    private void drawCard(int num) {
        // 从卡牌池中抽取num张卡牌，加入玩家手牌
        for (int i = 0; i < num; i++) {
            Card card = this.cardPool.get(0);
            this.cardPool.remove(card);
            this.handCards.add(card);
        }
    }
}