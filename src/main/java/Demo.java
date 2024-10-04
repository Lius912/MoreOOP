import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;

public class Demo {
    public static void main(String args[]) {
        Hobbit h = new Hobbit();
        Elf e = new Elf();
        GameManager g = new GameManager();
        g.fight(e, h);
        g.fight(e, h);
    }
}
