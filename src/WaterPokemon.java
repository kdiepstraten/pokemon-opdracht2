import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private List<String> attacks = Arrays.asList("hydroPump", "hydroCanon", "surf", "raindance");

    public WaterPokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, "Pokeflakes", sound, "water");
    }


    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform HydroPump on " + enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Hydro Canon on " + enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }
    void surf(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Surf on " + enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }
    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Rain Dance on " + enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "electric" -> {
                System.out.println("Has no effect on " + enemy.getName());

            }
            case "grass" -> {
                System.out.println("Gives a boost to hp " + enemy.getName());
                enemy.setHp(getHp() + 20);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
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
