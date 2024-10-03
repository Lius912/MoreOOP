package lotr;

import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public class CharacterFactory {
    public Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> characters = reflections.getSubTypesOf(Character.class);
        try {
            int rand_int = new Random().nextInt(0, characters.size());
            int i = 0;
            for (Class<? extends Character> class1 : characters) {
                if (i == rand_int) {
                    return class1.getDeclaredConstructor().newInstance();
                }
                i++;
            }
        }
        catch (Exception e) {
            return null;
        }
        return null;
    }
}
