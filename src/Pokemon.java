import java.util.List;

abstract public class Pokemon {
    private final String name;
    private final Integer level;
    private final Integer hp;
    private final String food;
    private final String sound;


    public Pokemon(String name, Integer level, Integer hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;

    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }







}
