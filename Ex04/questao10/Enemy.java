package questao10;

class Enemy extends Entity {
    String type;
    String localStrenght;

    Enemy(String type) {
        super(10, 10);
        this.type = type;
        switch (type) {
            case "bug":
                this.strenght = 10;
                this.lifePoints = 40;
                break;
            case "giant":
                this.strenght = 80;
                this.lifePoints = 300;
                break;
        }

    }
}