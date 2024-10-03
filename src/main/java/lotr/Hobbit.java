package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    public void toCry() {
        System.out.println("Crying");
    }
    
}
