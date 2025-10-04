import lombok.Setter;
import lombok.Getter;

@Getter
public abstract class Character {
    private int hp;
    @Setter
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public abstract void kick(Character target);

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
