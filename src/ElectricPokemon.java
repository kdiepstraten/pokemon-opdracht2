import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private List<String> attacks = Arrays.asList("thunder", "voltTackle", "electroBall", "thunderPunch");
    public ElectricPokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, "Pokebrocks", sound, "electric");
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Thunder on " + enemy.getName());
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Thunder on " + enemy.getName());
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }
    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Thunder on " + enemy.getName());
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "electric" -> {
                System.out.println(this.getName() + " does 10 damage to hp");
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }
    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Thunder on " + enemy.getName());
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 40 damage to hp");
                enemy.setHp(getHp() - 40);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 30 damage to hp");
                enemy.setHp(getHp() - 30);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 20 damage to hp");
                enemy.setHp(getHp() - 20);
            }
            case "electric" -> {
                System.out.println("Gives a boost to hp " + enemy.getName());
                enemy.setHp(getHp() + 10);
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
