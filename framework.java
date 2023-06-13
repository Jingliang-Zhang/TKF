public class Player {
    private int hp;
    private int maxHp;
    private int armor;
    private int attackRange;
    private boolean isDead;
    private List<Card> handCards;
    private List<Card> equipCards;
    
    // ��ҵ��ж������ơ�ʹ�ü��ܡ����Ƶ�
    public void action() {
        // TODO: ʵ������ж�����
    }
    
    // ����ܵ��˺����۳�Ѫ��
    public void takeDamage(int damage) {
        // TODO: ʵ����ҿ�Ѫ����
    }
    
    // ���װ������
    public void equipCard(Card card) {
        // TODO: ʵ�����װ�����Ƶķ���
    }
    
    // ���ʹ�ÿ���
    public void useCard(Card card) {
        // TODO: ʵ�����ʹ�ÿ��Ƶķ���
    }
    
    // ���ѡ��Ŀ���ɫ
    public Player chooseTarget() {
        // TODO: ʵ�����ѡ��Ŀ���ɫ�ķ���
    }
}

public class Card {
    private String name;
    private String description;
    private CardType type;
    
    // ����Ч��
    public void effect() {
        // TODO: ʵ�ֿ���Ч��
    }
}

public enum CardType {
    WEAPON, ARMOR, HORSE, SKILL, SHA,
}


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
        // ��ʼ��������
        this.init();
    }

    private void init() {
        // ���ô��ڴ�С�������
        this.setSize(800, 600);
        this.setTitle("����ɱ");

        // ��Ӳ˵���
        this.menuBar = new JMenuBar();
        this.gameMenu = new JMenu("��Ϸ");
        this.menuBar.add(this.gameMenu);
        this.newGameMenuItem = new JMenuItem("����Ϸ");
        this.gameMenu.add(this.newGameMenuItem);
        this.setJMenuBar(this.menuBar);

        // ��ӽ�ɫ��Ϣ�Ϳ���չʾ
        this.hpLabel = new JLabel("Ѫ����10/10");
        this.handCardsLabel = new JLabel("���ƣ�");
        this.equipCardsLabel = new JLabel("װ������");
        this.handCardsPanel = new JPanel();
        this.equipCardsPanel = new JPanel();
        this.add(this.hpLabel, BorderLayout.NORTH);
        this.add(this.handCardsLabel, BorderLayout.WEST);
        this.add(this.equipCardsLabel, BorderLayout.EAST);
        this.add(this.handCardsPanel, BorderLayout.CENTER);
        this.add(this.equipCardsPanel, BorderLayout.SOUTH);

        // ��Ӳ�����ť
        this.attackButton = new JButton("����");
        this.useCardButton = new JButton("����");
        this.endTurnButton = new JButton("�����غ�");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.attackButton);
        buttonPanel.add(this.useCardButton);
        buttonPanel.add(this.endTurnButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // ��ʾ����
        this.setVisible(true);
    }
}
public class Game {
    private List<Player> players;
    private List<Card> cardPool;
    private int currentPlayerIndex;
    private int turn;
    
    public Game() {
        // ��ʼ����Ϸ
        this.init();
    }
    
    private void init() {
        // ��ʼ�����
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
        
        // ��ʼ�����Ƴ�
        this.cardPool = new ArrayList<>();
        // TODO: ��ӿ���

        // ��ʼ����ǰ��Һͻغ���
        this.currentPlayerIndex = 0;
        this.turn = 1;
        
        // ��ʼ��Ϸ
        this.start();
    }
    
    private void start() {
        while (!this.isGameOver()) {
            Player currentPlayer = this.players.get(this.currentPlayerIndex);
            
            // ����
            this.drawCard(currentPlayer, 2);
            
            // ����ж�
            currentPlayer.action();
            
            // �����غ�
            this.endTurn();
        }
        
        // ��Ϸ����
        // TODO: ��ʾ��Ϸ���
    }
    
    private void drawCard(Player player, int num) {
        // �ӿ��Ƴ��г�ȡnum�ſ��ƣ������������
        for (int i = 0; i < num; i++) {
            Card card = this.cardPool.get(0);
            this.cardPool.remove(0);
            player.getHandCards().add(card);
        }
    }
    
    private void endTurn() {
        // �ӵ�ǰ��Һ��濪ʼ���ҵ���һ��δ���������
        int nextPlayerIndex = (this.currentPlayerIndex + 1) % this.players.size();
        while (nextPlayerIndex != this.currentPlayerIndex && this.players.get(nextPlayerIndex).isDead()) {
            nextPlayerIndex = (nextPlayerIndex + 1) % this.players.size();
        }
        
        // ���û��δ��������ң���Ϸ����
        if (nextPlayerIndex == this.currentPlay
// ���û��δ��������ң���Ϸ����
        if (nextPlayerIndex == this.currentPlayerIndex) {
            this.gameOver();
            return;
        }
        
        // �л���ǰ���
        this.currentPlayerIndex = nextPlayerIndex;
        this.turn++;
    }
    
    private void gameOver() {
        // TODO: ʵ����Ϸ����
    }
    
    private boolean isGameOver() {
        // TODO: �ж���Ϸ�Ƿ����������ֻ��һ����Ҵ�������
        return false;
    }
}
public class Player {
    // ...

    public void action() {
        // ��ҵ��ж����������ơ�ʹ�ü��ܡ����Ƶ�
        while (true) {
            // ��ʾ������ƺͿ�ʹ�õļ���
            this.displayActionOptions();
            
            // �ȴ���Ҳ���
            int option = this.waitPlayerAction();
            
            // ������Ҳ���
            switch (option) {
            case 1:
                // ����
                this.playCard();
                break;
            case 2:
                // ʹ�ü���
                this.useSkill();
                break;
            case 3:
                // ����
                this.drawCard(2);
                break;
            case 4:
                // �����ж�
                return;
            default:
                // ��Ч����
                break;
            }
        }
    }
    
    private void displayActionOptions() {
        // ��ʾ����ѡ��
        System.out.println("��ѡ���ж���");
        System.out.println("1. ����");
        System.out.println("2. ʹ�ü���");
        System.out.println("3. ����");
        System.out.println("4. �����ж�");
    }
    
    private int waitPlayerAction() {
        // TODO: �ȴ���Ҳ���������ʹ��Scanner��ȡ����̨����
        return 0;
    }
    
    private void playCard() {
        // ��ʾ����
        System.out.println("��ѡ����ƣ�");
        for (int i = 0; i < this.handCards.size(); i++) {
            System.out.println((i + 1) + ". " + this.handCards.get(i).getName());
        }
        
        // �ȴ����ѡ�����
        int index = this.waitPlayerAction();
        if (index < 1 || index > this.handCards.size()) {
            // ��Чѡ��
            return;
        }
        
        // ����
        Card card = this.handCards.get(index - 1);
        this.handCards.remove(card);
        card.effect();
    }
    
    private void useSkill() {
        // TODO: ʹ�ü��ܵĴ���
    }
    
    private void drawCard(int num) {
        // �ӿ��Ƴ��г�ȡnum�ſ��ƣ������������
        for (int i = 0; i < num; i++) {
            Card card = this.cardPool.get(0);
            this.cardPool.remove(card);
            this.handCards.add(card);
        }
    }