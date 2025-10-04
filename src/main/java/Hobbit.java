public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character target) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit is crying!");
    }
}
