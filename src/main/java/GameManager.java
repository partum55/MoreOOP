public class GameManager {
    
    public void fight(Character c1, Character c2) {
        System.out.println("=== FIGHT BEGINS ===");
        System.out.println("Fighter 1: " + c1);
        System.out.println("Fighter 2: " + c2);
        System.out.println();
        
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("--- Round " + round + " ---");
            
            // Character 1 attacks Character 2
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName() + "!");
            int c2HpBefore = c2.getHp();
            int c2PowerBefore = c2.getPower();
            c1.kick(c2);
            
            if (c2.getHp() < c2HpBefore) {
                System.out.println(c2.getClass().getSimpleName() + " lost " + (c2HpBefore - c2.getHp()) + " HP!");
            }
            if (c2.getPower() < c2PowerBefore) {
                System.out.println(c2.getClass().getSimpleName() + " lost " + (c2PowerBefore - c2.getPower()) + " power!");
            }
            System.out.println(c2.getClass().getSimpleName() + " status: " + c2);
            
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " has been defeated!");
                break;
            }
            
            System.out.println();
            
            // Character 2 attacks Character 1
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName() + "!");
            int c1HpBefore = c1.getHp();
            int c1PowerBefore = c1.getPower();
            c2.kick(c1);
            
            if (c1.getHp() < c1HpBefore) {
                System.out.println(c1.getClass().getSimpleName() + " lost " + (c1HpBefore - c1.getHp()) + " HP!");
            }
            if (c1.getPower() < c1PowerBefore) {
                System.out.println(c1.getClass().getSimpleName() + " lost " + (c1PowerBefore - c1.getPower()) + " power!");
            }
            System.out.println(c1.getClass().getSimpleName() + " status: " + c1);
            
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has been defeated!");
                break;
            }
            
            System.out.println();
            round++;
        }
        
        System.out.println("=== FIGHT ENDED ===");
        if (c1.isAlive()) {
            System.out.println("Winner: " + c1.getClass().getSimpleName());
        } else {
            System.out.println("Winner: " + c2.getClass().getSimpleName());
        }
    }
}

