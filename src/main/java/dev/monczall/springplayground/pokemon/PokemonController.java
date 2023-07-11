package dev.monczall.springplayground.pokemon;

import dev.monczall.springplayground.catching.entities.PokemonCatch;
import dev.monczall.springplayground.pokemon.entities.Pokemon;
import dev.monczall.springplayground.trainer.entities.Trainer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public String get(@Valid @RequestBody PokemonCatch pokemon) {
        return "";
    }
}
