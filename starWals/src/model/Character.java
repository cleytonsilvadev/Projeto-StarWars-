package model;

public abstract class Character {

    private int HP;
    private int attack;

    public Character() {

    }
    public Character(int HP, int attack) {
        this.HP = HP;
        this.attack = attack;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public abstract void attack(Padawan padawan, DarthBane darthBane);

}
