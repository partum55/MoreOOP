import java.util.Random;

public class CharacterFactory {
    private static final Random random = new Random();

    public Character createCharacter() {
        int type = random.nextInt(4); // 0-3 for four character types

        return switch (type) {
            case 1 -> new Elf();
            case 2 -> new King();
            case 3 -> new Knight();
            default -> new Hobbit();
        };
    }
}
