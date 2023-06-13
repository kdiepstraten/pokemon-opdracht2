import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{
    String name;
    String town;


    public PokemonGymOwner(String user, List<Pokemon> pokemons, String name, String town) {
        super(user, pokemons);
        this.name = name;
        this.town = town;
    }
}
