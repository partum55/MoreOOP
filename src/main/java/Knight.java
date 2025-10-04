import java.util.Random;

public class Knight extends Noble {
    private static final Random Random = new Random();
    public Knight() { super(2, 12, 2, 12); }

    public void kick(Character target) {
        target.setHp(target.getHp() - Random.nextInt(this.getPower()) + 1);
    }
}
