package com.tkf.framework;

public class Card {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    private String description;
    private CardType type;

    // 卡牌效果
    public void effect() {
        // TODO: 实现卡牌效果
    }
}
