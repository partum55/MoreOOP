import java.util.Random;

public class King extends Noble {
    private static final Random random = new Random();
    public King() {
        super(5, 15, 5, 15);
    }

    public void kick(Character target) {
        target.setHp(target.getHp() - random.nextInt(this.getPower() + 1));
    }
}
