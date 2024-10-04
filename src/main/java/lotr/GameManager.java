package lotr;
public class GameManager {
    public void fight(Character c1, Character c2) {
        String name1 = c1.getClass().getSimpleName();
        String name2 = c2.getClass().getSimpleName();
        if (c2.getHp() == 0 && c1.getHp() == 0) {
            System.out.println("The fight can not be held because " + "fighter1(" + name1 + ")" + " and " + "fighter2(" + name2+ ")" + " are dead");
        }
        else if (c1.getHp() == 0) {
            System.out.println("The fight can not be held because " + "fighter1(" + name1 + ")" + " is dead");
        }
        else if (c2.getHp() == 0) {
            System.out.println("The fight can not be held because " + "fighter2(" + name2+ ")" + " is dead");
        }
        while (c1.getHp() != 0 && c2.getHp() != 0) {
            System.out.println("fighter1(" + name1 + ")" + String.format(" hp: %d", c1.getHp()));
            System.out.println("fighter2(" + name2+ ")" + String.format(" hp: %d", c2.getHp()));
            c1.kick(c2);
            if (c2.getHp() == 0) {
                System.out.println("fighter2(" + name2+ ")" + " was killed");
            }
            c2.kick(c1);
            if (c1.getHp() == 0) {
                System.out.println("fighter1(" + name1 + ")" + " was killed");
            }
        }
        
    }
}