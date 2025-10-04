import java.util.Random;

public class Noble extends Character {
    private static final Random random = new Random();
    private int minHp;
    private int maxHp;
    private int minPower;
    private int maxPower;

    public Noble(int minHp, int maxHp, int minPower, int maxPower) {
        super(random.nextInt(maxHp - minHp + 1) + minHp, random.nextInt(maxPower - minPower + 1) + minPower);
    }

    @Override
    public void kick(Character target) {
        target.setHp(target.getHp() - random.nextInt(this.getPower() + 1));
    }
}
