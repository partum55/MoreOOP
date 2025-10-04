public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character target) {
        if (this.getPower() > target.getPower()) {
            target.setHp(0);
        } else {
            target.setPower(target.getPower() - 1);
        }
    }
}
