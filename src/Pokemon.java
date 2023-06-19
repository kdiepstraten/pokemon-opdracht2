import java.util.List;

abstract public class Pokemon {
    private final String name;
    private final Integer level;
    private Integer hp;
    private final String food;
    private final String sound;
    private final String type;



    public Pokemon(String name, Integer level, Integer hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;

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

    public String getType() {
        return type;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

}
