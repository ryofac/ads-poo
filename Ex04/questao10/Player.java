package questao10;

class Player extends Entity {
    String name;
    private int level = 1;
    private int exp = 500;

    private void raiseLevel() {
        level++;
        updateStrenght();
        System.out.println("Player " + this.name + "está agora no nível " + this.level);
    }

    private void updateStrenght() {
        this.strenght = level * 10;
    }

    Player(String name) {
        super(100, 10);
        this.name = name;

    }

    void gainExp(int amount) {
        this.exp += amount;
        if (exp > level * 10) {
            raiseLevel();
        }

    }

    void getStatus() {
        System.out.println("PLAYER: " + this.name +
                "\nLEVEL: " + this.level +
                "\nEXP POINTS: " + this.exp);
    }

}
