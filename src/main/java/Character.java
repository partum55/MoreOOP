import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    private int hp;
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public void kick(Character target) {
        // c is the character who is kicking
        // t is the character who is being kicked
    }

    boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
