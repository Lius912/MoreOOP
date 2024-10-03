package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (getPower() < c.getPower()) {
            setPower(getPower() - 1);
        }
        else {
            c.setHp(0);
        }
    }
}
