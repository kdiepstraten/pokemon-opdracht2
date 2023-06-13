import java.util.List;

abstract public class Pokemon {
    private final String name;
    private final Integer level;
    private final Integer hp;
    private final String food;
    private final String sound;
    private String type;
    private Integer attacks;

    public Pokemon(String name, Integer level, Integer hp, String food, String sound, String type, Integer attacks) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
        this.attacks = attacks;
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

    public Integer getAttacks() {
        return attacks;
    }

    public void enteredTheGym(PokemonTrainer player1){

    }
    public void printPokemon(List<Pokemon> pokemons){

    }
    public Pokemon selectPokemon(String pokemon, PokemonTrainer trainer){

    }
    public void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon){

    }
    public Pokemon chooseGymPokemon(PokemonGymOwner gymOwner){

    }
    public Pokemon choosePokemon(PokemonTrainer trainer){

    }
    public int randomAttackByGymOwner(){

    }
    public String chooseAttackPlayer(Pokemon p){

    }
    public void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack){

    }
    public void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon){

    }
    public void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym){

    }

}
