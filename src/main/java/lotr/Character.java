package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;


    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public String ToString() {
        return this.getClass().getName() + "{}";
    }

    public void setHp(int newHp) {
        hp = Math.max(newHp, 0);
    }

    public void setPower(int newPower) {
        power = Math.max(newPower, 0);
    }
}
