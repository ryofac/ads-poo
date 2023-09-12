package questao10;

public class Entity {
    protected int lifePoints;
    protected int strenght;

    Entity(int lifePoints, int strenght) {
        this.lifePoints = lifePoints;
        this.strenght = strenght;
    }

    void attack(Entity ent, int damage) {
        int attackValue = damage * this.strenght / 100;
        if (damage - attackValue >= 0) {
            ent.take_damage(attackValue);
        }
        return;
    }

    void take_damage(int amount) {
        lifePoints -= amount;
    }

    int get_life() {
        return this.lifePoints;
    }

    boolean is_alive() {
        return lifePoints > 0;
    }

}
