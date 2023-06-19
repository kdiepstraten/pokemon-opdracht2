import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed","leaveBlade");


    public GrassPokemon(String name, Integer level, Integer hp, String food, String sound) {
        super(name, level, hp, "Pokeleafs", sound, "grass");

    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Leafstorm on " + enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(this.getName() + " does 40 damage on " + enemy.getName());
                enemy.setHp(getHp() - 40);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 30 damage on " + enemy.getName());
                enemy.setHp(getHp() - 30);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 20 damage on " + enemy.getName());
                enemy.setHp(getHp() - 20);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 10 damage on " + enemy.getName());
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Solar Beam on " + enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(this.getName() + " does 40 damage on " + enemy.getName());
                enemy.setHp(getHp() - 40);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 30 damage on " + enemy.getName());
                enemy.setHp(getHp() - 30);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 20 damage on " + enemy.getName());
                enemy.setHp(getHp() - 20);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 10 damage on " + enemy.getName());
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");

    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Leech Seed on " + enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(this.getName() + " does 40 damage on " + enemy.getName());
                enemy.setHp(getHp() - 40);
                System.out.println(this.getName() + " gets 40 hp");
                this.setHp(getHp() + 40);
                System.out.println(this.getName() + " has " + this.getHp());
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 30 damage on " + enemy.getName());
                enemy.setHp(getHp() - 30);
                System.out.println(this.getName() + " gets 30 hp");
                this.setHp(getHp() + 30);
                System.out.println(this.getName() + " has " + this.getHp());
            }
            case "water" -> {
                System.out.println(this.getName() + " does 20 damage on " + enemy.getName());
                enemy.setHp(getHp() - 20);
                System.out.println(this.getName() + " gets 20 hp");
                this.setHp(getHp() + 20);
                System.out.println(this.getName() + " has " + this.getHp());
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 10 damage on " + enemy.getName());
                enemy.setHp(getHp() - 10);
                System.out.println(this.getName() + " gets 10 hp");
                this.setHp(getHp() + 10);
                System.out.println(this.getName() + " has " + this.getHp());
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");

    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(this.getName() + " preform Leaf Blade on " + enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(this.getName() + " does 40 damage on " + enemy.getName());
                enemy.setHp(getHp() - 40);
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 30 damage on " + enemy.getName());
                enemy.setHp(getHp() - 30);
            }
            case "water" -> {
                System.out.println(this.getName() + " does 20 damage on " + enemy.getName());
                enemy.setHp(getHp() - 20);
            }
            case "grass" -> {
                System.out.println(this.getName() + " does 10 damage on " + enemy.getName());
                enemy.setHp(getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }


    public List<String> getAttacks() {
        return attacks;
    }
}
