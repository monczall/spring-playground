package dev.monczall.springplayground.pokemon;

import dev.monczall.springplayground.pokemon.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pokemons")
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("")
    public List<Pokemon> getAllPokemons() {
        return pokemonService.getAllPokemons();
    }
}
