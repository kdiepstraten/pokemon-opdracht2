import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "Inferno");

    public FirePokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, "firenougats", sound, "fire");


    }


    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " preform Fire Lash on " + enemy.getName());
        switch (enemy.getType()){
            case "grass" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " preform Flame Thrower on " + enemy.getName());
        switch (enemy.getType()){
            case "grass" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " preform Pyro Ball on " + enemy.getName());
        switch (enemy.getType()){
            case "grass" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " preform Inferno on " + enemy.getName());
        switch (enemy.getType()){
            case "grass" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    public void feed(String food){
        if (food.equals(this.getFood())){
            this.setHp(getHp() + 50);
            System.out.println("Yummy! Hp is " + this.getHp() );
        }
    }
    public List<String> getAttacks() {
        return attacks;
    }
}
