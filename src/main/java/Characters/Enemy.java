package Characters;

public class Enemy {
    private String enemyName;
    private int damage;

    public Enemy() {
    }

    public Enemy(String enemyName, int health, int damage) {
        super(health);
        this.enemyName = enemyName;
        this.damage = damage;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
