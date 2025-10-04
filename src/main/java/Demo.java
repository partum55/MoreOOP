public class Demo {
    public static void main(String[] args) {
        // Create character factory
        CharacterFactory factory = new CharacterFactory();

        // Create random characters
        Character fighter1 = factory.createCharacter();
        Character fighter2 = factory.createCharacter();

        // Create game manager and start fight
        GameManager gameManager = new GameManager();
        gameManager.fight(fighter1, fighter2);

        System.out.println("\n\n=== ANOTHER FIGHT ===\n");

        // Another fight with different characters
        Character fighter3 = factory.createCharacter();
        Character fighter4 = factory.createCharacter();
        gameManager.fight(fighter3, fighter4);
    }
}
